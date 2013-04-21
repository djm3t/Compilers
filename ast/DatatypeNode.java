package ast;

public class DatatypeNode extends DeclNode {

	protected ParamListNode params;
	protected String id;
	
	public DatatypeNode (ParamListNode params, String id) {
		this.params = params;
		this.id = id;
	}
	
}
