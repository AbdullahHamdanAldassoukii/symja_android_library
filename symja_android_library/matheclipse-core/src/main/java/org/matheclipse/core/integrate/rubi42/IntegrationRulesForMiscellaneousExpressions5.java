package org.matheclipse.core.integrate.rubi42;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi42.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi42.UtilityFunctions.*;

import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;
/** 
 * IntegrationRules rules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntegrationRulesForMiscellaneousExpressions5 { 
  public static IAST RULES = List( 
SetDelayed(RationalFunctionExpand($p(u),$p(x,SymbolHead)),
    Module(List(v,w),CompoundExpression(Set(v,ExpandIntegrand(u,x)),If(And(UnsameQ(v,u),Not(MatchQ(u,Condition(Times(Power(x,$p(m,true)),Power(Plus($p(c),Times($p(d,true),x)),$p(p)),Power(Plus($p(a),Times($p(b,true),Power(x,$p(n)))),CN1)),And(And(FreeQ(List(a,b,c,d,p),x),IntegersQ(m,n)),Equal(m,Plus(n,Times(CN1,C1)))))))),v,CompoundExpression(CompoundExpression(Set(v,ExpandIntegrand(RationalFunctionFactors(u,x),x)),Set(w,NonrationalFunctionFactors(u,x))),If(SumQ(v),Map(Function(Times(Slot1,w)),v),Times(v,w))))))),
SetDelayed(AlgebraicFunctionQ($p(u),$p(x,SymbolHead)),
    If(Or(AtomQ(u),FreeQ(u,x)),True,If(RationalPowerQ(u),AlgebraicFunctionQ(Part(u,C1),x),If(Or(ProductQ(u),SumQ(u)),Catch(CompoundExpression(Scan(Function(If(Not(AlgebraicFunctionQ(Slot1,x)),Throw(False))),u),True)),False)))),
SetDelayed(AlgebraicFunctionFactors($p(u),$p(x,SymbolHead)),
    If(ProductQ(u),Map(Function(If(AlgebraicFunctionQ(Slot1,x),Slot1,C1)),u),If(AlgebraicFunctionQ(u,x),u,C1))),
SetDelayed(NonalgebraicFunctionFactors($p(u),$p(x,SymbolHead)),
    If(ProductQ(u),Map(Function(If(AlgebraicFunctionQ(Slot1,x),C1,Slot1)),u),If(AlgebraicFunctionQ(u,x),C1,u))),
SetDelayed(QuotientOfLinearsQ($p(u),$p(x,SymbolHead)),
    If(ListQ(u),Catch(CompoundExpression(Scan(Function(If(Not(QuotientOfLinearsQ(Slot1,x)),Throw(False))),u),True)),And(QuotientOfLinearsP(u,x),$(Function(And(NonzeroQ(Part(Slot1,C2)),NonzeroQ(Part(Slot1,C4)))),QuotientOfLinearsParts(u,x))))),
SetDelayed(QuotientOfLinearsP(Times($p(a),$p(u)),$p(x)),
    Condition(QuotientOfLinearsP(u,x),FreeQ(a,x))),
SetDelayed(QuotientOfLinearsP(Plus($p(a),$p(u)),$p(x)),
    Condition(QuotientOfLinearsP(u,x),FreeQ(a,x))),
SetDelayed(QuotientOfLinearsP(Power($p(u),CN1),$p(x)),
    QuotientOfLinearsP(u,x)),
SetDelayed(QuotientOfLinearsP($p(u),$p(x)),
    Condition(True,LinearQ(u,x))),
SetDelayed(QuotientOfLinearsP(Times(Power($p(v),CN1),$p(u)),$p(x)),
    Condition(True,And(LinearQ(u,x),LinearQ(v,x)))),
SetDelayed(QuotientOfLinearsP($p(u),$p(x)),
    Or(SameQ(u,x),FreeQ(u,x))),
SetDelayed(QuotientOfLinearsParts(Times($p(a),$p(u)),$p(x)),
    Condition(Apply(Function(List(Times(a,Slot1),Times(a,Slot2),Slot(C3),Slot(C4))),QuotientOfLinearsParts(u,x)),FreeQ(a,x))),
SetDelayed(QuotientOfLinearsParts(Plus($p(a),$p(u)),$p(x)),
    Condition(Apply(Function(List(Plus(Slot1,Times(a,Slot(C3))),Plus(Slot2,Times(a,Slot(C4))),Slot(C3),Slot(C4))),QuotientOfLinearsParts(u,x)),FreeQ(a,x))),
SetDelayed(QuotientOfLinearsParts(Power($p(u),CN1),$p(x)),
    Apply(Function(List(Slot(C3),Slot(C4),Slot1,Slot2)),QuotientOfLinearsParts(u,x))),
SetDelayed(QuotientOfLinearsParts($p(u),$p(x)),
    Condition(List(Coefficient(u,x,C0),Coefficient(u,x,C1),C1,C0),LinearQ(u,x))),
SetDelayed(QuotientOfLinearsParts(Times(Power($p(v),CN1),$p(u)),$p(x)),
    Condition(List(Coefficient(u,x,C0),Coefficient(u,x,C1),Coefficient(v,x,C0),Coefficient(v,x,C1)),And(LinearQ(u,x),LinearQ(v,x)))),
SetDelayed(QuotientOfLinearsParts($p(u),$p(x)),
    If(SameQ(u,x),List(C0,C1,C1,C0),If(FreeQ(u,x),List(u,C0,C1,C0),CompoundExpression(Print(stringx("QuotientOfLinearsParts error!")),List(u,C0,C1,C0))))),
SetDelayed(SubstForFractionalPowerOfQuotientOfLinears($p(u),$p(x,SymbolHead)),
    Module(List(Set($s("lst"),FractionalPowerOfQuotientOfLinears(u,C1,False,x)),n,a,b,c,d,$s("tmp")),If(Or(FalseQ($s("lst")),FalseQ(Part($s("lst"),C2))),False,CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(Set(n,Part($s("lst"),C1)),Set($s("tmp"),Part($s("lst"),C2))),Set($s("lst"),QuotientOfLinearsParts($s("tmp"),x))),Set(a,Part($s("lst"),C1))),Set(b,Part($s("lst"),C2))),Set(c,Part($s("lst"),C3))),Set(d,Part($s("lst"),C4))),If(ZeroQ(d),False,CompoundExpression(CompoundExpression(Set($s("lst"),Times(Power(x,Plus(n,Times(CN1,C1))),SubstForFractionalPower(u,$s("tmp"),n,Times(Plus(Times(CN1,a),Times(c,Power(x,n))),Power(Plus(b,Times(CN1,d,Power(x,n))),CN1)),x),Power(Power(Plus(b,Times(CN1,d,Power(x,n))),C2),CN1))),Set($s("lst"),SplitFreeFactors(Simplify($s("lst")),x))),List(Part($s("lst"),C2),n,$s("tmp"),Times(Part($s("lst"),C1),Plus(Times(b,c),Times(CN1,a,d)))))))))),
SetDelayed(SubstForFractionalPowerQ($p(u),$p(v),$p(x,SymbolHead)),
    If(Or(AtomQ(u),FreeQ(u,x)),True,If(FractionalPowerQ(u),SubstForFractionalPowerAuxQ(u,v,x),Catch(CompoundExpression(Scan(Function(If(Not(SubstForFractionalPowerQ(Slot1,v,x)),Throw(False))),u),True))))),
SetDelayed(SubstForFractionalPowerAuxQ($p(u),$p(v),$p(x)),
    If(AtomQ(u),False,If(And(FractionalPowerQ(u),ZeroQ(Plus(Part(u,C1),Times(CN1,v)))),True,Catch(CompoundExpression(Scan(Function(If(SubstForFractionalPowerAuxQ(Slot1,v,x),Throw(True))),u),False))))),
SetDelayed(FractionalPowerOfQuotientOfLinears($p(u),$p(n),$p(v),$p(x)),
    If(Or(AtomQ(u),FreeQ(u,x)),List(n,v),If(CalculusQ(u),False,If(And(And(And(FractionalPowerQ(u),QuotientOfLinearsQ(Part(u,C1),x)),Not(LinearQ(Part(u,C1),x))),Or(FalseQ(v),ZeroQ(Plus(Part(u,C1),Times(CN1,v))))),List(LCM(Denominator(Part(u,C2)),n),Part(u,C1)),Catch(Module(List(Set($s("lst"),List(n,v))),CompoundExpression(Scan(Function(If(FalseQ(Set($s("lst"),FractionalPowerOfQuotientOfLinears(Slot1,Part($s("lst"),C1),Part($s("lst"),C2),x))),Throw(False))),u),$s("lst")))))))),
SetDelayed(SubstForInverseFunctionOfQuotientOfLinears($p(u),$p(x,SymbolHead)),
    Module(List(Set($s("tmp"),InverseFunctionOfQuotientOfLinears(u,x)),h,a,b,c,d,$s("lst")),If(FalseQ($s("tmp")),False,CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(CompoundExpression(Set(h,InverseFunction(Head($s("tmp")))),Set($s("lst"),QuotientOfLinearsParts(Part($s("tmp"),C1),x))),Set(a,Part($s("lst"),C1))),Set(b,Part($s("lst"),C2))),Set(c,Part($s("lst"),C3))),Set(d,Part($s("lst"),C4))),List(Times(SubstForInverseFunction(u,$s("tmp"),Times(Plus(Times(CN1,a),Times(c,$(h,x))),Power(Plus(b,Times(CN1,d,$(h,x))),CN1)),x),D($(h,x),x),Power(Power(Plus(b,Times(CN1,d,$(h,x))),C2),CN1)),$s("tmp"),Plus(Times(b,c),Times(CN1,a,d))))))),
SetDelayed(InverseFunctionOfQuotientOfLinears($p(u),$p(x,SymbolHead)),
    If(Or(Or(AtomQ(u),CalculusQ(u)),FreeQ(u,x)),False,If(And(InverseFunctionQ(u),QuotientOfLinearsQ(Part(u,C1),x)),u,Module(List($s("tmp")),Catch(CompoundExpression(Scan(Function(If(NotFalseQ(Set($s("tmp"),InverseFunctionOfQuotientOfLinears(Slot1,x))),Throw($s("tmp")))),u),False)))))),
SetDelayed(SubstForFractionalPower($p(u),$p(v),$p(n),$p(w),$p(x,SymbolHead)),
    If(AtomQ(u),If(SameQ(u,x),w,u),If(And(FractionalPowerQ(u),ZeroQ(Plus(Part(u,C1),Times(CN1,v)))),Power(x,Times(n,Part(u,C2))),Map(Function(SubstForFractionalPower(Slot1,v,n,w,x)),u)))),
SetDelayed(SubstForInverseFunction($p(u),$p(v),$p(x,SymbolHead)),
    SubstForInverseFunction(u,v,Times(Plus(Times(CN1,Coefficient(Part(v,C1),x,C0)),$(InverseFunction(Head(v)),x)),Power(Coefficient(Part(v,C1),x,C1),CN1)),x)),
SetDelayed(SubstForInverseFunction($p(u),$p(v),$p(w),$p(x,SymbolHead)),
    If(AtomQ(u),If(SameQ(u,x),w,u),If(And(SameQ(Head(u),Head(v)),ZeroQ(Plus(Part(u,C1),Times(CN1,Part(v,C1))))),x,Map(Function(SubstForInverseFunction(Slot1,v,w,x)),u)))),
SetDelayed(Gcd($p(m),$p(n)),
    Condition(Module(List(Set($s("denr"),LCM(Denominator(m),Denominator(n)))),Times(Sign(n),GCD(Times(m,$s("denr")),Times(n,$s("denr"))),Power($s("denr"),CN1))),RationalQ(m,n))),
SetDelayed(CommonNumericFactors($p("lst")),
    Module(List(Set($s("num"),Apply($s("GCD"),Map($s("Integrate::NumericFactor"),$s("lst"))))),Prepend(Map(Function(Times(Slot1,Power($s("num"),CN1))),$s("lst")),$s("num")))),
SetDelayed(NumericFactor($p(u)),
    If(NumberQ(u),If(ZeroQ(Im(u)),u,If(ZeroQ(Re(u)),Im(u),C1)),If(PowerQ(u),If(And(RationalQ(Part(u,C1)),FractionQ(Part(u,C2))),If(Greater(Part(u,C2),C0),Power(Denominator(Part(u,C1)),CN1),Power(Denominator(Power(Part(u,C1),CN1)),CN1)),C1),If(ProductQ(u),Map($s("Integrate::NumericFactor"),u),If(SumQ(u),$(Function(If(SumQ(Slot1),C1,NumericFactor(Slot1))),ContentFactor(u)),C1))))),
SetDelayed(NonnumericFactors($p(u)),
    If(NumberQ(u),If(ZeroQ(Im(u)),C1,If(ZeroQ(Re(u)),CI,u)),If(PowerQ(u),If(And(RationalQ(Part(u,C1)),FractionQ(Part(u,C2))),Times(u,Power(NumericFactor(u),CN1)),u),If(ProductQ(u),Map($s("Integrate::NonnumericFactors"),u),If(SumQ(u),$(Function(If(SumQ(Slot1),u,NonnumericFactors(Slot1))),ContentFactor(u)),u))))),
SetDelayed(AbsurdNumberQ($p(u)),
    RationalQ(u)),
SetDelayed(AbsurdNumberQ(Power($p(u),$p(v))),
    And(And(RationalQ(u),Greater(u,C0)),FractionQ(v))),
SetDelayed(AbsurdNumberQ(Times($p(u),$p(v))),
    And(AbsurdNumberQ(u),AbsurdNumberQ(v))),
SetDelayed(AbsurdNumberFactors($p(u)),
    If(AbsurdNumberQ(u),u,If(ProductQ(u),Map($s("Integrate::AbsurdNumberFactors"),u),NumericFactor(u)))),
SetDelayed(NonabsurdNumberFactors($p(u)),
    If(AbsurdNumberQ(u),C1,If(ProductQ(u),Map($s("Integrate::NonabsurdNumberFactors"),u),NonnumericFactors(u)))),
SetDelayed(FactorAbsurdNumber($p(m)),
    If(RationalQ(m),FactorInteger(m),If(PowerQ(m),Map(Function(List(Part(Slot1,C1),Times(Part(Slot1,C2),Part(m,C2)))),FactorInteger(Part(m,C1))),CombineExponents(Sort(Flatten(Map($s("Integrate::FactorAbsurdNumber"),Apply($s("List"),m)),C1),Function(Less(Part(Slot1,C1),Part(Slot2,C1)))))))),
SetDelayed(CombineExponents($p("lst")),
    If(Less(Length($s("lst")),C2),$s("lst"),If(Equal(Part($s("lst"),C1,C1),Part($s("lst"),C2,C1)),CombineExponents(Prepend(Drop($s("lst"),C2),List(Part($s("lst"),C1,C1),Plus(Part($s("lst"),C1,C2),Part($s("lst"),C2,C2))))),Prepend(CombineExponents(Rest($s("lst"))),First($s("lst")))))),
SetDelayed(AbsurdNumberGCD($ps("seq")),
    Module(List(Set($s("lst"),List($s("seq")))),If(Equal(Length($s("lst")),C1),First($s("lst")),AbsurdNumberGCDList(FactorAbsurdNumber(First($s("lst"))),FactorAbsurdNumber(Apply($s("Integrate::AbsurdNumberGCD"),Rest($s("lst")))))))),
SetDelayed(AbsurdNumberGCDList($p("lst1"),$p("lst2")),
    If(SameQ($s("lst1"),List()),Apply($s("Times"),Map(Function(Power(Part(Slot1,C1),Min(Part(Slot1,C2),C0))),$s("lst2"))),If(SameQ($s("lst2"),List()),Apply($s("Times"),Map(Function(Power(Part(Slot1,C1),Min(Part(Slot1,C2),C0))),$s("lst1"))),If(Equal(Part($s("lst1"),C1,C1),Part($s("lst2"),C1,C1)),If(LessEqual(Part($s("lst1"),C1,C2),Part($s("lst2"),C1,C2)),Times(Power(Part($s("lst1"),C1,C1),Part($s("lst1"),C1,C2)),AbsurdNumberGCDList(Rest($s("lst1")),Rest($s("lst2")))),Times(Power(Part($s("lst1"),C1,C1),Part($s("lst2"),C1,C2)),AbsurdNumberGCDList(Rest($s("lst1")),Rest($s("lst2"))))),If(Less(Part($s("lst1"),C1,C1),Part($s("lst2"),C1,C1)),If(Less(Part($s("lst1"),C1,C2),C0),Times(Power(Part($s("lst1"),C1,C1),Part($s("lst1"),C1,C2)),AbsurdNumberGCDList(Rest($s("lst1")),$s("lst2"))),AbsurdNumberGCDList(Rest($s("lst1")),$s("lst2"))),If(Less(Part($s("lst2"),C1,C2),C0),Times(Power(Part($s("lst2"),C1,C1),Part($s("lst2"),C1,C2)),AbsurdNumberGCDList($s("lst1"),Rest($s("lst2")))),AbsurdNumberGCDList($s("lst1"),Rest($s("lst2"))))))))),
SetDelayed(NormalizeIntegrand($p(u),$p(x,SymbolHead)),
    Module(List(Set(v,NormalizeLeadTermSigns(NormalizeIntegrandAux(u,x)))),If(SameQ(v,NormalizeLeadTermSigns(u)),u,v))),
SetDelayed(NormalizeIntegrandAux($p(u),$p(x,SymbolHead)),
    If(SumQ(u),Map(Function(NormalizeIntegrandAux(Slot1,x)),u),If(ProductQ(u),Map(Function(NormalizeIntegrandFactor(Slot1,x)),u),NormalizeIntegrandFactor(u,x)))),
SetDelayed(NormalizeIntegrandFactor($p(u),$p(x,SymbolHead)),
    Module(List($s("bas"),$s("deg"),$s("min")),If(And(PowerQ(u),FreeQ(Part(u,C2),x)),CompoundExpression(CompoundExpression(Set($s("bas"),NormalizeIntegrandFactorBase(Part(u,C1),x)),Set($s("deg"),Part(u,C2))),If(And(IntegerQ($s("deg")),SumQ($s("bas"))),If(MapAnd(Function(MonomialQ(Slot1,x)),$s("bas")),CompoundExpression(Set($s("min"),MinimumMonomialExponent($s("bas"),x)),Times(Power(x,Times($s("min"),$s("deg"))),Power(Map(Function(Simplify(Times(Slot1,Power(Power(x,$s("min")),CN1)))),$s("bas")),$s("deg")))),Power($s("bas"),$s("deg"))),Power($s("bas"),$s("deg")))),If(And(PowerQ(u),FreeQ(Part(u,C1),x)),Power(Part(u,C1),NormalizeIntegrandFactorBase(Part(u,C2),x)),CompoundExpression(Set($s("bas"),NormalizeIntegrandFactorBase(u,x)),If(SumQ($s("bas")),If(MapAnd(Function(MonomialQ(Slot1,x)),$s("bas")),CompoundExpression(Set($s("min"),MinimumMonomialExponent($s("bas"),x)),Times(Power(x,$s("min")),Map(Function(Times(Slot1,Power(Power(x,$s("min")),CN1))),$s("bas")))),$s("bas")),$s("bas"))))))),
SetDelayed(NormalizeIntegrandFactorBase(Times(Power($p(x),$p(m,true)),$p(u)),$p(x,SymbolHead)),
    Condition(NormalizeIntegrandFactorBase(Map(Function(Times(Power(x,m),Slot1)),u),x),And(FreeQ(m,x),SumQ(u)))),
SetDelayed(NormalizeIntegrandFactorBase($p(u),$p(x,SymbolHead)),
    If(BinomialQ(u,x),If(BinomialMatchQ(u,x),u,ExpandToSum(u,x)),If(TrinomialQ(u,x),If(TrinomialMatchQ(u,x),u,ExpandToSum(u,x)),If(ProductQ(u),Map(Function(NormalizeIntegrandFactor(Slot1,x)),u),If(And(PolynomialQ(u,x),LessEqual(Exponent(u,x),C4)),ExpandToSum(u,x),If(SumQ(u),Module(List(Set(v,TogetherSimplify(u))),If(Or(Or(SumQ(v),MatchQ(v,Condition(Times(Power(x,$p(m,true)),$p(w)),And(FreeQ(m,x),SumQ(w))))),Greater(LeafCount(v),Plus(LeafCount(u),C2))),UnifySum(u,x),NormalizeIntegrandFactorBase(v,x))),Map(Function(NormalizeIntegrandFactor(Slot1,x)),u))))))),
SetDelayed(NormalizeLeadTermSigns($p(u)),
    Module(List(Set($s("lst"),If(ProductQ(u),Map($s("Integrate::SignOfFactor"),u),SignOfFactor(u)))),If(Equal(Part($s("lst"),C1),C1),Part($s("lst"),C2),AbsorbMinusSign(Part($s("lst"),C2))))),
SetDelayed(AbsorbMinusSign(Times($p(u,true),$p(v,$s("Plus")))),
    Times(u,CN1,v)),
SetDelayed(AbsorbMinusSign(Times(Power($p(v,$s("Plus")),$p(m)),$p(u,true))),
    Condition(Times(u,Power(Times(CN1,v),m)),OddQ(m))),
SetDelayed(AbsorbMinusSign($p(u)),
    Times(CN1,u)),
SetDelayed(NormalizeSumFactors($p(u)),
    If(Or(Or(Or(AtomQ(u),SameQ(Head(u),$s("If"))),SameQ(Head(u),$s("Int"))),HeldFormQ(u)),u,If(ProductQ(u),$(Function(Times(Part(Slot1,C1),Part(Slot1,C2))),SignOfFactor(Map($s("Integrate::NormalizeSumFactors"),u))),Map($s("Integrate::NormalizeSumFactors"),u)))),
SetDelayed(SignOfFactor($p(u)),
    If(Or(And(RationalQ(u),Less(u,C0)),And(SumQ(u),Less(NumericFactor(First(u)),C0))),List(CN1,Times(CN1,u)),If(And(And(IntegerPowerQ(u),SumQ(Part(u,C1))),Less(NumericFactor(First(Part(u,C1))),C0)),List(Power(CN1,Part(u,C2)),Power(Times(CN1,Part(u,C1)),Part(u,C2))),If(ProductQ(u),Map($s("Integrate::SignOfFactor"),u),List(C1,u)))))
  );
}