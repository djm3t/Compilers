package ast;

public class FuncCallNode extends FinalNode{
	protected ExprListNode params;
	protected String id;
	
	public FuncCallNode(ExprListNode params, String id) {
		this.params = params;
		this.id = id;
	}
	public Object accept(Visitor v) {
		return v.visit(this);
	    }

}
