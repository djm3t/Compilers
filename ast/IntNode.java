package ast;

public class IntNode extends FinalNode{
	protected int value;
	
	public IntNode (int value){
		this.value = value;
		
	}
	public Object accept(Visitor v) {
		return v.visit(this);
	    }

}
