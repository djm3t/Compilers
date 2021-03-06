package ast;

public class MinExponentNode extends ExponentNode{
	protected ExponentNode exponent;
	
	public MinExponentNode (ExponentNode exponent) {
		this.exponent = exponent;
	}
	public Object accept(Visitor v) {
		return v.visit(this);
	    }

}
