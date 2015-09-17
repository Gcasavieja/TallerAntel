package objetos;

public class Agencia {
	private int idAngencia;
	private String nombre;
	
	public Agencia(int idAngencia, String nombre) {
		super();
		this.idAngencia = idAngencia;
		this.nombre = nombre;
	}
	
	public int getIdAngencia() {
		return idAngencia;
	}
	public void setIdAngencia(int idAngencia) {
		this.idAngencia = idAngencia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
