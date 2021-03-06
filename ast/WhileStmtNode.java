package ast;

public class WhileStmtNode extends StmtNode{
	protected ExprNode cond;
	protected StatementListNode body;
	
	public WhileStmtNode (ExprNode cond, StatementListNode body) {
		this.cond = cond;
		this.body = body;
	}
	public Object accept(Visitor v) {
		return v.visit(this);
	    }

}
