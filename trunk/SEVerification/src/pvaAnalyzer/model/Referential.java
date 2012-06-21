package pvaAnalyzer.model;

public class Referential extends Constraint {
	private String className;
	private String assocName;
	
	public Referential( String className , String assocName ){
		this.className = className;
		this.assocName = assocName;
	}
	
	public Referential( Referential anotherReferential ){
		this.className = anotherReferential.getClassName();
		this.assocName = anotherReferential.getAssocName();
	}
	
	public String toString() {
//		return "Referential(" + className + "," + assocName + ")" + " [" + this.satisfied +"]";+
		return "Referential constraint: Each participant in the association " + assocName + " must be an instance of " + className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassName() {
		return className;
	}

	public void setAssocName(String assocName) {
		this.assocName = assocName;
	}

	public String getAssocName() {
		return assocName;
	}
}