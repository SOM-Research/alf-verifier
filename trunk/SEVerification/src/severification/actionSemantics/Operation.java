package severification.actionSemantics;

import java.util.ArrayList;
import java.util.Iterator;


public class Operation {
	private String name;
	private ArrayList<ExecutionPath> execPaths;
	
	public Operation( String name ){
		this.name = name;
		execPaths = new ArrayList<ExecutionPath>();
	}
	
	public Operation(){
		execPaths = new ArrayList<ExecutionPath>();
	}
	
	public void addExecutionPath( ExecutionPath executionPath ){
		this.execPaths.add( executionPath );
	}
	
	public boolean isSE(){
		Iterator<ExecutionPath> execPathsIter = this.execPaths.iterator();
		while ( execPathsIter.hasNext() ){
			if ( !execPathsIter.next().isSE() ){
				return false;
			}
		}
		return true;
	}
	
	@Override
	public String toString() {
		String ret = new String();
		ret = ret.concat( "Operation name: " + this.name + "\n" );
		for ( int i = 0; i < this.execPaths.size(); i++ ){
			ret = ret.concat( "Path number " + new Integer( i + 1 ).toString() + "\n" );
			ret = ret.concat( this.execPaths.get(i).toString() );
			ret = ret.concat( "****************************************************************************************************\n\n" );
		}
		return ret;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setExecPaths(ArrayList<ExecutionPath> execPaths) {
		this.execPaths = execPaths;
	}
	public ArrayList<ExecutionPath> getExecPaths() {
		return execPaths;
	}
}