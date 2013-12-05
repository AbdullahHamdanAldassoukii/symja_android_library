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
public class IntegrationRulesForMiscellaneousExpressions1 { 
  public static IAST RULES = List( 
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),C2),$p(c,true)),Times(Power($p(x),C3),$p(d,true)),Times($p(b,true),$p(x)),$p(a,true)),$p(p)),Power(Plus(Times($p(f,true),$p(x)),$p(e,true)),$p(m,true))),$p(x,SymbolHead)),
    Condition(Int(ExpandToSum(Power(Plus(e,Times(f,x)),m),Power(Plus(a,Times(b,x),Times(c,Power(x,C2)),Times(d,Power(x,C3))),p),x),x),And(And(And(FreeQ(List(a,b,c,d,e,f,m),x),PositiveIntegerQ(p)),NonzeroQ(Plus(Power(c,C2),Times(CN1,C3,b,d)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C3,a,c)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),C2),$p(c,true)),Times(Power($p(x),C3),$p(d,true)),Times($p(b,true),$p(x)),$p(a,true)),$p(p)),Power(Plus(Times($p(f,true),$p(x)),$p(e,true)),$p(m,true))),$p(x,SymbolHead)),
    Condition(Module(List(Set(u,Factor(Plus(a,Times(b,x),Times(c,Power(x,C2)),Times(d,Power(x,C3)))))),Condition(Int(Times(Power(Plus(e,Times(f,x)),m),Map(Function(Power(Slot1,p)),u)),x),ProductQ(NonfreeFactors(u,x)))),And(And(And(FreeQ(List(a,b,c,d,e,f,m),x),NegativeIntegerQ(p)),NonzeroQ(Plus(Power(c,C2),Times(CN1,C3,b,d)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C3,a,c)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),C2),$p(c,true)),Times(Power($p(x),C3),$p(d,true)),Times($p(b,true),$p(x)),$p(a,true)),$p(p)),Power(Plus(Times($p(f,true),$p(x)),$p(e,true)),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(Times(Power(C3,Times(C3,p)),Power(d,Times(C2,p))),CN1),Subst(Int(Power(Plus(Times(C2,Power(c,C3)),Times(CN1,ZZ(9L),b,c,d),Times(ZZ(27L),a,Power(d,C2)),Times(CN1,ZZ(9L),d,Plus(Power(c,C2),Times(CN1,C3,b,d)),x),Times(ZZ(27L),Power(d,C3),Power(x,C3))),p),x),x,Plus(x,Times(c,Power(Times(C3,d),CN1))))),And(And(And(FreeQ(List(a,b,c,d,e,f,m),x),NegativeIntegerQ(p)),NonzeroQ(Plus(Power(c,C2),Times(CN1,C3,b,d)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C3,a,c)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),C2),$p(c,true)),Times(Power($p(x),C3),$p(d,true)),Times($p(b,true),$p(x)),$p(a,true)),$p(p)),Power(Plus(Times($p(f,true),$p(x)),$p(e,true)),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(Plus(a,Times(b,x),Times(c,Power(x,C2)),Times(d,Power(x,C3))),p),Power(Power(Plus(b,Times(c,x)),Times(C3,p)),CN1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Plus(b,Times(c,x)),Times(C3,p))),x)),And(And(And(FreeQ(List(a,b,c,d,e,f,m,p),x),Not(IntegerQ(p))),ZeroQ(Plus(Power(c,C2),Times(CN1,C3,b,d)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C3,a,c)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),C2),$p(c,true)),Times(Power($p(x),C3),$p(d,true)),Times($p(b,true),$p(x)),$p(a,true)),$p(p)),Power(Plus(Times($p(f,true),$p(x)),$p(e,true)),$p(m,true))),$p(x,SymbolHead)),
    Condition(Module(List(Set(r,Rt(Plus(Power(b,C3),Times(CN1,C3,a,b,c)),C3))),Times(Power(Plus(a,Times(b,x),Times(c,Power(x,C2)),Times(d,Power(x,C3))),p),Power(Times(Power(Plus(b,Times(CN1,r),Times(c,x)),p),Power(Plus(b,Times(Plus(C1,Times(CN1,CI,Sqrt(C3))),C1D2,r),Times(c,x)),p),Power(Plus(b,Times(Plus(C1,Times(CI,Sqrt(C3))),C1D2,r),Times(c,x)),p)),CN1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Plus(b,Times(CN1,r),Times(c,x)),p),Power(Plus(b,Times(Plus(C1,Times(CN1,CI,Sqrt(C3))),C1D2,r),Times(c,x)),p),Power(Plus(b,Times(Plus(C1,Times(CI,Sqrt(C3))),C1D2,r),Times(c,x)),p)),x))),And(And(And(FreeQ(List(a,b,c,d,e,f,m,p),x),Not(IntegerQ(p))),ZeroQ(Plus(Power(c,C2),Times(CN1,C3,b,d)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C3,a,c)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),C2),$p(c,true)),Times(Power($p(x),C3),$p(d,true)),Times($p(b,true),$p(x)),$p(a,true)),$p(p)),Power(Plus(Times($p(f,true),$p(x)),$p(e,true)),$p(m,true))),$p(x,SymbolHead)),
    Condition(Module(List(Set(r,Rt(Plus(Power(c,C3),Times(CN1,C3,b,c,d)),C3))),Times(Power(Plus(a,Times(b,x),Times(c,Power(x,C2)),Times(d,Power(x,C3))),p),Power(Times(Power(Plus(b,Times(Plus(c,Times(CN1,r)),x)),p),Power(Plus(b,Times(Plus(c,Times(Plus(C1,Times(CN1,CI,Sqrt(C3))),C1D2,r)),x)),p),Power(Plus(b,Times(Plus(c,Times(Plus(C1,Times(CI,Sqrt(C3))),C1D2,r)),x)),p)),CN1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Plus(b,Times(Plus(c,Times(CN1,r)),x)),p),Power(Plus(b,Times(Plus(c,Times(Plus(C1,Times(CN1,CI,Sqrt(C3))),C1D2,r)),x)),p),Power(Plus(b,Times(Plus(c,Times(Plus(C1,Times(CI,Sqrt(C3))),C1D2,r)),x)),p)),x))),And(And(And(FreeQ(List(a,b,c,d,e,f,m,p),x),Not(IntegerQ(p))),NonzeroQ(Plus(Power(c,C2),Times(CN1,C3,b,d)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C3,a,c)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),C2),$p(c,true)),Times(Power($p(x),C3),$p(d,true)),Times($p(b,true),$p(x)),$p(a,true)),$p(p)),Power(Plus(Times($p(f,true),$p(x)),$p(e,true)),$p(m,true))),$p(x,SymbolHead)),
    Condition(Module(List(Set(u,Factor(Plus(a,Times(b,x),Times(c,Power(x,C2)),Times(d,Power(x,C3)))))),Condition(Times(Power(Plus(a,Times(b,x),Times(c,Power(x,C2)),Times(d,Power(x,C3))),p),Power(Map(Function(Power(Slot1,p)),u),CN1),Int(Times(Power(Plus(e,Times(f,x)),m),Map(Function(Power(Slot1,p)),u)),x)),ProductQ(NonfreeFactors(u,x)))),And(And(And(FreeQ(List(a,b,c,d,e,f,m,p),x),Not(IntegerQ(p))),NonzeroQ(Plus(Power(c,C2),Times(CN1,C3,b,d)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C3,a,c)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),C2),$p(c,true)),Times(Power($p(x),C3),$p(d,true)),Times($p(b,true),$p(x)),$p(a,true)),$p(p)),Power(Plus(Times($p(f,true),$p(x)),$p(e,true)),$p(m,true))),$p(x,SymbolHead)),
    Condition(Module(List(Set(r,Rt(Plus(Times(CN2,Power(c,C3)),Times(ZZ(9L),b,c,d),Times(CN1,ZZ(27L),a,Power(d,C2)),Times(C3,Sqrt(C3),d,Sqrt(Plus(Times(CN1,Power(b,C2),Power(c,C2)),Times(C4,a,Power(c,C3)),Times(C4,Power(b,C3),d),Times(CN1,ZZ(18L),a,b,c,d),Times(ZZ(27L),Power(a,C2),Power(d,C2)))))),C3))),Times(Power(Plus(a,Times(b,x),Times(c,Power(x,C2)),Times(d,Power(x,C3))),p),Power(Times(Power(Plus(c,Times(CN1,Plus(Times(C2,Power(c,C2)),Times(CN1,ZZ(6L),b,d),Times(Power(C2,C1D3),Power(r,C2))),Power(Times(Power(C2,QQ(2L,3L)),r),CN1)),Times(C3,d,x)),p),Power(Plus(c,Times(Plus(Times(C2,Plus(C1,Times(CI,Sqrt(C3))),Power(c,C2)),Times(CN1,ZZ(6L),Plus(C1,Times(CI,Sqrt(C3))),b,d),Times(CN1,CI,Power(C2,C1D3),Plus(CI,Sqrt(C3)),Power(r,C2))),Power(Times(C2,Power(C2,QQ(2L,3L)),r),CN1)),Times(C3,d,x)),p),Power(Plus(c,Times(Plus(Times(C2,Plus(C1,Times(CN1,CI,Sqrt(C3))),Power(c,C2)),Times(CN1,ZZ(6L),Plus(C1,Times(CN1,CI,Sqrt(C3))),b,d),Times(CI,Power(C2,C1D3),Plus(Times(CN1,CI),Sqrt(C3)),Power(r,C2))),Power(Times(C2,Power(C2,QQ(2L,3L)),r),CN1)),Times(C3,d,x)),p)),CN1),Int(Times(Power(Plus(e,Times(f,x)),m),Power(Plus(c,Times(CN1,Plus(Times(C2,Power(c,C2)),Times(CN1,ZZ(6L),b,d),Times(Power(C2,C1D3),Power(r,C2))),Power(Times(Power(C2,QQ(2L,3L)),r),CN1)),Times(C3,d,x)),p),Power(Plus(c,Times(Plus(Times(C2,Plus(C1,Times(CI,Sqrt(C3))),Power(c,C2)),Times(CN1,ZZ(6L),Plus(C1,Times(CI,Sqrt(C3))),b,d),Times(CN1,CI,Power(C2,C1D3),Plus(CI,Sqrt(C3)),Power(r,C2))),Power(Times(C2,Power(C2,QQ(2L,3L)),r),CN1)),Times(C3,d,x)),p),Power(Plus(c,Times(Plus(Times(C2,Plus(C1,Times(CN1,CI,Sqrt(C3))),Power(c,C2)),Times(CN1,ZZ(6L),Plus(C1,Times(CN1,CI,Sqrt(C3))),b,d),Times(CI,Power(C2,C1D3),Plus(Times(CN1,CI),Sqrt(C3)),Power(r,C2))),Power(Times(C2,Power(C2,QQ(2L,3L)),r),CN1)),Times(C3,d,x)),p)),x))),And(And(And(FreeQ(List(a,b,c,d,e,f,m,p),x),Not(IntegerQ(p))),NonzeroQ(Plus(Power(c,C2),Times(CN1,C3,b,d)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C3,a,c)))))),
