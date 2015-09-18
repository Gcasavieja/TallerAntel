package datatypes;

public class DataResultadoAgencia {
	
	private int idAgencia;
	private boolean ok;
	
	public DataResultadoAgencia(int idAgencia, boolean ok) {
		super();
		this.idAgencia = idAgencia;
		this.ok = ok;
	}
	public int getIdAgencia() {
		return idAgencia;
	}
	public void setMensaje(int idAgencia) {
		this.idAgencia = idAgencia;
	}
	public boolean isOk() {
		return ok;
	}
	public void setOk(boolean ok) {
		this.ok = ok;
	}
	
	
	
}
