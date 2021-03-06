package org.matheclipse.core.builtin;

import static org.matheclipse.core.expression.F.*;

public final class FunctionDefinitions {
	static {
		AbsArg.setEvaluator(new org.matheclipse.core.reflection.system.AbsArg());
		BesselJ.setEvaluator(new org.matheclipse.core.reflection.system.BesselJ());
		ComplexExpand.setEvaluator(new org.matheclipse.core.reflection.system.ComplexExpand());
		ContinuedFraction.setEvaluator(new org.matheclipse.core.reflection.system.ContinuedFraction());
		Curl.setEvaluator(new org.matheclipse.core.reflection.system.Curl());
		D.setEvaluator(new org.matheclipse.core.reflection.system.D());
		Default.setEvaluator(new org.matheclipse.core.reflection.system.Default());
		Derivative.setEvaluator(new org.matheclipse.core.reflection.system.Derivative());
		Distribute.setEvaluator(new org.matheclipse.core.reflection.system.Distribute());
		Divergence.setEvaluator(new org.matheclipse.core.reflection.system.Divergence());
		DSolve.setEvaluator(new org.matheclipse.core.reflection.system.DSolve());
		EasterSunday.setEvaluator(new org.matheclipse.core.reflection.system.EasterSunday());
		ElementData.setEvaluator(new org.matheclipse.core.data.ElementData());
		Eliminate.setEvaluator(new org.matheclipse.core.reflection.system.Eliminate());
		Export.setEvaluator(new org.matheclipse.core.reflection.system.Export());
		FindInstance.setEvaluator(new org.matheclipse.core.reflection.system.FindInstance());
		FindRoot.setEvaluator(new org.matheclipse.core.reflection.system.FindRoot());
		Fit.setEvaluator(new org.matheclipse.core.reflection.system.Fit());
		FrobeniusSolve.setEvaluator(new org.matheclipse.core.reflection.system.FrobeniusSolve());
		FromContinuedFraction.setEvaluator(new org.matheclipse.core.reflection.system.FromContinuedFraction());
		FromPolarCoordinates.setEvaluator(new org.matheclipse.core.reflection.system.FromPolarCoordinates());
		GeometricMean.setEvaluator(new org.matheclipse.core.reflection.system.GeometricMean());
		GroebnerBasis.setEvaluator(new org.matheclipse.core.reflection.system.GroebnerBasis());
		HeavisideTheta.setEvaluator(new org.matheclipse.core.reflection.system.HeavisideTheta());
		Horner.setEvaluator(new org.matheclipse.core.reflection.system.Horner());
		Import.setEvaluator(new org.matheclipse.core.reflection.system.Import());
		InterpolatingFunction.setEvaluator(new org.matheclipse.core.reflection.system.InterpolatingFunction());
		InterpolatingPolynomial.setEvaluator(new org.matheclipse.core.reflection.system.InterpolatingPolynomial());
		Interpolation.setEvaluator(new org.matheclipse.core.reflection.system.Interpolation());
		Interval.setEvaluator(new org.matheclipse.core.reflection.system.Interval()); 
		InverseFunction.setEvaluator(new org.matheclipse.core.reflection.system.InverseFunction());
		InverseLaplaceTransform.setEvaluator(new org.matheclipse.core.reflection.system.InverseLaplaceTransform());
		LaplaceTransform.setEvaluator(new org.matheclipse.core.reflection.system.LaplaceTransform());
		LinearProgramming.setEvaluator(new org.matheclipse.core.reflection.system.LinearProgramming());
		MonomialList.setEvaluator(new org.matheclipse.core.reflection.system.MonomialList());
		Names.setEvaluator(new org.matheclipse.core.reflection.system.Names());
		NDSolve.setEvaluator(new org.matheclipse.core.reflection.system.NDSolve());
		NFourierTransform.setEvaluator(new org.matheclipse.core.reflection.system.NFourierTransform());
		NIntegrate.setEvaluator(new org.matheclipse.core.reflection.system.NIntegrate());
		NMaximize.setEvaluator(new org.matheclipse.core.reflection.system.NMaximize());
		NMinimize.setEvaluator(new org.matheclipse.core.reflection.system.NMinimize());
		NonCommutativeMultiply.setEvaluator(new org.matheclipse.core.reflection.system.NonCommutativeMultiply());
		NSolve.setEvaluator(new org.matheclipse.core.reflection.system.NSolve());
		Out.setEvaluator(new org.matheclipse.core.reflection.system.Out());
		Outer.setEvaluator(new org.matheclipse.core.reflection.system.Outer());
		Plot.setEvaluator(new org.matheclipse.core.reflection.system.Plot());
		Plot3D.setEvaluator(new org.matheclipse.core.reflection.system.Plot3D());
		Product.setEvaluator(new org.matheclipse.core.reflection.system.Product());
		
		Rationalize.setEvaluator(new org.matheclipse.core.reflection.system.Rationalize());
		Replace.setEvaluator(new org.matheclipse.core.reflection.system.Replace());
		ReplaceList.setEvaluator(new org.matheclipse.core.reflection.system.ReplaceList());
		ReplaceRepeated.setEvaluator(new org.matheclipse.core.reflection.system.ReplaceRepeated());
		Share.setEvaluator(new org.matheclipse.core.reflection.system.Share());
		Sign.setEvaluator(new org.matheclipse.core.reflection.system.Sign());
		SignCmp.setEvaluator(new org.matheclipse.core.reflection.system.SignCmp());
		Solve.setEvaluator(new org.matheclipse.core.reflection.system.Solve());
		Sum.setEvaluator(new org.matheclipse.core.reflection.system.Sum());
		Taylor.setEvaluator(new org.matheclipse.core.reflection.system.Taylor());
		ToPolarCoordinates.setEvaluator(new org.matheclipse.core.reflection.system.ToPolarCoordinates());
		TrigExpand.setEvaluator(new org.matheclipse.core.reflection.system.TrigExpand());
		TrigReduce.setEvaluator(new org.matheclipse.core.reflection.system.TrigReduce());
		TrigToExp.setEvaluator(new org.matheclipse.core.reflection.system.TrigToExp());
	}

	private final static FunctionDefinitions CONST = new FunctionDefinitions();

	public static FunctionDefinitions initialize() {
		return CONST;
	}

	private FunctionDefinitions() {

	}
}
