package pvaAnalyzer.model;

public class AssociationCardMax extends Constraint {
	private String association;
	private String role;
	private String value;
	
	public AssociationCardMax(String association, String role , String value ) {
		this.association = association;
		this.role = role;
		this.value = value;
	}
	
	public AssociationCardMax( AssociationCardMax anotherAssocCardMax ){
		this.association = anotherAssocCardMax.getAssociation();
		this.role = anotherAssocCardMax.getRole();
		this.value = anotherAssocCardMax.getValue();
	}
	
	@Override
	public String toString() {
		return "The cardinality of association " + association + " on role " + role + " must be at most " + value + ".";
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
