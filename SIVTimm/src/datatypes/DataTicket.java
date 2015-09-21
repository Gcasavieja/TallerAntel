package datatypes;

import java.io.Serializable;
import java.sql.Date;

public class DataTicket implements Serializable{
	private int idTicket;
	private int idAgencia;
	private String matricula;
	private Date fecha_venta;
	private Date fecha_inicio;
	private Date fecha_fin;
	private double importe;
	private String codigoAnulacion;
	private String estado;
	private int idTarifa;
	
	public DataTicket(){
		
	}
	
	public DataTicket(int idTicket, int idAgencia, String matricula,
			Date fecha_venta, Date fecha_inicio, Date fecha_fin,
			double importe, String codigoAnulacion, String estado, int idTarifa) {
		super();
		this.idTicket = idTicket;
		this.idAgencia = idAgencia;
		this.matricula = matricula;
		this.fecha_venta = fecha_venta;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.importe = importe;
		this.codigoAnulacion = codigoAnulacion;
		this.estado = estado;
		this.idTarifa = idTarifa;
	}
	
	public int getIdTicket() {
		return idTicket;
	}
	public void setIdTicket(int idTicket) {
		this.idTicket = idTicket;
	}
	public int getIdAgencia() {
		return idAgencia;
	}
	public void setIdAgencia(int idAgencia) {
		this.idAgencia = idAgencia;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Date getFecha_venta() {
		return fecha_venta;
	}
	public void setFecha_venta(Date fecha_venta) {
		this.fecha_venta = fecha_venta;
	}
	public Date getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public Date getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public String getCodigoAnulacion() {
		return codigoAnulacion;
	}
	public void setCodigoAnulacion(String codigoAnulacion) {
		this.codigoAnulacion = codigoAnulacion;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getIdTarifa() {
		return idTarifa;
	}
	public void setIdTarifa(int idTarifa) {
		this.idTarifa = idTarifa;
	}
	
}
