package excepciones;

public class PersistenciaException  extends Exception{
	public String mensaje;

	/**
	 * @param mensaje
	 */
	public PersistenciaException(String mensaje) {
		this.mensaje = mensaje;
	}

	/**
	 * @return the mensaje
	 */
	public String getMensaje() {
		return mensaje;
	}

	/**
	 * @param mensaje the mensaje to set
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	

}
