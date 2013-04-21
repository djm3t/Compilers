package ast;

public class BlockNode extends Node {
	protected StatementListNode statements;
	protected DeclListNode declarations;
	
	public BlockNode (StatementListNode statements, DeclListNode declarations) {
		this.statements = statements;
		this.declarations = declarations;
	}
}
