package ast;

public class AssignNode extends StmtNode{
	protected ExprNode value;
	protected AccessorNode var;
	
	public AssignNode (ExprNode value, AccessorNode var) {
		this.value = value;
		this.var = var;
	}
	

}
