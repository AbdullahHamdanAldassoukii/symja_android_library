package org.matheclipse.core.patternmatching;

import java.util.List;

import org.matheclipse.core.convert.AST2Expr;
import org.matheclipse.core.generic.BinaryFunctorImpl;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.visit.HashValueVisitor;
import org.matheclipse.parser.client.Parser;
import org.matheclipse.parser.client.SyntaxError;
import org.matheclipse.parser.client.ast.ASTNode;

import com.google.common.collect.ArrayListMultimap;

/**
 * Match two arguments of an <code>Orderless</code> AST into a new resulting expression.
 * 
 * @see HashedPatternRules
 */
public class HashedOrderlessMatcher {
	ArrayListMultimap<Integer, AbstractHashedPatternRules> hashRuleMap;
	private final boolean fDefaultHashCode;

	public HashedOrderlessMatcher(boolean defaultHashCode) {
		this.fDefaultHashCode = defaultHashCode;
		this.hashRuleMap = ArrayListMultimap.create();
	}

	/**
	 * Define the rule for the <code>Orderless</code> operator <b>OP</b>. <code>OP[lhs1Str, rhsStr, ....] := OP[rhsStr, ...]</code>
	 * 
	 * @param lhs1Str
	 * @param lhs2Str
	 * @param rhsStr
	 * @throws SyntaxError
	 */
	public void setUpHashRule(final String lhs1Str, final String lhs2Str, final String rhsStr) throws SyntaxError {
		setUpHashRule(lhs1Str, lhs2Str, rhsStr, null);
	}

	public void setUpHashRule(final String lhs1Str, final String lhs2Str, final BinaryFunctorImpl<IExpr> function)
			throws SyntaxError {
		final Parser parser = new Parser();
		ASTNode parsedAST = parser.parse(lhs1Str);
		final IExpr lhs1 = AST2Expr.CONST.convert(parsedAST);
		parsedAST = parser.parse(lhs2Str);
		final IExpr lhs2 = AST2Expr.CONST.convert(parsedAST);
		setUpHashRule(lhs1, lhs2, function);
	}

	public void setUpHashRule(final String lhs1Str, final String lhs2Str, final String rhsStr, final String conditionStr)
			throws SyntaxError {
		final Parser parser = new Parser();
		ASTNode parsedAST = parser.parse(lhs1Str);
		final IExpr lhs1 = AST2Expr.CONST.convert(parsedAST);
		parsedAST = parser.parse(lhs2Str);
		final IExpr lhs2 = AST2Expr.CONST.convert(parsedAST);
		parsedAST = parser.parse(rhsStr);
		final IExpr rhs = AST2Expr.CONST.convert(parsedAST);
		IExpr condition = null;
		if (conditionStr != null) {
			parsedAST = parser.parse(conditionStr);
			condition = AST2Expr.CONST.convert(parsedAST);
		}
		setUpHashRule(lhs1, lhs2, rhs, condition);
	}

	/**
	 * Define the rule for the <code>Orderless</code> operator <b>OP</b>.
	 * <code>OP[lhs1Str, rhsStr, ....] := OP[rhsStr, ...] /; condition</code>
	 * 
	 * @param lhs1
	 * @param lhs2
	 * @param rhs
	 */
	public void setUpHashRule(final IExpr lhs1, final IExpr lhs2, final IExpr rhs) {
		setUpHashRule(lhs1, lhs2, rhs, null);
	}

	/**
	 * Define the rule for the <code>Orderless</code> operator <b>OP</b>.
	 * <code>OP[lhs1Str, rhsStr, ....] := OP[rhsStr, ...] /; condition</code>
	 * 
	 * @param lhs1
	 * @param lhs2
	 * @param rhs
	 * @param condition
	 */
	public void setUpHashRule(final IExpr lhs1, final IExpr lhs2, final IExpr rhs, final IExpr condition) {
		AbstractHashedPatternRules hashRule = new HashedPatternRules(lhs1, lhs2, rhs, condition, fDefaultHashCode);
		hashRuleMap.put(hashRule.hashCode(), hashRule);
	}