SetDelayed(Int(Times(Power($p(u),$p(m,true)),Power($p(v),$p(p,true))),$p(x,SymbolHead)),
    Condition(Int(Times(Power(ExpandToSum(u,x),m),Power(ExpandToSum(v,x),p)),x),And(And(And(FreeQ(List(m,p),x),LinearQ(u,x)),PolyQ(v,x,C3)),Not(And(LinearMatchQ(u,x),CubicMatchQ(v,x)))))),
SetDelayed(Int(Power(Plus(Times(Power($p(x),C2),$p(c,true)),Times(Power($p(x),C3),$p(d,true)),Times(Power($p(x),C4),$p(e,true)),Times($p(b,true),$p(x)),$p(a,true)),$p(p)),$p(x,SymbolHead)),
    Condition(Subst(Int(SimplifyIntegrand(Power(Plus(a,Times(Power(d,C4),Power(Times(ZZ(256L),Power(e,C3)),CN1)),Times(CN1,b,d,Power(Times(ZZ(8L),e),CN1)),Times(Plus(c,Times(CN1,C3,Power(d,C2),Power(Times(ZZ(8L),e),CN1))),Power(x,C2)),Times(e,Power(x,C4))),p),x),x),x,Plus(Times(d,Power(Times(C4,e),CN1)),x)),And(And(And(FreeQ(List(a,b,c,d,e,p),x),ZeroQ(Plus(Power(d,C3),Times(CN1,C4,c,d,e),Times(ZZ(8L),b,Power(e,C2))))),UnsameQ(p,C2)),UnsameQ(p,C3)))),
