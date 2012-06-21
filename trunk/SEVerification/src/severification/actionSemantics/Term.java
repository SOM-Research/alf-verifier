package severification.actionSemantics;

import java.util.ArrayList;
import java.util.Iterator;

import pvaAnalyzer.model.Constraint;


public class Term {
	private Integer id;
	private String multiplicity;
	private ArrayList<Guard> guards;
	private Action action;
	private String literalCode;
	private Operation opBelonging;
	
	public Term ( int id , String multiplicity , String literalCode , Operation opBelonging ){
		this.id = new Integer(id);
		this.multiplicity = multiplicity;
		this.guards = new ArrayList<Guard>();
		this.literalCode = literalCode;
		this.opBelonging = opBelonging;
	}
	
	public void addGuard( Guard guard ){
		this.guards.add( guard );
	}
	
	public boolean isSE(){
		Iterator<Constraint> actionConstraintsIter = this.action.getConstraints().iterator();
		while ( actionConstraintsIter.hasNext() ){
			if ( !actionConstraintsIter.next().isSatisfied() ){
				return false;
			}
		}
		return true;
	}
	
	@Override
	public String toString() {
		return this.getMultiplicity() + " ---> " + this.literalCode + "  {" + this.opBelonging.getName() + "} "  + "[" + this.getGuards() + "] " + 
				this.getAction() + "\n";	
	}
	
	public int getNumericMultiplicity() throws NumberFormatException{
		if ( this.getMultiplicity()==null || ( this.getMultiplicity()!=null && "".equals(this.getMultiplicity() ) ) ){
			return 1;
		} else {
			return Integer.valueOf(this.getMultiplicity()).intValue();
		}
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMultiplicity() {
		return this.multiplicity.length() > 0 ? this.multiplicity.substring( 0 , this.multiplicity.length() - 1 ) : "";
	}
	public void setMultiplicity(String multiplicity) {
		this.multiplicity = multiplicity;
	}
	public void setGuards(ArrayList<Guard> guards) {
		this.guards = guards;
	}
	public ArrayList<Guard> getGuards() {
		return guards;
	}
	public void setAction(Action action) {
		this.action = action;
	}
	public Action getAction() {
		return action;
	}
	public void setLiteralCode(String literalCode) {
		this.literalCode = literalCode;
	}
	public String getLiteralCode() {
		return literalCode;
	}
	public void setOpBelonging(Operation opBelonging) {
		this.opBelonging = opBelonging;
	}
	public Operation getOpBelonging() {
		return opBelonging;
	}
}
