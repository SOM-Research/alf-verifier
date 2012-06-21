package severification.actionSemantics;


public class Guard {
	private Integer id;
	private String condition;
	private Term tIni;
	private Term tEnd;
	
	public Guard ( String condition ){
		this.condition = condition;
	}
	
	@Override
	public String toString() {
		return condition;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public Term gettIni() {
		return tIni;
	}
	public void settIni(Term tIni) {
		this.tIni = tIni;
	}
	public Term gettEnd() {
		return tEnd;
	}
	public void settEnd(Term tEnd) {
		this.tEnd = tEnd;
	}
}