SetDelayed(Int(Power($p(v),$p(p)),$p(x,SymbolHead)),
    Condition(Module(List(Set(a,Coefficient(v,x,C0)),Set(b,Coefficient(v,x,C1)),Set(c,Coefficient(v,x,C2)),Set(d,Coefficient(v,x,C3)),Set(e,Coefficient(v,x,C4))),Condition(Subst(Int(SimplifyIntegrand(Power(Plus(a,Times(Power(d,C4),Power(Times(ZZ(256L),Power(e,C3)),CN1)),Times(CN1,b,d,Power(Times(ZZ(8L),e),CN1)),Times(Plus(c,Times(CN1,C3,Power(d,C2),Power(Times(ZZ(8L),e),CN1))),Power(x,C2)),Times(e,Power(x,C4))),p),x),x),x,Plus(Times(d,Power(Times(C4,e),CN1)),x)),And(ZeroQ(Plus(Power(d,C3),Times(CN1,C4,c,d,e),Times(ZZ(8L),b,Power(e,C2)))),NonzeroQ(d)))),And(And(And(And(FreeQ(p,x),PolynomialQ(v,x)),Equal(Exponent(v,x),C4)),UnsameQ(p,C2)),UnsameQ(p,C3)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),C2),$p(c,true)),Times(Power($p(x),C3),$p(d,true)),Times(Power($p(x),C4),$p(e,true)),Times($p(b,true),$p(x)),$p(a,true)),$p(p)),$p(u)),$p(x,SymbolHead)),
    Condition(Subst(Int(SimplifyIntegrand(Times(ReplaceAll(u,Rule(x,Plus(Times(CN1,d,Power(Times(C4,e),CN1)),x))),Power(Plus(a,Times(Power(d,C4),Power(Times(ZZ(256L),Power(e,C3)),CN1)),Times(CN1,b,d,Power(Times(ZZ(8L),e),CN1)),Times(Plus(c,Times(CN1,C3,Power(d,C2),Power(Times(ZZ(8L),e),CN1))),Power(x,C2)),Times(e,Power(x,C4))),p)),x),x),x,Plus(Times(d,Power(Times(C4,e),CN1)),x)),And(And(And(FreeQ(List(a,b,c,d,e,p),x),PolynomialQ(u,x)),ZeroQ(Plus(Power(d,C3),Times(CN1,C4,c,d,e),Times(ZZ(8L),b,Power(e,C2))))),Not(PositiveIntegerQ(p))))),
SetDelayed(Int(Times(Power($p(v),$p(p)),$p(u)),$p(x,SymbolHead)),
    Condition(Module(List(Set(a,Coefficient(v,x,C0)),Set(b,Coefficient(v,x,C1)),Set(c,Coefficient(v,x,C2)),Set(d,Coefficient(v,x,C3)),Set(e,Coefficient(v,x,C4))),Condition(Subst(Int(SimplifyIntegrand(Times(ReplaceAll(u,Rule(x,Plus(Times(CN1,d,Power(Times(C4,e),CN1)),x))),Power(Plus(a,Times(Power(d,C4),Power(Times(ZZ(256L),Power(e,C3)),CN1)),Times(CN1,b,d,Power(Times(ZZ(8L),e),CN1)),Times(Plus(c,Times(CN1,C3,Power(d,C2),Power(Times(ZZ(8L),e),CN1))),Power(x,C2)),Times(e,Power(x,C4))),p)),x),x),x,Plus(Times(d,Power(Times(C4,e),CN1)),x)),And(ZeroQ(Plus(Power(d,C3),Times(CN1,C4,c,d,e),Times(ZZ(8L),b,Power(e,C2)))),NonzeroQ(d)))),And(And(And(And(FreeQ(p,x),PolynomialQ(u,x)),PolynomialQ(v,x)),Equal(Exponent(v,x),C4)),Not(PositiveIntegerQ(p))))),
SetDelayed(Int(Power(Plus(Times(Power($p(x),C2),$p(c,true)),Times(Power($p(x),C3),$p(d,true)),Times(Power($p(x),C4),$p(e,true)),Times($p(b,true),$p(x)),$p(a)),$p(p)),$p(x,SymbolHead)),
    Condition(Times(ZZ(-16L),Power(a,C2),Subst(Int(Times(Power(Power(Plus(b,Times(CN1,C4,a,x)),C2),CN1),Power(Times(a,Plus(Times(CN3,Power(b,C4)),Times(ZZ(16L),a,Power(b,C2),c),Times(CN1,ZZ(64L),Power(a,C2),b,d),Times(ZZ(256L),Power(a,C3),e),Times(CN1,ZZ(32L),Power(a,C2),Plus(Times(C3,Power(b,C2)),Times(CN1,ZZ(8L),a,c)),Power(x,C2)),Times(ZZ(256L),Power(a,C4),Power(x,C4))),Power(Power(Plus(b,Times(CN1,C4,a,x)),C4),CN1)),p)),x),x,Plus(Times(b,Power(Times(C4,a),CN1)),Power(x,CN1)))),And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus(Power(b,C3),Times(CN1,C4,a,b,c),Times(ZZ(8L),Power(a,C2),d)))),IntegerQ(Times(C2,p))))),
