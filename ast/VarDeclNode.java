package ast;

public class VarDeclNode extends DeclNode{
	
	protected ExprListNode declarations;
	protected VarTypeNode id;
	
	public VarDeclNode (ExprListNode declarations, VarTypeNode id) {
		this.declarations = new ExprListNode(null);
        if(declarations!=null) this.declarations = declarations;
		this.id = id;
	}
	public Object accept(Visitor v) {
		return v.visit(this);
	    }

}
