package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.<br />
 * See GIT repository at: <a href="https://bitbucket.org/axelclk/symjaunittests">https://bitbucket.org/axelclk/symjaunittests</a>.
 */
public interface ArcCoshRules {
  final public static IAST RULES = List(
    ISet(ArcCosh(C0),
      Times(CC(0L,1L,1L,2L),Pi)),
    ISet(ArcCosh(C1),
      C0),
    ISet(ArcCosh(CInfinity),
      CInfinity)
  );
}