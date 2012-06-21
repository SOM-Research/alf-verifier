package severification.actionSemantics;

public class Object {
	private String clazz;
	private String name;
	
	public Object( String name , String clazz ){
		this.clazz = clazz;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return (this.clazz!=null?this.clazz:"*") + " " + (this.name!=null?this.name:"*");
	}
	
	public boolean equals( Object obj ) {
		if ( obj.getClazz() != null && ( ( this.clazz != null && !this.clazz.equals( obj.getClazz() ) ) || this.clazz == null ) ){
			return false;
		} else if ( obj.getName() != null && ( ( this.name != null && !this.name.equals( obj.getName() ) ) || this.name == null ) ) {
			return false;	
		}
		return true;
	}
	
	public String getClazz() {
		return clazz;
	}
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}