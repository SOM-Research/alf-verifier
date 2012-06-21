package severification.actionSemantics;

public class Association {
	private String name;

	public Association( String name ){
		this.name = name;
	}
	
	@Override
	public boolean equals(java.lang.Object obj) {
		return this.name.equals( ((Association) obj).getName() );
	}

	@Override
	public String toString() {
		return this.name!=null?this.name:"*";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}