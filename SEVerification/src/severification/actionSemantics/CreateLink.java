package severification.actionSemantics;

import severification.alf.parser.OperationScanner;


public class CreateLink extends ActionLink {
	
	public CreateLink( Association association , String roleA , String objName1 , String roleB , String objName2 ){
		this.roleA = roleA;
		this.roleB = roleB;
		this.objName1 = objName1;
		this.objName2 = objName2;
		this.association = association;
	}
	
	@Override
	public String toString() {
		return 	"CreateLink " + this.association + " " + (this.roleA!=null?this.roleA:"*") + " " + (this.objName1!=null?this.objName1:"*") + 
				" " + (this.roleB!=null?this.roleB:"*") + " " + (this.objName2!=null?this.objName2:"*");
	}
	
	public String toAlf(){
		String obj1 = this.objName1!=null?this.objName1:"X";
		String obj2 = this.objName2!=null?this.objName2:"X";
		String suffix = new String();
		if ( this.objName1 == null ){
			suffix = suffix.concat( " // where X is an existing " + 
					OperationScanner.getModelLoader().oppositeClassFromAssocRole( this.association.getName() , this.roleB ) );
		} else if ( this.objName2 == null ){
			suffix = suffix.concat( " // where X is an existing " + 
					OperationScanner.getModelLoader().oppositeClassFromAssocRole( this.association.getName() , this.roleA ) );
		}
		return 	this.association.getName() + ".createLink(" + this.roleA + "=>" + obj1 + "," + this.roleB + "=>" + 
				obj2 + ");" + suffix;
	}
	
	@Override
	public boolean equals( java.lang.Object obj ) {
		ActionLink crLink = (ActionLink) obj;
		ActionLink crLinkSwapped = new CreateLink( 	crLink.getAssociation(), 
													crLink.getRoleB(), 
													crLink.getObjName2(), 
													crLink.getRoleA(), 
													crLink.getObjName1() );
		return 	nonSymmetricEquals(crLink) || nonSymmetricEquals( crLinkSwapped );
	}

	private boolean nonSymmetricEquals(ActionLink crLink) {
		return ( crLink.getRoleA() == null || 
				( ( this.roleA != null && this.roleA.equals( crLink.getRoleA() ) ) ) ) &&
				
				( crLink.getRoleB() == null || 
				( ( this.roleB != null && this.roleB.equals( crLink.getRoleB() ) ) ) ) &&
				
				( crLink.getObjName1() == null || 
				( ( this.objName1 != null && this.objName1.equals( crLink.getObjName1() ) ) ) ) &&
				
				( crLink.getObjName2() == null || 
				( ( this.objName2 != null && this.objName2.equals( crLink.getObjName2() ) ) ) ) &&
				
				( crLink.getAssociation() == null || ( this.association != null && this.association.equals( crLink.getAssociation() ) ) );
	}
}