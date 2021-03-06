package ast;

public interface Visitor {
	
    public Object visit (AccessorNode n); 
    public Object visit (AndNode n); 
    public Object visit (AssignNode n); 
    public Object visit (BegColNode n); 
    public Object visit (BinaryTermNode n); 
    public Object visit (BlockNode n); 
    public Object visit (BoolNode n); 
    public Object visit (CharNode n); 
    public Object visit (ConcatNode n); 
    public Object visit (BrkExprNode n); 
    public Object visit (DatatypeNode n); 
    public Object visit (DeclListNode n); 
    public Object visit (DeclNode n); 
    public Object visit (DivideNode n); 
    public Object visit (DualExprNode n); 
    public Object visit (EndColNode n); 
    public Object visit (EqNode n); 
    public Object visit (ExponentNode n); 
    public Object visit (ExprListNode n); 
    public Object visit (ExprNode n); 
    public Object visit (ExprTermNode n); 
    public Object visit (FactorNode n); 
    public Object visit (FinalNode n); 
    public Object visit (FloatNode n); 
    public Object visit (FuncCallNode n); 
    public Object visit (FuncCallStmtNode n); 
    public Object visit (FuncDeclNode n); 
    public Object visit (GreatThEqNode n); 
    public Object visit (GreatThNode n); 
    public Object visit (IfElseNode n); 
    public Object visit (InNode n); 
    public Object visit (IntNode n); 
    public Object visit (LengthNode n);
    public Object visit (ListNode n);
    public Object visit (LessThEqNode n); 
    public Object visit (LessThNode n); 
    public Object visit (MinExponentNode n); 
    public Object visit (MinusNode n); 
    public Object visit (MultiplyNode n); 
    public Object visit (NoColNode n); 
    public Object visit (Node n); 
    public Object visit (NotEqNode n); 
    public Object visit (NotExprNode n); 
    public Object visit (OrNode n); 
    public Object visit (ParamListNode n); 
    public Object visit (PlusNode n); 
    public Object visit (PowerNode n); 
    public Object visit (PowerTermNode n); 
    public Object visit (ProgramNode n); 
    public Object visit (ReturnStmtNode n); 
    public Object visit (RptUntilNode n); 
    public Object visit (SequenceNode n); 
    public Object visit (StatementListNode n); 
    public Object visit (StmtNode n); 
    public Object visit (StringLitNode n); 
    public Object visit (TermNode n); 
    public Object visit (ThreeExprNode n); 
    public Object visit (TupleNode n); 
    public Object visit (TypeNode n); 
    public Object visit (VarDeclNode n);
    public Object visit (VarTypeNode n);
    public Object visit (WhileStmtNode n); 

}
