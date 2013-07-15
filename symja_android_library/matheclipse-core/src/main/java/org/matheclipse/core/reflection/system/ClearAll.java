package org.matheclipse.core.reflection.system;

import org.matheclipse.core.eval.EvalEngine;
import org.matheclipse.core.eval.exception.Validate;
import org.matheclipse.core.eval.interfaces.ICoreFunctionEvaluator;
import org.matheclipse.core.expression.F;
import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;

public class ClearAll implements ICoreFunctionEvaluator {

	public ClearAll() {
	}

	public IExpr evaluate(final IAST ast) {
		Validate.checkSize(ast, 2);

		ISymbol symbol = (ISymbol) ast.get(1);
		symbol.clearAll(EvalEngine.get());
		return F.Null;
	}

	public IExpr numericEval(final IAST ast) {
		return evaluate(ast);
	}

	public void setUp(ISymbol symbol) {
		symbol.setAttributes(ISymbol.HOLDALL);
	}
}
