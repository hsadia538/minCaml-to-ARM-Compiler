package compiler.common.expression;

import compiler.common.Exp;
import compiler.common.ObjVisitor;
import compiler.common.Visitor;

public class Bool extends Exp {
	public final boolean b;

	public Bool(boolean b) {
		this.b = b;
	}

	public <E> E accept(ObjVisitor<E> v) {
		return v.visit(this);
	}

	public void accept(Visitor v) {
		v.visit(this);
	}
}
