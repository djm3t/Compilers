package ast;

public class ProgramNode extends Node {
	protected BlockNode block;
	protected DeclListNode declarations;
	
	public ProgramNode (BlockNode block, DeclListNode declarations) {
		this.block = block;
		this.declarations = declarations;
	}
	public Object accept(Visitor v) {
		return v.visit(this);
	    }

}
