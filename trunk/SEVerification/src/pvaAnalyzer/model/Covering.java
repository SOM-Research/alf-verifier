package pvaAnalyzer.model;

public class Covering extends Constraint {
	private String clazz;

	public Covering(String clazz) {
		this.clazz = clazz;
	}
	
	public Covering( Covering anotherCovering ) {
		this.clazz = anotherCovering.getClazz();
	}

	@Override
	public String toString() {
//		return "Covering(" + clazz + ")" + " [" + this.satisfied +"]";
		return "Covering generalization: Each instance of " + clazz + " is instance of at least one subclass";
	}
	
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public String getClazz() {
		return clazz;
	}
}