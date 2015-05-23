package org.matheclipse.core.expression;

import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;

/**
 * <p>
 * Immutable (A)bstract (S)yntax (T)ree of a given function with <b>exactly 1 argument</b>.
 * </p>
 * 
 * <p>
 * In Symja, an abstract syntax tree (AST), is a tree representation of the abstract syntactic structure of the Symja source code.
 * Each node of the tree denotes a construct occurring in the source code. The syntax is 'abstract' in the sense that it does not
 * represent every detail that appears in the real syntax. For instance, grouping parentheses are implicit in the tree structure,
 * and a syntactic construct such as a <code>Sin[x]</code> expression will be denoted by an AST with 2 nodes. One node for the
 * header <code>Sin</code> and one node for the argument <code>x</code>.
 * </p>
 * 
 * Internally an AST is represented as a <code>java.util.List</code> which contains
 * <ul>
 * <li>the operator of a function (i.e. the &quot;header&quot;-symbol: Sin, Cos, Inverse, Plus, Times,...) at index <code>0</code>
 * and</li>
 * <li>the <code>n</code> arguments of a function in the index <code>1 to n</code></li>
 * </ul>
 * 
 * See <a href="http://en.wikipedia.org/wiki/Abstract_syntax_tree">Abstract syntax tree</a>.
 * 
 * @see AST
 */
public class AST2 extends AST1 {

	private final static int SIZE = 2;

	IExpr arg1;

	/**
	 * Constructs a new instance
	 */
	public AST2() {
	}

	protected AST2(IExpr arg0, IExpr arg1) {
		this.arg0 = arg0;
		this.arg1 = arg1;
	}

	/**
	 * Get the first argument (i.e. the second element of the underlying list structure) of the <code>AST</code> function (i.e.
	 * get(1) ). <br />
	 * <b>Example:</b> for the AST representing the expression <code>Sin(x)</code>, <code>arg1()</code> returns <code>x</code>.
	 * 
	 * @return the first argument of the function represented by this <code>AST</code>.
	 * @see IExpr#head()
	 */
	public IExpr arg1() {
		return arg1;
	}

	/**
	 * Returns a new {@code HMArrayList} with the same elements, the same size and the same capacity as this {@code HMArrayList}.
	 * 
	 * @return a shallow copy of this {@code ArrayList}
	 * @see java.lang.Cloneable
	 */
	@Override
	public IAST clone() {
		return new AST(arg0, arg1);
	}

	@Override
	public boolean equals(final Object obj) {
		if (obj instanceof AbstractAST) {
			if (hashCode() != obj.hashCode()) {
				return false;
			}
			if (obj == this) {
				return true;
			}
			IAST list = (IAST) obj;
			if (list.size() != SIZE) {
				return false;
			}
			return arg0.equals(list.head()) && arg1.equals(list.arg1());
		}
		return false;
	}

	@Override
	public IExpr get(int location) {
		if (location == 0) {
			return arg0;
		} else if (location == 1) {
			return arg1;
		}
		throw new IndexOutOfBoundsException("Index: " + Integer.valueOf(location) + ", Size: 2");
	}

	@Override
	public int hashCode() {
		if (hashValue == 0) {
			hashValue = 391 + arg0.hashCode();
			hashValue = 23 * hashValue + arg1.hashCode();
		}
		return hashValue;
	}
	
	/**
	 * Replaces the element at the specified location in this {@code ArrayList} with the specified object.
	 * 
	 * @param location
	 *            the index at which to put the specified object.
	 * @param object
	 *            the object to add.
	 * @return the previous element at the index.
	 * @throws IndexOutOfBoundsException
	 *             when {@code location < 0 || >= size()}
	 */
	@Override
	public IExpr set(int location, IExpr object) {
		hashValue = 0;
		IExpr result;
		if (location == 0) {
			result = arg0;
			arg0 = object;
			return result;
		} else if (location == 1) {
			result = arg1;
			arg1 = object;
			return result;
		}
		throw new IndexOutOfBoundsException("Index: " + Integer.valueOf(location) + ", Size: 2");
	}

	/**
	 * Returns the number of elements in this {@code ArrayList}.
	 * 
	 * @return the number of elements in this {@code ArrayList}.
	 */
	@Override
	public int size() {
		return SIZE;
	}

	/**
	 * Returns a new array containing all elements contained in this {@code ArrayList}.
	 * 
	 * @return an array of the elements from this {@code ArrayList}
	 */
	@Override
	public Object[] toArray() {
		Object[] result = new Object[SIZE];
		result[0] = arg0;
		result[1] = arg1;
		return result;
	}

}