package datatypes;

import java.io.Serializable;

public class DataResultadoTicket implements Serializable{
	
	private String mensaje;
	private boolean ok;
	
	public DataResultadoTicket(String mensaje, boolean ok) {
		super();
		this.mensaje = mensaje;
		this.ok = ok;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public boolean isOk() {
		return ok;
	}

	public void setOk(boolean ok) {
		this.ok = ok;
	}
	
	
	
	
}