SetDelayed(Int(Power($p(v),$p(p)),$p(x,SymbolHead)),
    Condition(Module(List(Set(a,Coefficient(v,x,C0)),Set(b,Coefficient(v,x,C1)),Set(c,Coefficient(v,x,C2)),Set(d,Coefficient(v,x,C3)),Set(e,Coefficient(v,x,C4))),Condition(Times(ZZ(-16L),Power(a,C2),Subst(Int(Times(Power(Power(Plus(b,Times(CN1,C4,a,x)),C2),CN1),Power(Times(a,Plus(Times(CN3,Power(b,C4)),Times(ZZ(16L),a,Power(b,C2),c),Times(CN1,ZZ(64L),Power(a,C2),b,d),Times(ZZ(256L),Power(a,C3),e),Times(CN1,ZZ(32L),Power(a,C2),Plus(Times(C3,Power(b,C2)),Times(CN1,ZZ(8L),a,c)),Power(x,C2)),Times(ZZ(256L),Power(a,C4),Power(x,C4))),Power(Power(Plus(b,Times(CN1,C4,a,x)),C4),CN1)),p)),x),x,Plus(Times(b,Power(Times(C4,a),CN1)),Power(x,CN1)))),And(And(NonzeroQ(a),NonzeroQ(b)),ZeroQ(Plus(Power(b,C3),Times(CN1,C4,a,b,c),Times(ZZ(8L),Power(a,C2),d)))))),And(And(And(FreeQ(p,x),PolynomialQ(v,x)),Equal(Exponent(v,x),C4)),IntegerQ(Times(C2,p))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),C2),$p("C",true)),Times(Power($p(x),C3),$p("D",true)),Times($p("B",true),$p(x)),$p("A",true)),Power(Plus(Times(Power($p(x),C2),$p(c,true)),Times(Power($p(x),C3),$p(d,true)),Times(Power($p(x),C4),$p(e,true)),Times($p(b,true),$p(x)),$p(a)),CN1)),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Sqrt(Plus(Times(ZZ(8L),Power(a,C2)),Power(b,C2),Times(CN1,C4,a,c))))),Plus(Times(Power(q,CN1),Int(Times(Plus(Times(b,$s("A")),Times(CN1,C2,a,$s("B")),Times(C2,a,$s("D")),Times($s("A"),q),Times(Plus(Times(C2,a,$s("A")),Times(CN1,C2,a,$s("C")),Times(b,$s("D")),Times($s("D"),q)),x)),Power(Plus(Times(C2,a),Times(Plus(b,q),x),Times(C2,a,Power(x,C2))),CN1)),x)),Times(CN1,Power(q,CN1),Int(Times(Plus(Times(b,$s("A")),Times(CN1,C2,a,$s("B")),Times(C2,a,$s("D")),Times(CN1,$s("A"),q),Times(Plus(Times(C2,a,$s("A")),Times(CN1,C2,a,$s("C")),Times(b,$s("D")),Times(CN1,$s("D"),q)),x)),Power(Plus(Times(C2,a),Times(Plus(b,Times(CN1,q)),x),Times(C2,a,Power(x,C2))),CN1)),x)))),And(And(And(FreeQ(List(a,b,c,$s("A"),$s("B"),$s("C"),$s("D")),x),ZeroQ(Plus(d,Times(CN1,b)))),ZeroQ(Plus(e,Times(CN1,a)))),SumQ(Factor(Plus(a,Times(b,x),Times(c,Power(x,C2)),Times(b,Power(x,C3)),Times(a,Power(x,C4)))))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),C3),$p("D",true)),Times($p("B",true),$p(x)),$p("A",true)),Power(Plus(Times(Power($p(x),C2),$p(c,true)),Times(Power($p(x),C3),$p(d,true)),Times(Power($p(x),C4),$p(e,true)),Times($p(b,true),$p(x)),$p(a)),CN1)),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Sqrt(Plus(Times(ZZ(8L),Power(a,C2)),Power(b,C2),Times(CN1,C4,a,c))))),Plus(Times(Power(q,CN1),Int(Times(Plus(Times(b,$s("A")),Times(CN1,C2,a,$s("B")),Times(C2,a,$s("D")),Times($s("A"),q),Times(Plus(Times(C2,a,$s("A")),Times(b,$s("D")),Times($s("D"),q)),x)),Power(Plus(Times(C2,a),Times(Plus(b,q),x),Times(C2,a,Power(x,C2))),CN1)),x)),Times(CN1,Power(q,CN1),Int(Times(Plus(Times(b,$s("A")),Times(CN1,C2,a,$s("B")),Times(C2,a,$s("D")),Times(CN1,$s("A"),q),Times(Plus(Times(C2,a,$s("A")),Times(b,$s("D")),Times(CN1,$s("D"),q)),x)),Power(Plus(Times(C2,a),Times(Plus(b,Times(CN1,q)),x),Times(C2,a,Power(x,C2))),CN1)),x)))),And(And(And(FreeQ(List(a,b,c,$s("A"),$s("B"),$s("D")),x),ZeroQ(Plus(d,Times(CN1,b)))),ZeroQ(Plus(e,Times(CN1,a)))),SumQ(Factor(Plus(a,Times(b,x),Times(c,Power(x,C2)),Times(b,Power(x,C3)),Times(a,Power(x,C4)))))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),C2),$p("C",true)),Times(Power($p(x),C3),$p("D",true)),Times($p("B",true),$p(x)),$p("A",true)),Power(Plus(Times(Power($p(x),C2),$p(c,true)),Times(Power($p(x),C3),$p(d,true)),Times(Power($p(x),C4),$p(e,true)),Times($p(b,true),$p(x)),$p(a)),CN1),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Sqrt(Plus(Times(ZZ(8L),Power(a,C2)),Power(b,C2),Times(CN1,C4,a,c))))),Plus(Times(Power(q,CN1),Int(Times(Power(x,m),Plus(Times(b,$s("A")),Times(CN1,C2,a,$s("B")),Times(C2,a,$s("D")),Times($s("A"),q),Times(Plus(Times(C2,a,$s("A")),Times(CN1,C2,a,$s("C")),Times(b,$s("D")),Times($s("D"),q)),x)),Power(Plus(Times(C2,a),Times(Plus(b,q),x),Times(C2,a,Power(x,C2))),CN1)),x)),Times(CN1,Power(q,CN1),Int(Times(Power(x,m),Plus(Times(b,$s("A")),Times(CN1,C2,a,$s("B")),Times(C2,a,$s("D")),Times(CN1,$s("A"),q),Times(Plus(Times(C2,a,$s("A")),Times(CN1,C2,a,$s("C")),Times(b,$s("D")),Times(CN1,$s("D"),q)),x)),Power(Plus(Times(C2,a),Times(Plus(b,Times(CN1,q)),x),Times(C2,a,Power(x,C2))),CN1)),x)))),And(And(And(FreeQ(List(a,b,c,$s("A"),$s("B"),$s("C"),$s("D"),m),x),ZeroQ(Plus(d,Times(CN1,b)))),ZeroQ(Plus(e,Times(CN1,a)))),SumQ(Factor(Plus(a,Times(b,x),Times(c,Power(x,C2)),Times(b,Power(x,C3)),Times(a,Power(x,C4)))))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),C3),$p("D",true)),Times($p("B",true),$p(x)),$p("A",true)),Power(Plus(Times(Power($p(x),C2),$p(c,true)),Times(Power($p(x),C3),$p(d,true)),Times(Power($p(x),C4),$p(e,true)),Times($p(b,true),$p(x)),$p(a)),CN1),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Sqrt(Plus(Times(ZZ(8L),Power(a,C2)),Power(b,C2),Times(CN1,C4,a,c))))),Plus(Times(Power(q,CN1),Int(Times(Power(x,m),Plus(Times(b,$s("A")),Times(CN1,C2,a,$s("B")),Times(C2,a,$s("D")),Times($s("A"),q),Times(Plus(Times(C2,a,$s("A")),Times(b,$s("D")),Times($s("D"),q)),x)),Power(Plus(Times(C2,a),Times(Plus(b,q),x),Times(C2,a,Power(x,C2))),CN1)),x)),Times(CN1,Power(q,CN1),Int(Times(Power(x,m),Plus(Times(b,$s("A")),Times(CN1,C2,a,$s("B")),Times(C2,a,$s("D")),Times(CN1,$s("A"),q),Times(Plus(Times(C2,a,$s("A")),Times(b,$s("D")),Times(CN1,$s("D"),q)),x)),Power(Plus(Times(C2,a),Times(Plus(b,Times(CN1,q)),x),Times(C2,a,Power(x,C2))),CN1)),x)))),And(And(And(FreeQ(List(a,b,c,$s("A"),$s("B"),$s("D"),m),x),ZeroQ(Plus(d,Times(CN1,b)))),ZeroQ(Plus(e,Times(CN1,a)))),SumQ(Factor(Plus(a,Times(b,x),Times(c,Power(x,C2)),Times(b,Power(x,C3)),Times(a,Power(x,C4)))))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),$p(n)),$p("B",true)),$p("A")),Power(Plus(Times(Power($p(x),C2),$p(b,true)),Times(Power($p(x),$p(n)),$p(c,true)),Times(Power($p(x),$p(j)),$p(d,true)),$p(a)),CN1)),$p(x,SymbolHead)),
    Condition(Times($s("A"),Power(Times(a,Rt(Times(b,Power(a,CN1)),C2)),CN1),ArcTan(Times($s("A"),Plus(n,Times(CN1,C1)),Rt(Times(b,Power(a,CN1)),C2),x,Power(Plus(Times($s("A"),Plus(n,Times(CN1,C1))),Times(CN1,$s("B"),Power(x,n))),CN1)))),And(And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B"),n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(n,Times(CN1,C2)))),ZeroQ(Plus(Times(a,Power($s("B"),C2)),Times(CN1,Power($s("A"),C2),d,Power(Plus(n,Times(CN1,C1)),C2))))),ZeroQ(Plus(Times($s("B"),c),Times(C2,$s("A"),d,Plus(n,Times(CN1,C1)))))),PosQ(Times(b,Power(a,CN1)))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),$p(n)),$p("B",true)),$p("A")),Power(Plus(Times(Power($p(x),C2),$p(b,true)),Times(Power($p(x),$p(n)),$p(c,true)),Times(Power($p(x),$p(j)),$p(d,true)),$p(a)),CN1)),$p(x,SymbolHead)),
    Condition(Times($s("A"),Power(Times(a,Rt(Times(CN1,b,Power(a,CN1)),C2)),CN1),ArcTanh(Times($s("A"),Plus(n,Times(CN1,C1)),Rt(Times(CN1,b,Power(a,CN1)),C2),x,Power(Plus(Times($s("A"),Plus(n,Times(CN1,C1))),Times(CN1,$s("B"),Power(x,n))),CN1)))),And(And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B"),n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(n,Times(CN1,C2)))),ZeroQ(Plus(Times(Power($s("B"),C2),a),Times(CN1,Power($s("A"),C2),d,Power(Plus(n,Times(CN1,C1)),C2))))),ZeroQ(Plus(Times($s("B"),c),Times(C2,$s("A"),d,Plus(n,Times(CN1,C1)))))),NegQ(Times(b,Power(a,CN1)))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),$p(n,true)),$p("B",true)),$p("A")),Power(Plus(Times(Power($p(x),$p(k,true)),$p(b,true)),Times(Power($p(x),$p(n,true)),$p(c,true)),Times(Power($p(x),$p(j)),$p(d,true)),$p(a)),CN1),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times($s("A"),Power(Times(Plus(m,C1),Rt(Times(a,b),C2)),CN1),ArcTan(Times($s("A"),Plus(m,Times(CN1,n),C1),Rt(Times(a,b),C2),Power(x,Plus(m,C1)),Power(Times(a,Plus(Times($s("A"),Plus(m,Times(CN1,n),C1)),Times($s("B"),Plus(m,C1),Power(x,n)))),CN1)))),And(And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B"),m,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(k,Times(CN1,C2,Plus(m,C1))))),ZeroQ(Plus(Times(a,Power($s("B"),C2),Power(Plus(m,C1),C2)),Times(CN1,Power($s("A"),C2),d,Power(Plus(m,Times(CN1,n),C1),C2))))),ZeroQ(Plus(Times($s("B"),c,Plus(m,C1)),Times(CN1,C2,$s("A"),d,Plus(m,Times(CN1,n),C1))))),PosQ(Times(a,b))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),$p(n,true)),$p("B",true)),$p("A")),Power(Plus(Times(Power($p(x),$p(k,true)),$p(b,true)),Times(Power($p(x),$p(n,true)),$p(c,true)),Times(Power($p(x),$p(j)),$p(d,true)),$p(a)),CN1),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times($s("A"),Power(Times(Plus(m,C1),Rt(Times(CN1,a,b),C2)),CN1),ArcTanh(Times($s("A"),Plus(m,Times(CN1,n),C1),Rt(Times(CN1,a,b),C2),Power(x,Plus(m,C1)),Power(Times(a,Plus(Times($s("A"),Plus(m,Times(CN1,n),C1)),Times($s("B"),Plus(m,C1),Power(x,n)))),CN1)))),And(And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B"),m,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(k,Times(CN1,C2,Plus(m,C1))))),ZeroQ(Plus(Times(a,Power($s("B"),C2),Power(Plus(m,C1),C2)),Times(CN1,Power($s("A"),C2),d,Power(Plus(m,Times(CN1,n),C1),C2))))),ZeroQ(Plus(Times($s("B"),c,Plus(m,C1)),Times(CN1,C2,$s("A"),d,Plus(m,Times(CN1,n),C1))))),NegQ(Times(a,b))))),
SetDelayed(Int(Times(Power(Plus(Times(Power(Plus(Times($p(d,true),$p(x)),$p(c)),$p(n)),$p(b,true)),$p(a,true)),$p(p)),Power($p(u),$p(m,true))),$p(x,SymbolHead)),
    Condition(Module(List(Set(k,Denominator(n))),Times(k,Power(d,CN1),Subst(Int(SimplifyIntegrand(Times(Power(x,Plus(k,Times(CN1,C1))),Power(ReplaceAll(u,Rule(x,Plus(Times(Power(x,k),Power(d,CN1)),Times(CN1,c,Power(d,CN1))))),m),Power(Plus(a,Times(b,Power(x,Times(k,n)))),p)),x),x),x,Power(Plus(c,Times(d,x)),Power(k,CN1))))),And(And(And(FreeQ(List(a,b,c,d,p),x),PolynomialQ(u,x)),IntegerQ(m)),RationalQ(n)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n,true)),$p(b,true)),$p(a)),$p(p,true)),$p(u)),$p(x,SymbolHead)),
    Condition(Int(Times(PolynomialQuotient(u,Plus(a,Times(b,Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1))),x),And(And(And(FreeQ(List(a,b,p),x),PolynomialQ(u,x)),PositiveIntegerQ(n)),ZeroQ(PolynomialRemainder(u,Plus(a,Times(b,Power(x,n))),x))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a)),$p(p)),$p(u)),$p(x,SymbolHead)),
    Condition(Plus(Times(Coefficient(u,x,Plus(n,Times(CN1,C1))),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Times(b,n,Plus(p,C1)),CN1)),Int(Times(ExpandToSum(Plus(u,Times(CN1,Coefficient(u,x,Plus(n,Times(CN1,C1))),Power(x,Plus(n,Times(CN1,C1))))),x),Power(Plus(a,Times(b,Power(x,n))),p)),x)),And(And(And(FreeQ(List(a,b),x),PolynomialQ(u,x)),PositiveIntegerQ(n,p)),NonzeroQ(Coefficient(u,x,Plus(n,Times(CN1,C1))))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a)),$p(p,true)),$p(u)),$p(x,SymbolHead)),
    Condition(Int(ExpandIntegrand(Times(u,Power(Plus(a,Times(b,Power(x,n))),p)),x),x),And(And(And(FreeQ(List(a,b),x),PolynomialQ(u,x)),PositiveIntegerQ(n,p)),ZeroQ(Coefficient(u,x,Plus(n,Times(CN1,C1))))))),
