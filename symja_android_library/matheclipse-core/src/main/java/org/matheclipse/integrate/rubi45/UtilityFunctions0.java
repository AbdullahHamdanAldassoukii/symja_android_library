package org.matheclipse.integrate.rubi45;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.integrate.rubi45.UtilityFunctionCtors.*;

import org.matheclipse.core.interfaces.IAST;
/** 
 * UtilityFunctions rules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class UtilityFunctions0 { 
  public static IAST RULES = List( 
ISetDelayed(Map2($p("func"),$p("lst1"),$p("lst2")),
    Module(List(i),ReapList(Do(Sow($($s("func"),Part($s("lst1"),i),Part($s("lst2"),i))),List(i,Length($s("lst1"))))))),
ISetDelayed(ReapList(u_),
    Module(List(Set($s("lst"),Part(Reap(u),C2))),If(SameQ($s("lst"),List()),$s("lst"),Part($s("lst"),C1)))),
ISetDelayed(MapAnd(f_,$p("lst")),
    Catch(CompoundExpression(Scan(Function(If($(f,Slot1),Null,Throw(False))),$s("lst")),True))),
ISetDelayed(MapAnd(f_,$p("lst"),x_),
    Catch(CompoundExpression(Scan(Function(If($(f,Slot1,x),Null,Throw(False))),$s("lst")),True))),
ISetDelayed(MapOr(f_,$p("lst")),
    Catch(CompoundExpression(Scan(Function(If($(f,Slot1),Throw(True),Null)),$s("lst")),False))),
ISetDelayed(NotIntegrableQ(u_,x_Symbol),
    Or(MatchQ(u,Condition(Times(Power(x,m_),Power(Log(Plus(a_,Times(b_DEFAULT,x))),n_)),And(And(And(FreeQ(List(a,b),x),IntegersQ(m,n)),Less(m,C0)),Less(n,C0)))),MatchQ(u,Condition($(f_,Times(Power(x,m_DEFAULT),Log(Plus(a_DEFAULT,Times(b_DEFAULT,x))))),And(And(FreeQ(List(a,b),x),IntegerQ(m)),Or(TrigQ(f),HyperbolicQ(f))))))),
ISetDelayed(ZeroQ(u_),
    Quiet(PossibleZeroQ(u))),
ISetDelayed(NonzeroQ(u_),
    Not(Quiet(PossibleZeroQ(u)))),
ISetDelayed(ZeroQ($ps("u")),
    Catch(CompoundExpression(Scan(Function(If(ZeroQ(Slot1),Null,Throw(False))),List(u)),True))),
ISetDelayed(OneQ(u_),
    PossibleZeroQ(Plus(u,Negate(C1)))),
ISetDelayed(OneQ($ps("u")),
    Catch(CompoundExpression(Scan(Function(If(OneQ(Slot1),Null,Throw(False))),List(u)),True))),
ISetDelayed(RealNumericQ(u_),
    And(NumericQ(u),PossibleZeroQ(Im(N(u))))),
ISetDelayed(ImaginaryNumericQ(u_),
    And(And(NumericQ(u),PossibleZeroQ(Re(N(u)))),Not(PossibleZeroQ(Im(N(u)))))),
ISetDelayed(PositiveQ(u_),
    Module(List(Set(v,Simplify(u))),And(RealNumericQ(v),Greater(Re(N(v)),C0)))),
ISetDelayed(PositiveOrZeroQ(u_),
    Module(List(Set(v,Simplify(u))),And(RealNumericQ(v),GreaterEqual(Re(N(v)),C0)))),
ISetDelayed(NegativeQ(u_),
    Module(List(Set(v,Simplify(u))),And(RealNumericQ(v),Less(Re(N(v)),C0)))),
ISetDelayed(NegativeOrZeroQ(u_),
    Module(List(Set(v,Simplify(u))),And(RealNumericQ(v),LessEqual(Re(N(v)),C0)))),
ISetDelayed(IntegersQ($ps("u")),
    Catch(CompoundExpression(Scan(Function(If(IntegerQ(Slot1),Null,Throw(False))),List(u)),True))),
ISetDelayed(PositiveIntegerQ($ps("u")),
    Catch(CompoundExpression(Scan(Function(If(And(IntegerQ(Slot1),Greater(Slot1,C0)),Null,Throw(False))),List(u)),True))),
ISetDelayed(NegativeIntegerQ($ps("u")),
    Catch(CompoundExpression(Scan(Function(If(And(IntegerQ(Slot1),Less(Slot1,C0)),Null,Throw(False))),List(u)),True))),
ISetDelayed(FractionQ($ps("u")),
    Catch(CompoundExpression(Scan(Function(If(SameQ(Head(Slot1),$s("Rational")),Null,Throw(False))),List(u)),True))),
ISetDelayed(RationalQ($ps("u")),
    Catch(CompoundExpression(Scan(Function(If(Or(IntegerQ(Slot1),SameQ(Head(Slot1),$s("Rational"))),Null,Throw(False))),List(u)),True))),
ISetDelayed(FractionOrNegativeQ($ps("u")),
    Catch(CompoundExpression(Scan(Function(If(Or(FractionQ(Slot1),And(IntegerQ(Slot1),Less(Slot1,C0))),Null,Throw(False))),List(u)),True))),
ISetDelayed(SqrtNumberQ(Power(m_,n_)),
    Or(And(IntegerQ(n),SqrtNumberQ(m)),And(IntegerQ(Plus(n,Negate(C1D2))),RationalQ(m)))),
ISetDelayed(SqrtNumberQ(Times(u_,v_)),
    And(SqrtNumberQ(u),SqrtNumberQ(v))),
ISetDelayed(SqrtNumberQ(u_),
    Or(RationalQ(u),SameQ(u,CI))),
ISetDelayed(SqrtNumberSumQ(u_),
    Or(And(And(SumQ(u),SqrtNumberQ(First(u))),SqrtNumberQ(Rest(u))),And(And(ProductQ(u),SqrtNumberQ(First(u))),SqrtNumberSumQ(Rest(u))))),
ISetDelayed(NiceSqrtQ(u_),
    And(Not(NegativeQ(u)),NiceSqrtAuxQ(u))),
ISetDelayed(NiceSqrtAuxQ(u_),
    If(RationalQ(u),Greater(u,C0),If(PowerQ(u),EvenQ(Part(u,C2)),If(ProductQ(u),And(NiceSqrtAuxQ(First(u)),NiceSqrtAuxQ(Rest(u))),If(SumQ(u),$(Function(And(NonsumQ(Slot1),NiceSqrtAuxQ(Slot1))),Simplify(u)),False))))),
ISetDelayed(PerfectSquareQ(u_),
    If(RationalQ(u),And(And(Greater(u,C0),Unequal(u,C1)),RationalQ(Sqrt(u))),If(PowerQ(u),EvenQ(Part(u,C2)),If(ProductQ(u),And(PerfectSquareQ(First(u)),PerfectSquareQ(Rest(u))),If(SumQ(u),$(Function(And(NonsumQ(Slot1),PerfectSquareQ(Slot1))),Simplify(u)),False))))),
ISetDelayed(FalseQ(u_),
    SameQ(u,False)),
ISetDelayed(NotFalseQ(u_),
    UnsameQ(u,False)),
ISetDelayed(SumQ(u_),
    SameQ(Head(u),Plus)),
ISetDelayed(NonsumQ(u_),
    UnsameQ(Head(u),Plus)),
ISetDelayed(ProductQ(u_),
    SameQ(Head(u),Times)),
ISetDelayed(PowerQ(u_),
    SameQ(Head(u),Power)),
ISetDelayed(IntegerPowerQ(u_),
    And(PowerQ(u),IntegerQ(Part(u,C2)))),
ISetDelayed(PositiveIntegerPowerQ(u_),
    And(And(PowerQ(u),IntegerQ(Part(u,C2))),Greater(Part(u,C2),C0))),
ISetDelayed(FractionalPowerQ(u_),
    And(PowerQ(u),FractionQ(Part(u,C2)))),
ISetDelayed(RationalPowerQ(u_),
    And(PowerQ(u),RationalQ(Part(u,C2)))),
ISetDelayed(SqrtQ(u_),
    And(PowerQ(u),SameQ(Part(u,C2),C1D2))),
ISetDelayed(ExpQ(u_),
    And(PowerQ(u),SameQ(Part(u,C1),E))),
ISetDelayed(ImaginaryQ(u_),
    And(SameQ(Head(u),$s("Complex")),SameQ(Re(u),C0))),
ISetDelayed(FractionalPowerFreeQ(u_),
    If(AtomQ(u),True,If(And(FractionalPowerQ(u),Not(AtomQ(Part(u,C1)))),False,Catch(CompoundExpression(Scan(Function(If(FractionalPowerFreeQ(Slot1),Null,Throw(False))),u),True))))),
ISetDelayed(ComplexFreeQ(u_),
    If(AtomQ(u),UnsameQ(Head(u),$s("Complex")),Catch(CompoundExpression(Scan(Function(If(ComplexFreeQ(Slot1),Null,Throw(False))),u),True)))),
ISetDelayed(LogQ(u_),
    SameQ(Head(u),$s("Log"))),
ISetDelayed(SinQ(u_),
    SameQ(Head(u),$s("Sin"))),
ISetDelayed(CosQ(u_),
    SameQ(Head(u),$s("Cos"))),
ISetDelayed(TanQ(u_),
    SameQ(Head(u),$s("Tan"))),
ISetDelayed(CotQ(u_),
    SameQ(Head(u),$s("Cot"))),
ISetDelayed(SecQ(u_),
    SameQ(Head(u),$s("Sec"))),
ISetDelayed(CscQ(u_),
    SameQ(Head(u),$s("Csc"))),
ISetDelayed(SinhQ(u_),
    SameQ(Head(u),$s("Sinh"))),
ISetDelayed(CoshQ(u_),
    SameQ(Head(u),$s("Cosh"))),
ISetDelayed(TanhQ(u_),
    SameQ(Head(u),$s("Tanh"))),
ISetDelayed(CothQ(u_),
    SameQ(Head(u),$s("Coth"))),
ISetDelayed(SechQ(u_),
    SameQ(Head(u),$s("Sech"))),
ISetDelayed(CschQ(u_),
    SameQ(Head(u),$s("Csch"))),
ISetDelayed(TrigQ(u_),
    MemberQ(List($s("Sin"),$s("Cos"),$s("Tan"),$s("Cot"),$s("Sec"),$s("Csc")),If(AtomQ(u),u,Head(u)))),
ISetDelayed(InverseTrigQ(u_),
    MemberQ(List($s("ArcSin"),$s("ArcCos"),$s("ArcTan"),$s("ArcCot"),$s("ArcSec"),$s("ArcCsc")),If(AtomQ(u),u,Head(u)))),
ISetDelayed(HyperbolicQ(u_),
    MemberQ(List($s("Sinh"),$s("Cosh"),$s("Tanh"),$s("Coth"),$s("Sech"),$s("Csch")),If(AtomQ(u),u,Head(u)))),
ISetDelayed(InverseHyperbolicQ(u_),
    MemberQ(List($s("ArcSinh"),$s("ArcCosh"),$s("ArcTanh"),$s("ArcCoth"),$s("ArcSech"),$s("ArcCsch")),If(AtomQ(u),u,Head(u)))),
ISetDelayed(SinCosQ(f_),
    MemberQ(List($s("Sin"),$s("Cos"),$s("Sec"),$s("Csc")),f)),
ISetDelayed(SinhCoshQ(f_),
    MemberQ(List($s("Sinh"),$s("Cosh"),$s("Sech"),$s("Csch")),f)),
ISetDelayed(CalculusQ(u_),
    MemberQ(List($s("D"),$s("Integrate"),$s("Sum"),$s("Product"),$s("Int"),$s("§dif"),$s("Integrate::Subst")),Head(u))),
ISetDelayed(CalculusFreeQ(u_,x_),
    If(AtomQ(u),True,If(Or(And(CalculusQ(u),SameQ(Part(u,C2),x)),HeldFormQ(u)),False,Catch(CompoundExpression(Scan(Function(If(CalculusFreeQ(Slot1,x),Null,Throw(False))),u),True))))),
ISetDelayed(HeldFormQ(u_),
    If(AtomQ(Head(u)),MemberQ(List($s("Hold"),$s("HoldForm"),$s("Defer"),$s("Pattern")),Head(u)),HeldFormQ(Head(u)))),
ISetDelayed(InverseFunctionQ(u_),
    Or(Or(Or(Or(LogQ(u),And(InverseTrigQ(u),LessEqual(Length(u),C1))),InverseHyperbolicQ(u)),SameQ(Head(u),$s("§mods"))),SameQ(Head(u),$s("PolyLog")))),
ISetDelayed(TrigHyperbolicFreeQ(u_,x_Symbol),
    If(AtomQ(u),True,If(Or(Or(TrigQ(u),HyperbolicQ(u)),CalculusQ(u)),FreeQ(u,x),Catch(CompoundExpression(Scan(Function(If(TrigHyperbolicFreeQ(Slot1,x),Null,Throw(False))),u),True))))),
ISetDelayed(InverseFunctionFreeQ(u_,x_Symbol),
    If(AtomQ(u),True,If(Or(Or(Or(InverseFunctionQ(u),CalculusQ(u)),SameQ(Head(u),$s("Hypergeometric2F1"))),SameQ(Head(u),$s("AppellF1"))),FreeQ(u,x),Catch(CompoundExpression(Scan(Function(If(InverseFunctionFreeQ(Slot1,x),Null,Throw(False))),u),True))))),
ISetDelayed(NegativeCoefficientQ(u_),
    If(SumQ(u),NegativeCoefficientQ(First(u)),MatchQ(u,Condition(Times(m_,v_DEFAULT),And(RationalQ(m),Less(m,C0)))))),
ISetDelayed(RealQ(u_),
    Condition(MapAnd($s("Integrate::RealQ"),u),ListQ(u))),
ISetDelayed(RealQ(u_),
    Condition(PossibleZeroQ(Im(N(u))),NumericQ(u))),
ISetDelayed(RealQ(Power(u_,v_)),
    And(And(RealQ(u),RealQ(v)),Or(IntegerQ(v),PositiveOrZeroQ(u)))),
ISetDelayed(RealQ(Times(u_,v_)),
    And(RealQ(u),RealQ(v))),
ISetDelayed(RealQ(Plus(u_,v_)),
    And(RealQ(u),RealQ(v))),
ISetDelayed(RealQ($(f_,u_)),
    If(MemberQ(List($s("Sin"),$s("Cos"),$s("Tan"),$s("Cot"),$s("Sec"),$s("Csc"),$s("ArcTan"),$s("ArcCot"),$s("Erf")),f),RealQ(u),If(MemberQ(List($s("ArcSin"),$s("ArcCos")),f),LE(CN1,u,C1),If(SameQ(f,$s("Log")),PositiveOrZeroQ(u),False)))),
ISetDelayed(RealQ(u_),
    False),
ISetDelayed(PosQ(u_),
    PosAux(TogetherSimplify(u))),
ISetDelayed(PosAux(u_),
    If(RationalQ(u),Greater(u,C0),If(NumberQ(u),If(PossibleZeroQ(Re(u)),Greater(Im(u),C0),Greater(Re(u),C0)),If(NumericQ(u),Module(List(Set(v,N(u))),If(PossibleZeroQ(Re(v)),Greater(Im(v),C0),Greater(Re(v),C0))),If(And(PowerQ(u),OddQ(Part(u,C2))),PosAux(Part(u,C1)),If(ProductQ(u),If(PosAux(First(u)),PosAux(Rest(u)),Not(PosAux(Rest(u)))),If(SumQ(u),PosAux(First(u)),True))))))),
ISetDelayed(NegQ(u_),
    If(PossibleZeroQ(u),False,Not(PosQ(u)))),
ISetDelayed(LeadTerm(u_),
    If(SumQ(u),First(u),u)),
ISetDelayed(RemainingTerms(u_),
    If(SumQ(u),Rest(u),C0)),
ISetDelayed(LeadFactor(u_),
    If(ProductQ(u),LeadFactor(First(u)),If(ImaginaryQ(u),If(SameQ(Im(u),C1),u,LeadFactor(Im(u))),u))),
ISetDelayed(RemainingFactors(u_),
    If(ProductQ(u),Times(RemainingFactors(First(u)),Rest(u)),If(ImaginaryQ(u),If(SameQ(Im(u),C1),C1,Times(CI,RemainingFactors(Im(u)))),C1))),
ISetDelayed(LeadBase(u_),
    Module(List(Set(v,LeadFactor(u))),If(PowerQ(v),Part(v,C1),v))),
ISetDelayed(LeadDegree(u_),
    Module(List(Set(v,LeadFactor(u))),If(PowerQ(v),Part(v,C2),C1))),
ISetDelayed(LT(u_,v_),
    And(And(RealNumericQ(u),RealNumericQ(v)),Less(Re(N(u)),Re(N(v))))),
ISetDelayed(LT(u_,v_,w_),
    And(LT(u,v),LT(v,w)))
  );
}