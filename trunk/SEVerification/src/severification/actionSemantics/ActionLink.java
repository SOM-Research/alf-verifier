package severification.actionSemantics;

public class ActionLink extends Action {

	protected String roleA;
	protected String roleB;
	protected String objName1;
	protected String objName2;
	protected Association association;
	
	
	public String oppositeRoleFromRole( String role ){
		if ( role.equals( this.roleA ) ){
			return this.roleB;
		} else if ( role.equals( this.roleB ) ){
			return this.roleA;
		} else return null;
	}
	
	public String oppositeObjectFromRole( String role ){
		if ( role.equals( this.roleA ) ){
			return this.objName2;
		} else if ( role.equals( this.roleB ) ){
			return this.objName1;
		} else return null;
	}
	

	public String getRoleA() {
		return roleA;
	}

	public void setRoleA(String roleA) {
		this.roleA = roleA;
	}

	public String getRoleB() {
		return roleB;
	}

	public void setRoleB(String roleB) {
		this.roleB = roleB;
	}

	public String getObjName1() {
		return objName1;
	}

	public void setObjName1(String objName1) {
		this.objName1 = objName1;
	}

	public String getObjName2() {
		return objName2;
	}

	public void setObjName2(String objName2) {
		this.objName2 = objName2;
	}

	public Association getAssociation() {
		return association;
	}

	public void setAssociation(Association association) {
		this.association = association;
	}

}