SetDelayed(Int(Times(Plus(Times($p("B",true),$p(x)),$p("A")),Power(Plus(Times(Power($p(x),C3),$p(b,true)),$p(a)),CN1)),$p(x,SymbolHead)),
    Condition(Times(Power($s("B"),C3),Power(b,CN1),Int(Power(Plus(Power($s("A"),C2),Times(CN1,$s("A"),$s("B"),x),Times(Power($s("B"),C2),Power(x,C2))),CN1),x)),And(FreeQ(List(a,b,$s("A"),$s("B")),x),ZeroQ(Plus(Times(a,Power($s("B"),C3)),Times(CN1,b,Power($s("A"),C3))))))),
SetDelayed(Int(Times(Plus(Times($p("B",true),$p(x)),$p("A")),Power(Plus(Times(Power($p(x),C3),$p(b,true)),$p(a)),CN1)),$p(x,SymbolHead)),
    Condition(Module(List(Set(r,Numerator(Rt(Times(a,Power(b,CN1)),C3))),Set(s,Denominator(Rt(Times(a,Power(b,CN1)),C3)))),Plus(Times(CN1,r,Plus(Times($s("B"),r),Times(CN1,$s("A"),s)),Power(Times(C3,a,s),CN1),Int(Power(Plus(r,Times(s,x)),CN1),x)),Times(r,Power(Times(C3,a,s),CN1),Int(Times(Plus(Times(r,Plus(Times($s("B"),r),Times(C2,$s("A"),s))),Times(s,Plus(Times($s("B"),r),Times(CN1,$s("A"),s)),x)),Power(Plus(Power(r,C2),Times(CN1,r,s,x),Times(Power(s,C2),Power(x,C2))),CN1)),x)))),And(And(FreeQ(List(a,b,$s("A"),$s("B")),x),NonzeroQ(Plus(Times(a,Power($s("B"),C3)),Times(CN1,b,Power($s("A"),C3))))),PosQ(Times(a,Power(b,CN1)))))),
