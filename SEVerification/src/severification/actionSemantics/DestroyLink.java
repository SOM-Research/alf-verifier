package severification.actionSemantics;

import severification.alf.parser.OperationScanner;

public class DestroyLink extends ActionLink {
	
	public DestroyLink( Association association , String roleA , String objName1 , String roleB , String objName2 ){
		this.roleA = roleA;
		this.roleB = roleB;
		this.objName1 = objName1;
		this.objName2 = objName2;
		this.association = association;
	}
	
	@Override
	public String toString() {
		return 	"DestroyLink " + this.association + " " + (this.roleA!=null?this.roleA:"*") + " " + (this.objName1!=null?this.objName1:"*") + 
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
		return 	this.association.getName() + ".destroyLink(" + this.roleA + "=>" + obj1 + "," + this.roleB + "=>" + 
		obj2 + ");" + suffix;
	}
	
	public boolean equals( java.lang.Object obj ) {
		DestroyLink drLink = (DestroyLink) obj;
		DestroyLink drLinkSwapped = new DestroyLink( 	drLink.getAssociation(), 
														drLink.getRoleB(), 
														drLink.getObjName2(), 
														drLink.getRoleA(), 
														drLink.getObjName1() );
		return 	nonSymmetricEquals( drLink ) || nonSymmetricEquals( drLinkSwapped );
	}

	private boolean nonSymmetricEquals(DestroyLink drLink) {
		return ( drLink.getRoleA() == null || 
				( ( this.roleA != null && this.roleA.equals( drLink.getRoleA() ) ) ) ) &&
				
				( drLink.getRoleB() == null || 
				( ( this.roleB != null && this.roleB.equals( drLink.getRoleB() ) ) ) ) &&
				
				( drLink.getObjName1() == null || 
				( ( this.objName1 != null && this.objName1.equals( drLink.getObjName1() ) ) ) ) &&
				
				( drLink.getObjName2() == null || 
				( ( this.objName2 != null && this.objName2.equals( drLink.getObjName2() ) ) ) ) &&
				
				( drLink.getAssociation() == null || ( this.association != null && this.association.equals( drLink.getAssociation() ) ) );
	}
}