package pvaAnalyzer.model;

public class Disjoint extends Constraint {
	private String clazz;

	public Disjoint(String clazz) {
		this.clazz = clazz;
	}
	
	public Disjoint( Disjoint anotherDisjoint ) {
		this.clazz = anotherDisjoint.getClazz();
	}

	@Override
	public String toString() {
//		return "Dis(" + clazz + ")" + " [" + this.satisfied +"]";
		return "Disjoint generalization: Each instance of " + clazz + " is an instance of at most one subclass";
	}
	
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	public String getClazz() {
		return clazz;
	}
}