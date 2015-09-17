package objetos;

public class Tarifa {
	private int idTarifa;
	private String tipo;
	
	public Tarifa(int idTarifa, String tipo) {
		super();
		this.idTarifa = idTarifa;
		this.tipo = tipo;
	}
	
	public int getIdTarifa() {
		return idTarifa;
	}
	public void setIdTarifa(int idTarifa) {
		this.idTarifa = idTarifa;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