SetDelayed(Int(Times(Plus(Times($p("B",true),$p(x)),$p("A")),Power(Plus(Times(Power($p(x),C3),$p(b,true)),$p(a)),CN1)),$p(x,SymbolHead)),
    Condition(Module(List(Set(r,Numerator(Rt(Times(CN1,a,Power(b,CN1)),C3))),Set(s,Denominator(Rt(Times(CN1,a,Power(b,CN1)),C3)))),Plus(Times(r,Plus(Times($s("B"),r),Times($s("A"),s)),Power(Times(C3,a,s),CN1),Int(Power(Plus(r,Times(CN1,s,x)),CN1),x)),Times(CN1,r,Power(Times(C3,a,s),CN1),Int(Times(Plus(Times(r,Plus(Times($s("B"),r),Times(CN1,C2,$s("A"),s))),Times(CN1,s,Plus(Times($s("B"),r),Times($s("A"),s)),x)),Power(Plus(Power(r,C2),Times(r,s,x),Times(Power(s,C2),Power(x,C2))),CN1)),x)))),And(And(FreeQ(List(a,b,$s("A"),$s("B")),x),NonzeroQ(Plus(Times(a,Power($s("B"),C3)),Times(CN1,b,Power($s("A"),C3))))),NegQ(Times(a,Power(b,CN1)))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),C2),$p("C",true)),Times($p("B",true),$p(x)),$p("A",true)),Power(Plus(Times(Power($p(x),C3),$p(b,true)),$p(a)),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Int(Times(Plus($s("A"),Times($s("B"),x)),Power(Plus(a,Times(b,Power(x,C3))),CN1)),x),Times($s("C"),Int(Times(Power(x,C2),Power(Plus(a,Times(b,Power(x,C3))),CN1)),x))),And(FreeQ(List(a,b,$s("A"),$s("B"),$s("C")),x),Or(ZeroQ(Plus(Times(a,Power($s("B"),C3)),Times(CN1,b,Power($s("A"),C3)))),Not(RationalQ(Times(a,Power(b,CN1)))))))),
SetDelayed(Int(Times(Plus(Times($p("C",true),$p(x)),$p("B")),Power(Plus(Times(Power($p(x),C3),$p(b,true)),$p(a)),CN1),$p(x)),$p(x,SymbolHead)),
    Condition(Plus(Times($s("B"),Int(Times(x,Power(Plus(a,Times(b,Power(x,C3))),CN1)),x)),Times($s("C"),Int(Times(Power(x,C2),Power(Plus(a,Times(b,Power(x,C3))),CN1)),x))),And(FreeQ(List(a,b,$s("B"),$s("C")),x),Not(RationalQ(Times(a,Power(b,CN1))))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),C2),$p("C",true)),$p("A")),Power(Plus(Times(Power($p(x),C3),$p(b,true)),$p(a)),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times($s("A"),Int(Power(Plus(a,Times(b,Power(x,C3))),CN1),x)),Times($s("C"),Int(Times(Power(x,C2),Power(Plus(a,Times(b,Power(x,C3))),CN1)),x))),And(FreeQ(List(a,b,$s("A"),$s("C")),x),Not(RationalQ(a,b,$s("A"),$s("C")))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),C2),$p("C",true)),Times($p("B",true),$p(x)),$p("A",true)),Power(Plus(Times(Power($p(x),C3),$p(b,true)),$p(a)),CN1)),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Power(Times(a,Power(b,CN1)),C1D3))),Condition(Times(Power(q,C2),Power(a,CN1),Int(Times(Plus($s("A"),Times($s("C"),q,x)),Power(Plus(Power(q,C2),Times(CN1,q,x),Power(x,C2)),CN1)),x)),ZeroQ(Plus($s("A"),Times(CN1,$s("B"),q),Times($s("C"),Power(q,C2)))))),And(And(And(FreeQ(List(a,b,$s("A"),$s("B"),$s("C")),x),NonzeroQ(Plus(Times(a,Power($s("B"),C3)),Times(CN1,b,Power($s("A"),C3))))),RationalQ(Times(a,Power(b,CN1)))),Greater(Times(a,Power(b,CN1)),C0)))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),C2),$p("C",true)),Times($p("B"),$p(x))),Power(Plus(Times(Power($p(x),C3),$p(b,true)),$p(a)),CN1)),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Power(Times(a,Power(b,CN1)),C1D3))),Condition(Times($s("B"),Power(q,C2),Power(a,CN1),Int(Times(x,Power(Plus(Power(q,C2),Times(CN1,q,x),Power(x,C2)),CN1)),x)),ZeroQ(Plus(Times(CN1,$s("B")),Times($s("C"),q))))),And(And(FreeQ(List(a,b,$s("B"),$s("C")),x),RationalQ(Times(a,Power(b,CN1)))),Greater(Times(a,Power(b,CN1)),C0)))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),C2),$p("C",true)),$p("A")),Power(Plus(Times(Power($p(x),C3),$p(b,true)),$p(a)),CN1)),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Power(Times(a,Power(b,CN1)),C1D3))),Condition(Times(Power(q,C2),Power(a,CN1),Int(Times(Plus($s("A"),Times($s("C"),q,x)),Power(Plus(Power(q,C2),Times(CN1,q,x),Power(x,C2)),CN1)),x)),ZeroQ(Plus($s("A"),Times($s("C"),Power(q,C2)))))),And(And(FreeQ(List(a,b,$s("A"),$s("C")),x),RationalQ(Times(a,Power(b,CN1)))),Greater(Times(a,Power(b,CN1)),C0)))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),C2),$p("C",true)),Times($p("B",true),$p(x)),$p("A",true)),Power(Plus(Times(Power($p(x),C3),$p(b,true)),$p(a)),CN1)),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Power(Times(a,Power(b,CN1)),C1D3))),Condition(Plus(Times(q,Plus($s("A"),Times(CN1,$s("B"),q),Times($s("C"),Power(q,C2))),Power(Times(C3,a),CN1),Int(Power(Plus(q,x),CN1),x)),Times(q,Power(Times(C3,a),CN1),Int(Times(Plus(Times(q,Plus(Times(C2,$s("A")),Times($s("B"),q),Times(CN1,$s("C"),Power(q,C2)))),Times(CN1,Plus($s("A"),Times(CN1,$s("B"),q),Times(CN1,C2,$s("C"),Power(q,C2))),x)),Power(Plus(Power(q,C2),Times(CN1,q,x),Power(x,C2)),CN1)),x))),NonzeroQ(Plus($s("A"),Times(CN1,$s("B"),q),Times($s("C"),Power(q,C2)))))),And(And(And(FreeQ(List(a,b,$s("A"),$s("B"),$s("C")),x),NonzeroQ(Plus(Times(a,Power($s("B"),C3)),Times(CN1,b,Power($s("A"),C3))))),RationalQ(Times(a,Power(b,CN1)))),Greater(Times(a,Power(b,CN1)),C0)))),
