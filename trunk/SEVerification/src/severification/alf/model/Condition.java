package severification.alf.model;

public class Condition {
	String id;
	String codition;
	String iniIdStatement;
	String endIdStatement;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCodition() {
		return codition;
	}
	public void setCodition(String codition) {
		this.codition = codition;
	}
	public String getIniIdStatement() {
		return iniIdStatement;
	}
	public void setIniIdStatement(String iniIdStatement) {
		this.iniIdStatement = iniIdStatement;
	}
	public String getEndIdStatement() {
		return endIdStatement;
	}
	public void setEndIdStatement(String endIdStatement) {
		this.endIdStatement = endIdStatement;
	}
}