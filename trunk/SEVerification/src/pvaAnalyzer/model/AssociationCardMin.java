package pvaAnalyzer.model;

public class AssociationCardMin extends Constraint {
	private String association;
	private String role;
	private String value;
	
	public AssociationCardMin(String association, String role , String value) {
		this.association = association;
		this.role = role;
		this.value = value;
	}
	
	public AssociationCardMin( AssociationCardMin anotherAssocCardMin ){
		this.association = anotherAssocCardMin.getAssociation();
		this.role = anotherAssocCardMin.getRole();
		this.value = anotherAssocCardMin.getValue();
	}

	@Override
	public String toString() {
		return "The cardinality of association " + association + " on role " + role + " must be at least " + value + ".";
	}
	
	public String getAssociation() {
		return association;
	}
	public void setAssociation(String association) {
		this.association = association;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getValue() {
		return value;
	}
}