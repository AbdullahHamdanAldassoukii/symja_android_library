package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctions.*;

import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;
/** 
 * UtilityFunctions rules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class UtilityFunctions1 { 
  public static IAST RULES = List( 
ISetDelayed(GE(u_,v_,w_),
    And(GE(u,v),GE(v,w))),
ISetDelayed(IndependentQ(u_,x_Symbol),
    FreeQ(u,x)),
ISetDelayed(SplitFreeFactors(u_,x_Symbol),
    If(ProductQ(u),Map(Function(If(FreeQ(Slot1,x),List(Slot1,C1),List(C1,Slot1))),u),If(FreeQ(u,x),List(u,C1),List(C1,u)))),
ISetDelayed(SplitFreeTerms(u_,x_Symbol),
    If(SumQ(u),Map(Function(SplitFreeTerms(Slot1,x)),u),If(FreeQ(u,x),List(u,C0),List(C0,u)))),
ISetDelayed(SplitFactorsOfTerms(u_,x_Symbol),
    Module(List(Set($s("lst"),SplitFreeTerms(u,x)),v,w),CompoundExpression(CompoundExpression(CompoundExpression(Set(v,Part($s("lst"),C1)),Set(w,Part($s("lst"),C2))),If(ZeroQ(w),Set($s("lst"),List()),If(SumQ(w),CompoundExpression(CompoundExpression(Set($s("lst"),Map(Function(SplitFreeFactors(Slot1,x)),Apply($s("List"),w))),Set($s("lst"),Map(Function(Prepend(SplitFreeFactors(Regularize(Part(Slot1,C2),x),x),Part(Slot1,C1))),$s("lst")))),Set($s("lst"),Map(Function(List(Times(Part(Slot1,C1),Part(Slot1,C2)),Part(Slot1,C3))),$s("lst")))),CompoundExpression(CompoundExpression(Set($s("lst"),SplitFreeFactors(w,x)),Set($s("lst"),Prepend(SplitFreeFactors(Regularize(Part($s("lst"),C2),x),x),Part($s("lst"),C1)))),Set($s("lst"),List(List(Times(Part($s("lst"),C1),Part($s("lst"),C2)),Part($s("lst"),C3)))))))),If(ZeroQ(v),$s("lst"),Prepend($s("lst"),List(C1,v)))))),
ISetDelayed(SplitMonomialTerms(u_,x_Symbol),
    Map(Function(If(Or(FreeQ(Slot1,x),MatchQ(Slot1,Condition(Times(a_DEFAULT,Power(x,n_DEFAULT)),FreeQ(List(a,n),x)))),List(Slot1,C0),List(C0,Slot1))),u)),
ISetDelayed(LinearQ(u_,x_Symbol),
    And(IntPolynomialQ(u,x),SameQ(Exponent(u,x),C1))),
ISetDelayed(QuadraticQ(u_,x_Symbol),
    And(IntPolynomialQ(u,x),SameQ(Exponent(u,x),C2))),
ISetDelayed(MonomialQ(u_,x_Symbol),
    MatchQ(u,Condition(Power(x,n_DEFAULT),FreeQ(n,x)))),
ISetDelayed(BinomialQ(u_,x_Symbol),
    NotFalseQ(BinomialTest(u,x))),
ISetDelayed(MonomialSumQ(u_,x_Symbol),
    And(SumQ(u),Catch(CompoundExpression(Scan(Function(If(Or(FreeQ(Slot1,x),MonomialQ(Part(SplitFreeFactors(Slot1,x),C2),x)),Null,Throw(False))),u),True)))),
ISetDelayed(PolynomialTermQ(u_,x_Symbol),
    Or(FreeQ(u,x),MatchQ(u,Condition(Times(a_DEFAULT,Power(x,n_DEFAULT)),And(And(FreeQ(a,x),IntIntegerQ(n)),Greater(n,C0)))))),
ISetDelayed(PolynomialTerms(u_,x_Symbol),
    Map(Function(If(PolynomialTermQ(Slot1,x),Slot1,C0)),u)),
ISetDelayed(NonpolynomialTerms(u_,x_Symbol),
    Map(Function(If(PolynomialTermQ(Slot1,x),C0,Slot1)),u)),
ISetDelayed(BinomialTest(u_,x_Symbol),
    If(SameQ(u,x),List(C0,C1,C1),If(FreeQ(u,x),List(C0,u,C0),If(PowerQ(u),If(And(SameQ(Part(u,C1),x),FreeQ(Part(u,C2),x)),List(C0,C1,Part(u,C2)),False),Module(List($s("lst1"),$s("lst2")),If(ProductQ(u),CompoundExpression(Set($s("lst1"),BinomialTest(First(u),x)),If(FalseQ($s("lst1")),False,CompoundExpression(Set($s("lst2"),BinomialTest(Rest(u),x)),If(FalseQ($s("lst2")),False,Module(List(a,b,c,d,m,n),CompoundExpression(CompoundExpression(Set(List(a,b,m),$s("lst1")),Set(List(c,d,n),$s("lst2"))),If(SameQ(m,C0),List(Times(b,c),Times(b,d),n),If(SameQ(n,C0),List(Times(a,d),Times(b,d),m),If(SameQ(a,C0),If(SameQ(c,C0),List(C0,Times(b,d),Plus(m,n)),If(SameQ(Plus(m,n),C0),List(Times(b,d),Times(b,c),m),False)),If(SameQ(c,C0),If(SameQ(Plus(m,n),C0),List(Times(b,d),Times(a,d),n),False),False)))))))))),If(SumQ(u),CompoundExpression(Set($s("lst1"),BinomialTest(First(u),x)),If(FalseQ($s("lst1")),False,CompoundExpression(Set($s("lst2"),BinomialTest(Rest(u),x)),If(FalseQ($s("lst2")),False,Module(List(a,b,c,d,m,n),CompoundExpression(CompoundExpression(Set(List(a,b,m),$s("lst1")),Set(List(c,d,n),$s("lst2"))),If(SameQ(m,C0),List(Plus(b,c),d,n),If(SameQ(n,C0),List(Plus(a,d),b,m),If(SameQ(m,n),List(Plus(a,c),Plus(b,d),m),False))))))))),False))))))),
ISetDelayed(PerfectPowerTest(u_,x_Symbol),
    If(IntPolynomialQ(u,x),Module(List(Set($s("lst"),FactorSquareFreeList(u)),Set($s("gcd"),C0),Set(v,C1)),CompoundExpression(CompoundExpression(If(SameQ(Part($s("lst"),C1),List(C1,C1)),Set($s("lst"),Rest($s("lst")))),Scan(Function(Set($s("gcd"),GCD($s("gcd"),Part(Slot1,C2)))),$s("lst"))),If(Greater($s("gcd"),C1),CompoundExpression(Scan(Function(Set(v,Times(v,Power(Part(Slot1,C1),Times(Part(Slot1,C2),Power($s("gcd"),CN1)))))),$s("lst")),Power(Expand(v),$s("gcd"))),False))),False)),
ISetDelayed(RationalFunctionQ(u_,x_Symbol),
    If(AtomQ(u),True,If(IntegerPowerQ(u),RationalFunctionQ(Part(u,C1),x),If(Or(ProductQ(u),SumQ(u)),Catch(CompoundExpression(Scan(Function(If(RationalFunctionQ(Slot1,x),Null,Throw(False))),u),True)),If(FreeQ(u,x),True,False))))),
ISetDelayed(RationalFunctionExponents(u_,x_Symbol),
    If(IntPolynomialQ(u,x),List(Exponent(u,x),C0),If(IntegerPowerQ(u),If(Greater(Part(u,C2),C0),Times(Part(u,C2),RationalFunctionExponents(Part(u,C1),x)),Times(CN1,Part(u,C2),Reverse(RationalFunctionExponents(Part(u,C1),x)))),If(ProductQ(u),Plus(RationalFunctionExponents(First(u),x),RationalFunctionExponents(Rest(u),x)),If(SumQ(u),Module(List(Set(v,Together(u))),If(SumQ(v),Module(List($s("lst1"),$s("lst2")),CompoundExpression(CompoundExpression(Set($s("lst1"),RationalFunctionExponents(First(u),x)),Set($s("lst2"),RationalFunctionExponents(Rest(u),x))),List(Max(Plus(Part($s("lst1"),C1),Part($s("lst2"),C2)),Plus(Part($s("lst2"),C1),Part($s("lst1"),C2))),Plus(Part($s("lst1"),C2),Part($s("lst2"),C2))))),RationalFunctionExponents(v,x))),List(C0,C0)))))),
ISetDelayed(AlgebraicFunctionQ(u_,x_Symbol),
    If(Or(AtomQ(u),FreeQ(u,x)),True,If(RationalPowerQ(u),AlgebraicFunctionQ(Part(u,C1),x),If(Or(ProductQ(u),SumQ(u)),Catch(CompoundExpression(Scan(Function(If(AlgebraicFunctionQ(Slot1,x),Null,Throw(False))),u),True)),False)))),
ISetDelayed(QuotientOfLinearsQ(Times(a_,u_),x_),
    Condition(QuotientOfLinearsQ(u,x),FreeQ(a,x))),
ISetDelayed(QuotientOfLinearsQ(Plus(a_,u_),x_),
    Condition(QuotientOfLinearsQ(u,x),FreeQ(a,x))),
ISetDelayed(QuotientOfLinearsQ(Power(u_,CN1),x_),
    QuotientOfLinearsQ(u,x)),
ISetDelayed(QuotientOfLinearsQ(u_,x_),
    Condition(True,LinearQ(u,x))),
ISetDelayed(QuotientOfLinearsQ(Times(Power(v_,CN1),u_),x_),
    Condition(True,And(LinearQ(u,x),LinearQ(v,x)))),
ISetDelayed(QuotientOfLinearsQ(u_,x_),
    Or(SameQ(u,x),FreeQ(u,x))),
ISetDelayed(QuotientOfLinearsParts(Times(a_,u_),x_),
    Condition(Apply(Function(List(Times(a,Slot1),Times(a,Slot2),Slot(C3),Slot(C4))),QuotientOfLinearsParts(u,x)),FreeQ(a,x))),
ISetDelayed(QuotientOfLinearsParts(Plus(a_,u_),x_),
    Condition(Apply(Function(List(Plus(Slot1,Times(a,Slot(C3))),Plus(Slot2,Times(a,Slot(C4))),Slot(C3),Slot(C4))),QuotientOfLinearsParts(u,x)),FreeQ(a,x))),
ISetDelayed(QuotientOfLinearsParts(Power(u_,CN1),x_),
    Apply(Function(List(Slot(C3),Slot(C4),Slot1,Slot2)),QuotientOfLinearsParts(u,x))),
ISetDelayed(QuotientOfLinearsParts(u_,x_),
    Condition(List(Coefficient(u,x,C0),Coefficient(u,x,C1),C1,C0),LinearQ(u,x))),
ISetDelayed(QuotientOfLinearsParts(Times(Power(v_,CN1),u_),x_),
    Condition(List(Coefficient(u,x,C0),Coefficient(u,x,C1),Coefficient(v,x,C0),Coefficient(v,x,C1)),And(LinearQ(u,x),LinearQ(v,x)))),
ISetDelayed(QuotientOfLinearsParts(u_,x_),
    If(SameQ(u,x),List(C0,C1,C1,C0),If(FreeQ(u,x),List(u,C0,C1,C0),CompoundExpression(Print(stringx("QuotientOfLinearParts error!")),List(u,C0,C1,C0))))),
ISetDelayed(ImproperRationalFunctionQ(u_,v_,x_Symbol),
    And(And(And(IntPolynomialQ(u,x),IntPolynomialQ(v,x)),Not(And(MatchQ(u,Condition(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x)),n_DEFAULT),And(FreeQ(List(a,b),x),IntIntegerQ(n)))),MatchQ(v,Condition(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x)),n_DEFAULT),And(FreeQ(List(a,b),x),IntIntegerQ(n))))))),Or(And(QuadraticQ(v,x),GreaterEqual(Exponent(u,x),C2)),MatchQ(v,Condition(Plus(a_,Times(b_DEFAULT,Power(x,n_DEFAULT))),And(And(FreeQ(List(a,b),x),IntIntegerQ(n)),And(Less(C0,n),LessEqual(n,Exponent(u,x))))))))),
ISetDelayed(ExpandImproperFraction(u_,x_Symbol),
    Module(List($s("tmp")),If(NotFalseQ(Set($s("tmp"),ExpandImproperFraction(Numerator(u),Denominator(u),x))),$s("tmp"),If(NotFalseQ(Set($s("tmp"),ExpandImproperFraction(SmartNumerator(u),SmartDenominator(u),x))),$s("tmp"),If(FunctionOfQ(Sin(x),u,x),CompoundExpression(Set($s("tmp"),Regularize(SubstFor(Sin(x),u,x),x)),If(NotFalseQ(Set($s("tmp"),ExpandImproperFraction(Numerator($s("tmp")),Denominator($s("tmp")),x))),Subst($s("tmp"),x,Sin(x)),False)),If(FunctionOfQ(Cos(x),u,x),CompoundExpression(Set($s("tmp"),Regularize(SubstFor(Cos(x),u,x),x)),If(NotFalseQ(Set($s("tmp"),ExpandImproperFraction(Numerator($s("tmp")),Denominator($s("tmp")),x))),Subst($s("tmp"),x,Cos(x)),False)),If(FunctionOfQ(Sinh(x),u,x),CompoundExpression(Set($s("tmp"),Regularize(SubstFor(Sinh(x),u,x),x)),If(NotFalseQ(Set($s("tmp"),ExpandImproperFraction(Numerator($s("tmp")),Denominator($s("tmp")),x))),Subst($s("tmp"),x,Sinh(x)),False)),If(FunctionOfQ(Cosh(x),u,x),CompoundExpression(Set($s("tmp"),Regularize(SubstFor(Cosh(x),u,x),x)),If(NotFalseQ(Set($s("tmp"),ExpandImproperFraction(Numerator($s("tmp")),Denominator($s("tmp")),x))),Subst($s("tmp"),x,Cosh(x)),False)),False)))))))),
ISetDelayed(ExpandImproperFraction(u_,v_,x_Symbol),
    Module(List($s("lst1"),$s("lst2")),CompoundExpression(CompoundExpression(Set($s("lst1"),PolynomialFunctionOf(u,x)),Set($s("lst2"),PolynomialFunctionOf(v,x))),If(And(SameQ(Part($s("lst1"),C1),Part($s("lst2"),C1)),GreaterEqual(Exponent(Part($s("lst1"),C2),x),Exponent(Part($s("lst2"),C2),x))),ReplaceAll(PolynomialDivide(Part($s("lst1"),C2),Part($s("lst2"),C2),x),Rule(x,Part($s("lst1"),C1))),False)))),
ISetDelayed(PolynomialDivide(u_,v_,x_Symbol),
    Prepend(SplitFreeFactors(Regularize(Times(PolynomialRemainder(u,v,x),Power(v,CN1)),x),x),PolynomialQuotient(u,v,x))),
ISetDelayed(SmartNumerator(u_),
    If(MemberQ(List($s("Cot"),$s("Sec"),$s("Csc"),$s("Coth"),$s("Sech"),$s("Csch")),Head(u)),C1,If(And(And(PowerQ(u),IntIntegerQ(Part(u,C2))),MemberQ(List($s("Cot"),$s("Sec"),$s("Csc"),$s("Coth"),$s("Sech"),$s("Csch")),Head(Part(u,C1)))),C1,If(And(And(PowerQ(u),RationalQ(Part(u,C2))),Less(Part(u,C2),C0)),C1,If(ProductQ(u),Map($s("Integrate::SmartNumerator"),u),u))))),
ISetDelayed(SmartDenominator(u_),
    If(MemberQ(List($s("Cot"),$s("Sec"),$s("Csc"),$s("Coth"),$s("Sech"),$s("Csch")),Head(u)),Power(u,CN1),If(And(And(PowerQ(u),IntIntegerQ(Part(u,C2))),MemberQ(List($s("Cot"),$s("Sec"),$s("Csc"),$s("Coth"),$s("Sech"),$s("Csch")),Head(Part(u,C1)))),Power(u,CN1),If(And(And(PowerQ(u),RationalQ(Part(u,C2))),Less(Part(u,C2),C0)),Power(u,CN1),If(ProductQ(u),Map($s("Integrate::SmartDenominator"),u),C1))))),
ISetDelayed(PolynomialFunctionOf(u_,x_Symbol),
    If(AtomQ(u),If(SameQ(u,x),List(x,x),List(C1,u)),If(PositiveIntegerPowerQ(u),Module(List(Set($s("lst"),PolynomialFunctionOf(Part(u,C1),x))),List(Part($s("lst"),C1),Power(Part($s("lst"),C2),Part(u,C2)))),If(ProductQ(u),Module(List(Set($s("lst1"),PolynomialFunctionOf(First(u),x)),Set($s("lst2"),PolynomialFunctionOf(Rest(u),x))),If(SameQ(Part($s("lst1"),C1),C1),List(Part($s("lst2"),C1),Times(Part($s("lst1"),C2),Part($s("lst2"),C2))),If(SameQ(Part($s("lst2"),C1),C1),List(Part($s("lst1"),C1),Times(Part($s("lst1"),C2),Part($s("lst2"),C2))),If(SameQ(Part($s("lst1"),C1),Part($s("lst2"),C1)),List(Part($s("lst1"),C1),Times(Part($s("lst1"),C2),Part($s("lst2"),C2))),List(u,x))))),If(SumQ(u),Module(List(Set($s("lst1"),PolynomialFunctionOf(First(u),x)),Set($s("lst2"),PolynomialFunctionOf(Rest(u),x))),If(SameQ(Part($s("lst1"),C1),C1),List(Part($s("lst2"),C1),Plus(Part($s("lst1"),C2),Part($s("lst2"),C2))),If(SameQ(Part($s("lst2"),C1),C1),List(Part($s("lst1"),C1),Plus(Part($s("lst1"),C2),Part($s("lst2"),C2))),If(SameQ(Part($s("lst1"),C1),Part($s("lst2"),C1)),List(Part($s("lst1"),C1),Plus(Part($s("lst1"),C2),Part($s("lst2"),C2))),List(u,x))))),If(FreeQ(u,x),List(C1,u),List(u,x))))))),
ISetDelayed(Dist(C1,v_),
    v),
ISetDelayed(Dist(u_,v_),
    Condition(Times(CN1,Dist(Times(CN1,u),v)),Less(NumericFactor(u),C0))),
ISetDelayed(Dist(u_,Dist(v_,w_)),
    Dist(Times(u,v),w)),
ISetDelayed(Dist(u_,v_),
    Condition(Map(Function(Dist(u,Slot1)),v),SumQ(v))),
ISetDelayed(Dist(u_,v_),
    Condition(Times(u,v),Or(FreeQ(v,$s("Int")),UnsameQ($s("ShowSteps"),True)))),
ISetDelayed(Dist(u_,Times(v_,w_)),
    Condition(Dist(Times(u,v),w),FreeQ(v,$s("Int")))),
ISetDelayed(Regularize(u_,x_Symbol),
    If(RecognizedFormQ(u,x),u,NormalForm(NormalForm(NormalForm(Simplify(u),x),x),x))),
ISetDelayed(RecognizedFormQ(u_,x_Symbol),
    Or(Or(Or(Or(Or(Or(Or(Or(Or(Or(Or(Or(Or(Or(FreeQ(u,x),MonomialQ(u,x)),MatchQ(u,Condition(Times(a_,v_),And(FreeQ(a,x),RecognizedFormQ(v,x))))),MatchQ(u,Condition(Power($(f_,Plus(a_DEFAULT,Times(b_DEFAULT,x))),n_DEFAULT),And(FreeQ(List(a,b,f),x),IntIntegerQ(n))))),MatchQ(u,Condition(Power(Plus(a_,Times(b_DEFAULT,Power(x,n_DEFAULT))),p_DEFAULT),And(And(FreeQ(List(a,b,n,p),x),IntIntegerQ(n)),Greater(n,C0))))),MatchQ(u,Condition(Times(Power(x,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,Power(x,n_DEFAULT))),p_DEFAULT)),And(And(FreeQ(List(a,b,m,n,p),x),IntIntegerQ(n)),Greater(n,C0))))),MatchQ(u,Condition(Times(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x)),m_DEFAULT),Power(Plus(c_DEFAULT,Times($p(d,true),x)),n_DEFAULT)),FreeQ(List(a,b,c,d,m,n),x)))),MatchQ(u,Condition(Times(Power(x,p_DEFAULT),Power(Plus(a_DEFAULT,Times(b_DEFAULT,x)),m_DEFAULT),Power(Plus(c_DEFAULT,Times($p(d,true),x)),n_DEFAULT)),FreeQ(List(a,b,c,d,m,n,p),x)))),MatchQ(u,Condition(Times(Power(x,m_DEFAULT),Power(Plus(Times(b_DEFAULT,x),Times(c_DEFAULT,Power(x,C2))),n_)),And(FreeQ(List(b,c,m,n),x),Not(IntIntegerQ(n)))))),MatchQ(u,Condition(Power(Plus(a_DEFAULT,Times(b_DEFAULT,x),Times(c_DEFAULT,Power(x,C2))),n_DEFAULT),FreeQ(List(a,b,c,n),x)))),MatchQ(u,Condition(Times(Power(x,m_DEFAULT),Power(Plus(a_,Times(b_DEFAULT,x),Times(c_DEFAULT,Power(x,C2))),n_DEFAULT)),FreeQ(List(a,b,c,m,n),x)))),MatchQ(u,Condition(Times(Plus($p(d),Times($p(e,true),x)),Power(Plus(a_,Times(b_DEFAULT,x),Times(c_DEFAULT,Power(x,C2))),CN1)),FreeQ(List(a,b,c,d,e),x)))),MatchQ(u,Condition(Times(Power(x,m_DEFAULT),Plus($p(d),Times($p(e,true),x)),Power(Plus(a_,Times(b_DEFAULT,x),Times(c_DEFAULT,Power(x,C2))),CN1)),FreeQ(List(a,b,c,d,e),x)))),MatchQ(u,Condition(Times(v_,Plus(a_,Times(b_DEFAULT,x))),And(FreeQ(List(a,b),x),FunctionOfQ(Plus(Times(a,x),Times(b,Rational(C1,C2),Power(x,C2))),v,x))))),MatchQ(u,Condition(Times(Plus(Times(a_DEFAULT,Power(v_,m_DEFAULT)),Times(b_DEFAULT,Power(v_,n_DEFAULT))),Power(Plus(Times(c_DEFAULT,Power(v_,m_DEFAULT)),Times($p(d,true),Power(v_,n_DEFAULT))),CN1)),FreeQ(List(a,b,c,d,m,n),x))))),
ISetDelayed(NormalForm(Times(Power(u_,m_),Power(v_,n_)),x_Symbol),
    Condition(NormalForm(Times(Power(Map(Function(Times(CN1,Slot1)),u),m),Power(Map(Function(Times(CN1,Slot1)),v),n)),x),And(And(And(And(OddQ(List(m,n)),SumQ(u)),SumQ(v)),NegativeCoefficientQ(u)),NegativeCoefficientQ(v)))),
ISetDelayed(NormalForm(u_,x_Symbol),
    Condition(Plus(Coefficient(u,x,C0),Times(Coefficient(u,x,C1),x)),LinearQ(u,x))),
ISetDelayed(NormalForm(Times(a_,u_),x_Symbol),
    Condition(NormalForm(Map(Function(Times(a,Slot1)),u),x),And(FreeQ(a,x),SumQ(u)))),
ISetDelayed(NormalForm(Times(Plus(Times($p(d,true),x_),c_),b_DEFAULT,x_),x_Symbol),
    Condition(Plus(Times(b,c,x),Times(b,d,Power(x,C2))),FreeQ(List(b,c,d),x))),
ISetDelayed(NormalForm(Plus(Times(Plus(Times(Power(x_,n_DEFAULT),$p(d,true)),c_),Power(x_,n_DEFAULT),b_DEFAULT),a_),x_Symbol),
    Condition(Plus(a,Times(b,c,Power(x,n)),Times(b,d,Power(x,Times(C2,n)))),FreeQ(List(a,b,c,d,n),x))),
ISetDelayed(NormalForm(Plus(Times(Power(Plus(Times(Power(x_,n_DEFAULT),b_DEFAULT),a_),C2),$p(d,true)),c_),x_Symbol),
    Condition(Plus(c,Times(Power(a,C2),d),Times(C2,a,b,d,Power(x,n)),Times(Power(b,C2),d,Power(x,Times(C2,n)))),FreeQ(List(a,b,c,d,n),x))),
ISetDelayed(NormalForm(Plus(Times(Power(Plus(Times(Power(x_,n_DEFAULT),b_DEFAULT),a_),C2),$p(d,true)),Times(Power(x_,n_DEFAULT),$p(e,true)),c_DEFAULT),x_Symbol),
    Condition(Plus(c,Times(Power(a,C2),d),Times(Plus(e,Times(C2,a,b,d)),Power(x,n)),Times(Power(b,C2),d,Power(x,Times(C2,n)))),FreeQ(List(a,b,c,d,e,n),x))),
ISetDelayed(NormalForm(Plus(Times(Plus(Times(Power(f_,Plus(Times(g_DEFAULT,x_),$p(e,true))),$p(d,true)),c_),Power(f_,Plus(Times(g_DEFAULT,x_),$p(e,true))),b_DEFAULT),a_),x_Symbol),
    Condition(Plus(a,Times(b,c,Power(f,Plus(e,Times(g,x)))),Times(b,d,Power(f,Plus(Times(C2,e),Times(C2,g,x))))),FreeQ(List(a,b,c,d,e,f,g),x))),
ISetDelayed(NormalForm(Times(Plus(Times(Power(x_,n_DEFAULT),b_DEFAULT),a_),Power(x_,m_DEFAULT),c_DEFAULT),x_Symbol),
    Condition(Times(c,Plus(b,Times(a,Power(x,m)))),And(FreeQ(List(a,b,c,m,n),x),ZeroQ(Plus(m,n))))),
ISetDelayed(NormalForm($(f_,Times(Power(Plus(Times(Power(x_,n_DEFAULT),b_DEFAULT),a_),p_),Power(x_,m_DEFAULT),c_DEFAULT)),x_Symbol),
    Condition($(f,Times(c,Power(Plus(b,Times(a,Power(Power(x,n),CN1))),p))),And(And(FreeQ(List(a,b,c,f,m,n),x),IntIntegerQ(p)),ZeroQ(Plus(m,Times(n,p)))))),
ISetDelayed(NormalForm(Power(Times(Plus(Times(b_DEFAULT,x_),a_),Plus(Times($p(d,true),x_),c_),$p(e,true)),n_),x_Symbol),
    Condition(Power(Plus(Times(a,c,e),Times(Plus(Times(a,d,e),Times(b,c,e)),x),Times(b,d,e,Power(x,C2))),n),And(FreeQ(List(a,b,c,d,e),x),FractionQ(n)))),
ISetDelayed(NormalForm($(f_,u_),x_Symbol),
    Condition($(f,ExpandPolynomial(u,x)),And(FreeQ(f,x),QuadraticPolynomialQ(u,x)))),
ISetDelayed(NormalForm(Power(f_,u_),x_Symbol),
    Condition(Power(f,ExpandPolynomial(u,x)),And(FreeQ(f,x),QuadraticPolynomialQ(u,x)))),
ISetDelayed(NormalForm(Times(Power(f_,v_),Power(g_,w_),u_DEFAULT),x_Symbol),
    Condition(Times(u,Power(E,Sum(Times(Plus(Times(Log(f),Coefficient(v,x,k)),Times(Log(g),Coefficient(w,x,k))),Power(x,k)),List(k,C0,C2)))),And(And(And(And(FreeQ(List(f,g),x),IntPolynomialQ(v,x)),LessEqual(LessEqual(C1,Exponent(v,x)),C2)),IntPolynomialQ(w,x)),LessEqual(LessEqual(C1,Exponent(w,x)),C2)))),
ISetDelayed(NormalForm(Times(Power(f_,Plus(Times(Power(x_,n_DEFAULT),b_DEFAULT),a_DEFAULT)),Power(g_,Plus(Times(Power(x_,n_DEFAULT),$p(d,true)),c_DEFAULT)),u_DEFAULT),x_Symbol),
    Condition(Times(u,Power(E,Plus(Times(a,Log(f)),Times(c,Log(g)),Times(Plus(Times(b,Log(f)),Times(d,Log(g))),Power(x,n))))),FreeQ(List(a,b,c,d,f,g,n),x))),
ISetDelayed(QuadraticPolynomialQ(u_,x_Symbol),
    And(And(IntPolynomialQ(u,x),LessEqual(Exponent(u,x),C2)),Not(MatchQ(u,Condition(Times(a_DEFAULT,Power(v_,C2)),FreeQ(a,x)))))),
ISetDelayed(ExpandPolynomial(u_,x_Symbol),
    Module(List(k),Sum(Times(Coefficient(u,x,k),Power(x,k)),List(k,C0,Exponent(u,x))))),
ISetDelayed(NormalForm(Power(Plus(Times(Power(x_,m_DEFAULT),a_DEFAULT),Times(Power(x_,n_DEFAULT),b_DEFAULT)),p_),x_Symbol),
    Condition(Power(Times(Power(x,m),Plus(a,Times(b,Power(x,Plus(n,Times(CN1,m)))))),p),And(And(And(FreeQ(List(a,b),x),RationalQ(List(m,n,p))),LessEqual(m,n)),Not(Equal(Equal(Times(C2,m),n),C2))))),
ISetDelayed(NormalForm(Plus(Times(a_DEFAULT,v_),Times(b_DEFAULT,v_),u_DEFAULT),x_Symbol),
    Condition(Plus(u,Times(Plus(a,b),v)),And(FreeQ(List(a,b),x),Not(FreeQ(v,x))))),
ISetDelayed(NormalForm(Power(u_,n_),x_Symbol),
    Condition(Module(List(Set(v,Together(u))),Condition(Power(v,n),Not(SumQ(v)))),And(And(SumQ(u),FractionQ(n)),Not(MonomialSumQ(u,x))))),
ISetDelayed(NormalForm(Times(Cos(Times(C2,u_)),Power(Sec(u_),C2)),x_Symbol),
    Condition(Plus(C1,Times(CN1,Power(Tan(u),C2))),Not(FreeQ(u,x)))),
ISetDelayed(NormalForm(Times(Plus(c_,$p(d)),Power(Plus(a_,b_),CN2),u_DEFAULT),x_Symbol),
    Condition(NormalForm(Times(u,Plus(a,Times(CN1,b)),Power(Plus(a,b),CN1)),x),And(ZeroQ(Plus(c,Times(CN1,Power(a,C2)))),ZeroQ(Plus(d,Power(b,C2)))))),
ISetDelayed(NormalForm(u_,x_Symbol),
    If(AtomQ(u),u,If(MatchQ(u,Condition(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x,n_DEFAULT))),FreeQ(List(a,b,n),x))),u,If(MatchQ(u,Condition(Plus(a_DEFAULT,Times(b_DEFAULT,Power(x,n_DEFAULT)),Times(c_DEFAULT,Power(x,m_DEFAULT))),And(FreeQ(List(a,b,c,m,n),x),SameQ(Times(C2,n),m)))),u,Module(List($s("tmp")),CompoundExpression(Set($s("tmp"),MonomialFactor(u,x)),If(NonzeroQ(Part($s("tmp"),C1)),Times(Power(x,Part($s("tmp"),C1)),NormalForm(Part($s("tmp"),C2),x)),Map(Function(NormalForm(Slot1,x)),u)))))))),
ISetDelayed(SimplifyExpression(Times(Power(Plus(Times(Power(x_,n_),b_DEFAULT),a_),p_DEFAULT),Power(x_,m_)),x_Symbol),
    Condition(Times(Power(x,Plus(m,Times(n,p))),Power(Plus(b,Times(a,Power(x,Times(CN1,n)))),p)),And(And(And(FreeQ(List(a,b),x),IntIntegerQ(List(m,n,p))),Less(n,C0)),Or(Equal(Plus(m,Times(n,p),C1),C0),And(And(Less(p,CN1),Greater(Times(CN1,n),C1)),And(LessEqual(Times(CN1,n),Plus(m,Times(n,p))),Less(Plus(m,Times(n,p)),Plus(Times(CN2,n),Times(CN1,C1))))))))),
ISetDelayed(SimplifyExpression(Power(Plus(Times(Power(x_,m_),b_DEFAULT),Times(Power(x_,n_),c_DEFAULT),Times(a_DEFAULT,x_)),CN1),x_Symbol),
    Condition(Power(Times(x,Plus(a,Times(b,Power(x,Plus(m,Times(CN1,C1)))),Times(c,Power(x,Plus(n,Times(CN1,C1)))))),CN1),And(And(And(FreeQ(List(a,b,c),x),IntIntegerQ(List(m,n))),Greater(m,C2)),Equal(Plus(n,Times(CN1,C1)),Times(C2,Plus(m,Times(CN1,C1))))))),
ISetDelayed(SimplifyExpression(Times(Plus(Times(Power(x_,C2),b_DEFAULT),a_DEFAULT),Power(Plus(Times(Power(x_,C2),$p(d,true)),Times(Power(Plus(Times(Power(x_,C2),g_DEFAULT),f_),C1D2),$p(e,true)),c_),CN1)),x_Symbol),
    Condition(Plus(Times(CN1,c,Power(f,CN1)),Times(e,Power(Sqrt(Plus(f,Times(g,Power(x,C2)))),CN1))),And(And(And(FreeQ(List(a,b,c,d,e,f,g),x),ZeroQ(Plus(Times(c,g),Times(CN1,f,d)))),ZeroQ(Plus(b,Times(Power(d,C2),Power(g,CN1))))),ZeroQ(Plus(a,Times(CN1,Power(e,C2)),Times(Power(c,C2),Power(f,CN1))))))),
ISetDelayed(SimplifyExpression(Times(Power(Plus(Times(Power(x_,CN1),a_DEFAULT),Times(c_DEFAULT,x_),b_),CN1),Power(x_,CN1)),x_Symbol),
    Condition(Power(Plus(a,Times(b,x),Times(c,Power(x,C2))),CN1),FreeQ(List(a,b,c),x))),
ISetDelayed(SimplifyExpression(Times(Power(Plus(Times(Power(x_,CN2),a_DEFAULT),Times(Power(x_,CN1),b_DEFAULT),c_),CN1),Power(x_,CN2)),x_Symbol),
    Condition(Power(Plus(a,Times(b,x),Times(c,Power(x,C2))),CN1),FreeQ(List(a,b,c),x))),
ISetDelayed(SimplifyExpression(Times(Power(Plus(Times(Power(x_,m_DEFAULT),a_DEFAULT),Times(Power(x_,p_DEFAULT),b_DEFAULT),Times(Power(x_,q_DEFAULT),c_DEFAULT)),CN1),Power(x_,m_DEFAULT)),x_Symbol),
    Condition(Power(Plus(a,Times(b,x),Times(c,Power(x,C2))),CN1),And(And(And(FreeQ(List(a,b,c),x),IntIntegerQ(List(m,p,q))),Equal(p,Plus(m,C1))),Equal(q,Plus(m,C2))))),
ISetDelayed(SimplifyExpression(u_,x_Symbol),
    If(MatchQ(u,Condition(Times(w_DEFAULT,Power(Plus(a_DEFAULT,Times(b_DEFAULT,v_)),m_DEFAULT),Power(Plus(c_DEFAULT,Times($p(d,true),v_)),n_DEFAULT)),And(And(And(FreeQ(List(a,b,c,d),x),IntIntegerQ(List(m,n))),Less(m,C0)),Less(n,C0)))),u,Module(List(v),CompoundExpression(Set(v,Regularize(u,x)),If(SimplerExpressionQ(v,u,x),v,CompoundExpression(Set(v,Regularize(Cancel(u),x)),If(SimplerExpressionQ(v,u,x),v,u))))))),
ISetDelayed(SimplerExpressionQ(u_,v_,x_),
    Or(LessEqual(SmartLeafCount(u),Times(Rational(C2,C3),SmartLeafCount(v))),And(And(And(And(And(And(IntPolynomialQ(Numerator(u),x),IntPolynomialQ(Denominator(u),x)),IntPolynomialQ(Numerator(v),x)),IntPolynomialQ(Denominator(v),x)),Less(Exponent(Numerator(u),x),Exponent(Numerator(v),x))),Less(Exponent(Denominator(u),x),Exponent(Denominator(v),x))),LessEqual(SmartLeafCount(u),Plus(SmartLeafCount(v),C5))))),
ISetDelayed(SmartLeafCount(u_),
    If(AtomQ(u),C1,Plus(Apply(Plus,Map($s("Integrate::SmartLeafCount"),Apply($s("List"),u))),C1))),
ISetDelayed(TrigSimplify(u_),
    If(AtomQ(u),u,If(SameQ(Head(u),$s("If")),u,TrigSimplifyAux(Map($s("Integrate::TrigSimplify"),u))))),
ISetDelayed(TrigSimplifyAux(Times(Power(Plus(Times(Power(v_,m_DEFAULT),a_DEFAULT),Times(Power(v_,n_DEFAULT),b_DEFAULT)),p_),u_DEFAULT)),
    Condition(Times(u,Power(v,Times(m,p)),Power(TrigSimplifyAux(Plus(a,Times(b,Power(v,Plus(n,Times(CN1,m)))))),p)),And(And(And(Or(TrigQ(v),HyperbolicQ(v)),IntIntegerQ(p)),RationalQ(List(m,n))),Less(m,n)))),
ISetDelayed(TrigSimplifyAux(Plus(Times(Power(Cos(z_),C2),u_DEFAULT),Times(Power(Sin(z_),C2),v_DEFAULT),w_DEFAULT)),
    Condition(Plus(u,w),SameQ(u,v))),
ISetDelayed(TrigSimplifyAux(Plus(Times(Power(Sec(z_),C2),u_DEFAULT),Times(Power(Tan(z_),C2),v_DEFAULT),w_DEFAULT)),
    Condition(Plus(u,w),SameQ(u,Times(CN1,v)))),
ISetDelayed(TrigSimplifyAux(Plus(Times(Power(Csc(z_),C2),u_DEFAULT),Times(Power(Cot(z_),C2),v_DEFAULT),w_DEFAULT)),
    Condition(Plus(u,w),SameQ(u,Times(CN1,v)))),
ISetDelayed(TrigSimplifyAux(Plus(Times(Power(Sin(z_),C2),v_DEFAULT),u_,w_DEFAULT)),
    Condition(Plus(Times(u,Power(Cos(z),C2)),w),SameQ(u,Times(CN1,v)))),
ISetDelayed(TrigSimplifyAux(Plus(Times(Power(Cos(z_),C2),v_DEFAULT),u_,w_DEFAULT)),
    Condition(Plus(Times(u,Power(Sin(z),C2)),w),SameQ(u,Times(CN1,v)))),
ISetDelayed(TrigSimplifyAux(Plus(Times(Power(Tan(z_),C2),v_DEFAULT),u_,w_DEFAULT)),
    Condition(Plus(Times(u,Power(Sec(z),C2)),w),SameQ(u,v)))
  );
}