	public void setUpHashRule(final IExpr lhs1, final IExpr lhs2, final BinaryFunctorImpl<IExpr> function) {
		AbstractHashedPatternRules hashRule = new HashedPatternFunction(lhs1, lhs2, function, fDefaultHashCode);
		hashRuleMap.put(hashRule.hashCode(), hashRule);
	}

	/**
	 * Evaluate an <code>Orderless</code> AST with the defined <code>HashedPatternRules</code>.
	 * 
	 * @param orderlessAST
	 * @return
	 * @see HashedPatternRules
	 */
	public IAST evaluate(final IAST orderlessAST) {
		int[] hashValues = new int[(orderlessAST.size() - 1)];
		if (fDefaultHashCode) {
			for (int i = 0; i < hashValues.length; i++) {
				hashValues[i] = orderlessAST.get(i + 1).head().hashCode();
			}
		} else {
			HashValueVisitor v = new HashValueVisitor();
			for (int i = 0; i < hashValues.length; i++) {
				hashValues[i] = orderlessAST.get(i + 1).accept(v);
				v.setUp();
			}
		}
		return evaluateHashedValues(orderlessAST, hashValues);
	}

	private IAST evaluateHashedValues(final IAST orderlessAST, int[] hashValues) {
		boolean evaled = false;
		IAST result = orderlessAST.copyHead();
		for (int i = 0; i < hashValues.length; i++) {
			if (hashValues[i] == 0) {
				// already used entry
				continue;
			}
			evaled: for (int j = i + 1; j < hashValues.length; j++) {
				if (hashValues[j] == 0) {
					// already used entry
					continue;
				}
				final List<AbstractHashedPatternRules> hashRuleList = hashRuleMap.get(AbstractHashedPatternRules.calculateHashcode(
						hashValues[i], hashValues[j]));
				if (hashRuleList != null) {
					for (AbstractHashedPatternRules hashRule : hashRuleList) {

						if (!hashRule.isPattern1() && !hashRule.isPattern2()) {
							if (hashValues[i] != hashRule.getHash1() || hashValues[j] != hashRule.getHash2()) {
								if (hashValues[i] != hashRule.getHash2() || hashValues[j] != hashRule.getHash1()) {
									// hash code of both entries aren't matching
									continue;
								}

								if (updateHashValues(result, orderlessAST, hashRule, hashValues, j, i)) {
									evaled = true;
									break evaled;
								}
								continue;
							}

							if (updateHashValues(result, orderlessAST, hashRule, hashValues, i, j)) {
								evaled = true;
								break evaled;
							}

							if (hashValues[i] != hashRule.getHash2() || hashValues[j] != hashRule.getHash1()) {
								// hash code of both entries aren't matching
								continue;
							}

							if (updateHashValues(result, orderlessAST, hashRule, hashValues, j, i)) {
								evaled = true;
								break evaled;
							}
							continue;

						}

						if (updateHashValues(result, orderlessAST, hashRule, hashValues, i, j)) {
							evaled = true;
							break evaled;
						}

						if (updateHashValues(result, orderlessAST, hashRule, hashValues, j, i)) {
							evaled = true;
							break evaled;
						}
					}
				}
			}
		}

		if (evaled) {
			// append rest of unevaluated arguments
			for (int i = 0; i < hashValues.length; i++) {
				if (hashValues[i] != 0) {
					result.add(orderlessAST.get(i + 1));
				}
			}
			return result;
		}
		return null;
	}

	public boolean updateHashValues(IAST result, final IAST orderlessAST, AbstractHashedPatternRules hashRule, int[] hashValues,
			int i, int j) {
		IExpr temp;
		if ((temp = hashRule.evalDownRule(orderlessAST.get(i + 1), orderlessAST.get(j + 1))) != null) {
			hashValues[i] = 0;
			hashValues[j] = 0;
			result.add(temp);
			return true;
		}
		return false;
	}
}