SetDelayed(Int(Times(Plus(Times($p("C",true),$p(x)),$p("B")),Power(Plus(Times(Power($p(x),C3),$p(b,true)),$p(a)),CN1),$p(x)),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Power(Times(a,Power(b,CN1)),C1D3))),Condition(Plus(Times(CN1,q,Plus(Times($s("B"),q),Times(CN1,$s("C"),Power(q,C2))),Power(Times(C3,a),CN1),Int(Power(Plus(q,x),CN1),x)),Times(q,Power(Times(C3,a),CN1),Int(Times(Plus(Times(q,Plus(Times($s("B"),q),Times(CN1,$s("C"),Power(q,C2)))),Times(Plus(Times($s("B"),q),Times(C2,$s("C"),Power(q,C2))),x)),Power(Plus(Power(q,C2),Times(CN1,q,x),Power(x,C2)),CN1)),x))),NonzeroQ(Plus(Times($s("B"),q),Times(CN1,$s("C"),Power(q,C2)))))),And(And(FreeQ(List(a,b,$s("B"),$s("C")),x),RationalQ(Times(a,Power(b,CN1)))),Greater(Times(a,Power(b,CN1)),C0)))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),C2),$p("C",true)),$p("A")),Power(Plus(Times(Power($p(x),C3),$p(b,true)),$p(a)),CN1)),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Power(Times(a,Power(b,CN1)),C1D3))),Condition(Plus(Times(q,Plus($s("A"),Times($s("C"),Power(q,C2))),Power(Times(C3,a),CN1),Int(Power(Plus(q,x),CN1),x)),Times(q,Power(Times(C3,a),CN1),Int(Times(Plus(Times(q,Plus(Times(C2,$s("A")),Times(CN1,$s("C"),Power(q,C2)))),Times(CN1,Plus($s("A"),Times(CN1,C2,$s("C"),Power(q,C2))),x)),Power(Plus(Power(q,C2),Times(CN1,q,x),Power(x,C2)),CN1)),x))),NonzeroQ(Plus($s("A"),Times($s("C"),Power(q,C2)))))),And(And(FreeQ(List(a,b,$s("A"),$s("C")),x),RationalQ(Times(a,Power(b,CN1)))),Greater(Times(a,Power(b,CN1)),C0)))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),C2),$p("C",true)),Times($p("B",true),$p(x)),$p("A",true)),Power(Plus(Times(Power($p(x),C3),$p(b,true)),$p(a)),CN1)),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Power(Times(CN1,a,Power(b,CN1)),C1D3))),Condition(Times(q,Power(a,CN1),Int(Times(Plus(Times($s("A"),q),Times(Plus($s("A"),Times($s("B"),q)),x)),Power(Plus(Power(q,C2),Times(q,x),Power(x,C2)),CN1)),x)),ZeroQ(Plus($s("A"),Times($s("B"),q),Times($s("C"),Power(q,C2)))))),And(And(And(FreeQ(List(a,b,$s("A"),$s("B"),$s("C")),x),NonzeroQ(Plus(Times(a,Power($s("B"),C3)),Times(CN1,b,Power($s("A"),C3))))),RationalQ(Times(a,Power(b,CN1)))),Less(Times(a,Power(b,CN1)),C0)))),
SetDelayed(Int(Times(Plus(Times($p("C",true),$p(x)),$p("B")),Power(Plus(Times(Power($p(x),C3),$p(b,true)),$p(a)),CN1),$p(x)),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Power(Times(CN1,a,Power(b,CN1)),C1D3))),Condition(Times($s("B"),Power(q,C2),Power(a,CN1),Int(Times(x,Power(Plus(Power(q,C2),Times(q,x),Power(x,C2)),CN1)),x)),ZeroQ(Plus(Times($s("B"),q),Times($s("C"),Power(q,C2)))))),And(And(FreeQ(List(a,b,$s("B"),$s("C")),x),RationalQ(Times(a,Power(b,CN1)))),Less(Times(a,Power(b,CN1)),C0)))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),C2),$p("C",true)),$p("A")),Power(Plus(Times(Power($p(x),C3),$p(b,true)),$p(a)),CN1)),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Power(Times(CN1,a,Power(b,CN1)),C1D3))),Condition(Times($s("A"),q,Power(a,CN1),Int(Times(Plus(q,x),Power(Plus(Power(q,C2),Times(q,x),Power(x,C2)),CN1)),x)),ZeroQ(Plus($s("A"),Times($s("C"),Power(q,C2)))))),And(And(FreeQ(List(a,b,$s("A"),$s("C")),x),RationalQ(Times(a,Power(b,CN1)))),Less(Times(a,Power(b,CN1)),C0)))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),C2),$p("C",true)),Times($p("B",true),$p(x)),$p("A",true)),Power(Plus(Times(Power($p(x),C3),$p(b,true)),$p(a)),CN1)),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Power(Times(CN1,a,Power(b,CN1)),C1D3))),Condition(Plus(Times(q,Plus($s("A"),Times($s("B"),q),Times($s("C"),Power(q,C2))),Power(Times(C3,a),CN1),Int(Power(Plus(q,Times(CN1,x)),CN1),x)),Times(q,Power(Times(C3,a),CN1),Int(Times(Plus(Times(q,Plus(Times(C2,$s("A")),Times(CN1,$s("B"),q),Times(CN1,$s("C"),Power(q,C2)))),Times(Plus($s("A"),Times($s("B"),q),Times(CN1,C2,$s("C"),Power(q,C2))),x)),Power(Plus(Power(q,C2),Times(q,x),Power(x,C2)),CN1)),x))),NonzeroQ(Plus($s("A"),Times($s("B"),q),Times($s("C"),Power(q,C2)))))),And(And(And(FreeQ(List(a,b,$s("A"),$s("B"),$s("C")),x),NonzeroQ(Plus(Times(a,Power($s("B"),C3)),Times(CN1,b,Power($s("A"),C3))))),RationalQ(Times(a,Power(b,CN1)))),Less(Times(a,Power(b,CN1)),C0)))),
SetDelayed(Int(Times(Plus(Times($p("C",true),$p(x)),$p("B")),Power(Plus(Times(Power($p(x),C3),$p(b,true)),$p(a)),CN1),$p(x)),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Power(Times(CN1,a,Power(b,CN1)),C1D3))),Condition(Plus(Times(q,Plus(Times($s("B"),q),Times($s("C"),Power(q,C2))),Power(Times(C3,a),CN1),Int(Power(Plus(q,Times(CN1,x)),CN1),x)),Times(q,Power(Times(C3,a),CN1),Int(Times(Plus(Times(CN1,q,Plus(Times($s("B"),q),Times($s("C"),Power(q,C2)))),Times(Plus(Times($s("B"),q),Times(CN1,C2,$s("C"),Power(q,C2))),x)),Power(Plus(Power(q,C2),Times(q,x),Power(x,C2)),CN1)),x))),NonzeroQ(Plus(Times($s("B"),q),Times($s("C"),Power(q,C2)))))),And(And(FreeQ(List(a,b,$s("B"),$s("C")),x),RationalQ(Times(a,Power(b,CN1)))),Less(Times(a,Power(b,CN1)),C0)))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),C2),$p("C",true)),$p("A")),Power(Plus(Times(Power($p(x),C3),$p(b,true)),$p(a)),CN1)),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Power(Times(CN1,a,Power(b,CN1)),C1D3))),Condition(Plus(Times(q,Plus($s("A"),Times($s("C"),Power(q,C2))),Power(Times(C3,a),CN1),Int(Power(Plus(q,Times(CN1,x)),CN1),x)),Times(q,Power(Times(C3,a),CN1),Int(Times(Plus(Times(q,Plus(Times(C2,$s("A")),Times(CN1,$s("C"),Power(q,C2)))),Times(Plus($s("A"),Times(CN1,C2,$s("C"),Power(q,C2))),x)),Power(Plus(Power(q,C2),Times(q,x),Power(x,C2)),CN1)),x))),NonzeroQ(Plus($s("A"),Times($s("C"),Power(q,C2)))))),And(And(FreeQ(List(a,b,$s("A"),$s("C")),x),RationalQ(Times(a,Power(b,CN1)))),Less(Times(a,Power(b,CN1)),C0)))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),$p(m)),$p("B",true)),$p("A")),Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a)),$p(p,true))),$p(x,SymbolHead)),
    Condition(Plus(Times($s("A"),Int(Power(Plus(a,Times(b,Power(x,n))),p),x)),Times($s("B"),Int(Times(Power(x,Plus(n,Times(CN1,C1))),Power(Plus(a,Times(b,Power(x,n))),p)),x))),And(FreeQ(List(a,b,$s("A"),$s("B"),m,n,p),x),ZeroQ(Plus(m,Times(CN1,n),C1))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a)),$p(p)),$p(u)),$p(x,SymbolHead)),
    Condition(Plus(Times(Coefficient(u,x,Plus(n,Times(CN1,C1))),Int(Times(Power(x,Plus(n,Times(CN1,C1))),Power(Plus(a,Times(b,Power(x,n))),p)),x)),Int(Times(ExpandToSum(Plus(u,Times(CN1,Coefficient(u,x,Plus(n,Times(CN1,C1))),Power(x,Plus(n,Times(CN1,C1))))),x),Power(Plus(a,Times(b,Power(x,n))),p)),x)),And(And(And(FreeQ(List(a,b,p),x),PolynomialQ(u,x)),PositiveIntegerQ(n)),Equal(Exponent(u,x),Plus(n,Times(CN1,C1)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a)),$p(p)),$p(u)),$p(x,SymbolHead)),
    Condition(Plus(Times(x,Sum(Times(Coefficient(u,x,k),Power(x,k),Power(Plus(Times(n,p),k,C1),CN1)),List(k,C0,Plus(n,Times(CN1,C2)))),Power(Plus(a,Times(b,Power(x,n))),p)),Times(a,n,p,Int(Times(Sum(Times(Coefficient(u,x,k),Power(x,k),Power(Plus(Times(n,p),k,C1),CN1)),List(k,C0,Plus(n,Times(CN1,C2)))),Power(Plus(a,Times(b,Power(x,n))),Plus(p,Times(CN1,C1)))),x))),And(And(And(And(And(FreeQ(List(a,b),x),PolynomialQ(u,x)),PositiveIntegerQ(n)),Less(Less(C0,Exponent(u,x)),Plus(n,Times(CN1,C1)))),RationalQ(p)),Greater(p,C0)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a)),CN1),$p(u)),$p(x,SymbolHead)),
    Condition(Module(List(Set(v,Sum(Times(Power(x,i),Plus(Coefficient(u,x,i),Times(Coefficient(u,x,Plus(Times(C1D2,n),i)),Power(x,Times(C1D2,n)))),Power(Plus(a,Times(b,Power(x,n))),CN1)),List(i,C0,Plus(Times(C1D2,n),Times(CN1,C1)))))),Condition(Int(v,x),SumQ(v))),And(And(And(FreeQ(List(a,b),x),PolynomialQ(u,x)),PositiveIntegerQ(Times(C1D2,n))),Less(Exponent(u,x),Plus(n,Times(CN1,C1)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a)),CN1),$p(u)),$p(x,SymbolHead)),
    Condition(Int(ExpandIntegrand(Times(u,Power(Plus(a,Times(b,Power(x,n))),CN1)),x),x),And(And(FreeQ(List(a,b),x),PolynomialQ(u,x)),PositiveIntegerQ(n))))
  );
}