package severification.actionSemantics;

public class DestroyObject extends Action {
	private Object object;
	
	public DestroyObject( Object object ){
		this.object = object;
	}

	@Override
	public String toString() {
		return "DestroyObject " + this.object.toString();
	}
	
	public String toAlf(){
		return this.object.getName() + ".destroy()";
	}
	
	public boolean equals( java.lang.Object obj ) {
		DestroyObject dObj = (DestroyObject) obj;
		return 	dObj.getObject() == null || this.object.equals( dObj.getObject() ) ;
	}
	
	public void setObject(Object object) {
		this.object = object;
	}

	public Object getObject() {
		return object;
	}
}