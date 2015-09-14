package datatypes;

import java.util.Date;

public class DataTicket {
	private String monto;
	private String matricula;
	private Date fechaVenta;

	public String getMonto() {
		return monto;
	}

	public Date getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(Date fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public void setMonto(String monto) {
		this.monto = monto;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}
