package pvaAnalyzer.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public abstract class Constraint{
	protected boolean satisfied = false;
	protected int satisfiedBy = 1;
	private ArrayList<ArrayList<String>> codeToBeSatisfied = new ArrayList<ArrayList<String>>();

	public ArrayList<String> userQueries = new ArrayList<String>();

	public boolean isSatisfied() {
		return satisfied;
	}

	public void setSatisfied(boolean satisfied) {
		this.satisfied = satisfied;
	}

	public void addCodeToBeSatisfied( ArrayList<String> code ) {
		this.codeToBeSatisfied.add( code );
	}
	
	public void addCodeToBeSatisfied( String code ) {
		this.codeToBeSatisfied.add( new ArrayList<String>( Arrays.asList( code ) ) );
	}


	public void addUserQuery( String query ) {
		this.userQueries.add( query );
	}
	
//	public String condsToBeSatisfiedToStr(){
//		String ret = new String();
//		if ( this.condsToBeSatisfied.size() > 0 ){
//			ret = ret.concat( "\tConditions for the constraint to be satisfied:\n" );
//			Iterator<String> condsIter = this.condsToBeSatisfied.iterator();
//			while ( condsIter.hasNext() ){
//				ret = ret.concat( "\t- " + condsIter.next() + "\n" );
//			}
//		}
//		return ret;
//	}
	
	public String userQueriesToStr(){
		String ret = new String();
		if ( this.userQueries.size() > 0 ){
			ret = ret.concat( "\tQueries to be solved by the user:\n" );
			Iterator<String> userQueriesIter = this.userQueries.iterator();
			while ( userQueriesIter.hasNext() ){
				ret = ret.concat( "\t- " + userQueriesIter.next() + "\n" );
			}
		}
		return ret;
	}

	public int getSatisfiedBy() {
		return satisfiedBy;
	}

	public void setSatisfiedBy(int satisfiedBy) {
		this.satisfiedBy = satisfiedBy;
	}

	public ArrayList<String> getUserQueries() {
		return userQueries;
	}
	
	public ArrayList<ArrayList<String>> getCodeToBeSatisfied() {
		return codeToBeSatisfied;
	}
}