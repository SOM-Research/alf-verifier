package severification.actionSemantics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import pvaAnalyzer.PVAHashtable;
import pvaAnalyzer.model.Constraint;

public class ExecutionPath {
	private ArrayList<Term> terms;
	private PVAHashtable<Action, ArrayList<Constraint>> pvas;
	
	public ExecutionPath(){
		this.terms = new ArrayList<Term>();
		this.pvas = new PVAHashtable<Action, ArrayList<Constraint>>();
	}
	
	public boolean isSE(){
		Iterator<Term> pathTermsIter = this.terms.iterator();
		while ( pathTermsIter.hasNext() ){
			if ( !pathTermsIter.next().isSE() ){
				return false;
			}
		}
		return true;
	}
	
	public void addTerm( Term term ){
		this.terms.add( term );
	}

//	@Override
//	public String toString() {
//		String ret = new String();
//		for ( int i = 0; i < this.terms.size(); i++ ){
//			ret = ret.concat( this.terms.get( i ).toString() );
//		}
//		ret = ret.concat( "********************************************" + "\n"  );
//		Iterator<Term> termsIter = terms.iterator();
//		while ( termsIter.hasNext() ){
//			Action pva = termsIter.next().getAction();
//			if ( !pva.getConstraints().isEmpty() ){
//				ret = ret.concat( "Action -> " + pva + "\n" );
//				Iterator<Constraint> constrIter = pva.getConstraints().iterator();
//				while ( constrIter.hasNext() ){
//					Constraint constraint = constrIter.next();
//					ret = ret.concat( 	constraint.toString() + 
//										(constraint.isSatisfied()?(" Satisfied by " + constraint.getSatisfiedBy() + "\n"):"\n" ) );
//					if ( !constraint.isSatisfied() ){
//						ret = ret.concat( constraint.condsToBeSatisfiedToStr() );
//						ret = ret.concat( constraint.userQueriesToStr() );
//					}
//				}
//				ret = ret.concat( "********************************************" + "\n"  );
//			}
//		}
//		return ret;
//	}
	
	public Collection<Action> getActions(){
		return this.pvas.keySet();
	}
	
	public int size(){
		return this.terms.size();
	}

	public ArrayList<Term> getTerms() {
		return terms;
	}
	public void setTerms(ArrayList<Term> terms) {
		this.terms = terms;
	}
	public void setPvas(PVAHashtable<Action, ArrayList<Constraint>> pvas) {
		this.pvas = pvas;
	}
	public PVAHashtable<Action, ArrayList<Constraint>> getPvas() {
		return pvas;
	}
}