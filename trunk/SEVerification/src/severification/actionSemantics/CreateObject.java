package severification.actionSemantics;


public class CreateObject extends Action {
	private Object object;
	
	public CreateObject( Object object ){
		this.object = object;
	}
	
	@Override
	public String toString() {
		return "CreateObject " + this.object.toString();
	}
	
	public String toAlf(){
		return ( this.object.getName()!=null?this.object.getName()+ " = ":"" ) + "new " + object.getClazz() + "()" ;
	}
	
	public boolean equals( java.lang.Object obj ) {
		CreateObject cObj = (CreateObject) obj;
		return 	cObj.getObject() == null || this.object.equals( cObj.getObject() );
	}
	public void setObject(Object object) {
		this.object = object;
	}

	public Object getObject() {
		return object;
	}
}