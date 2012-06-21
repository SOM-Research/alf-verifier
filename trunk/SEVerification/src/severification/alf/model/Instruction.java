package severification.alf.model;

import java.util.ArrayList;

import severification.alf.parser.OperationScanner;

public class Instruction {
	private String id;
	private String multiplicity;
	private InstructionType type;
	private ArrayList<Object> arguments;
	private ArrayList<String> guards;
	private String operationBelonging;
	private String literal;
	
	public Instruction( InstructionType type ){
		this.arguments = new ArrayList<Object>();
		this.guards = new ArrayList<String>();
		this.type = type;
		this.multiplicity = new String();
		this.operationBelonging = OperationScanner.getCurrentOperation();
	}
	
	public Instruction( InstructionType type , String literal ){
		this.arguments = new ArrayList<Object>();
		this.guards = new ArrayList<String>();
		this.type = type;
		this.multiplicity = new String();
		this.operationBelonging = OperationScanner.getCurrentOperation();
		this.literal = literal;
	}
	
	public void addArgument( Object argument ){
		this.arguments.add( argument );
	}
	
	public void addArguments( ArrayList<Object> arguments ){
		this.arguments.addAll( arguments );
	}
	
	public void addGuard( String guard ){
		this.guards.add( guard );
	}
	
	public void addGuards( ArrayList<String> guards ){
		this.guards.addAll( guards );
	}
	
	public boolean isEmpty(){
		return type == InstructionType.EMPTY;
	}
	
	@Override
	public String toString() {
		String multip = this.getMultiplicity().length() > 0 ? 
				this.getMultiplicity().substring( 0 , this.getMultiplicity().length() - 1 ) : "";
		return 	"{" + this.getOperationBelonging() + "}" + " ---> " + this.getLiteral() + "  " + multip + " " + 
				this.getGuards() + " " + this.getType().toString() + " " + this.getArguments().toString();
	}

	public String getMultiplicity() {
		return multiplicity;
	}
	public void setMultiplicity(String multiplicity) {
		this.multiplicity = multiplicity;
	}
	public InstructionType getType() {
		return type;
	}
	public void setType(InstructionType type) {
		this.type = type;
	}
	public ArrayList<Object> getArguments() {
		return arguments;
	}
	public void setArguments(ArrayList<Object> arguments) {
		this.arguments = arguments;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setGuards(ArrayList<String> guards) {
		this.guards = guards;
	}
	public ArrayList<String> getGuards() {
		return guards;
	}
	public void setOperationBelonging(String operationBelonging) {
		this.operationBelonging = operationBelonging;
	}
	public String getOperationBelonging() {
		return operationBelonging;
	}
	public void setLiteral(String literal) {
		this.literal = literal;
	}
	public String getLiteral() {
		return literal;
	}
}