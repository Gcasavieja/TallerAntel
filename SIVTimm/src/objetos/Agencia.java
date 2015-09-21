package objetos;

public class Agencia {
	private int idAngencia;
	private String nombre;
	private String direccion;
	private String telefono;
	
	
	public Agencia( String nombre, String direccion,
			String telefono) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
}
