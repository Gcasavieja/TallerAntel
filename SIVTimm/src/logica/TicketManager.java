package logica;

import java.sql.SQLException;

import persistencia.FachadaPersistencia;
import datatypes.DataResultadoTicket;
import datatypes.DataTicket;

public class TicketManager {
	
	private FachadaPersistencia persistencia;
	
	public TicketManager(){
		persistencia = new FachadaPersistencia();
	}
	
	public DataResultadoTicket altaTicket(DataTicket dtEntrada)
	{
		String mensaje="";
		DataResultadoTicket resu=null;
		DataTicket dtSalida; 
		boolean existe;
		try {
			existe = persistencia.existeAgenciaId(dtEntrada.getIdAgencia());
			if(existe)
			{
				persistencia.altaTicket(dtEntrada);
				resu = new DataResultadoTicket("Se ingresó ticket.", true);
				
			}
			else
			{
				mensaje = "No existe la agencia.";
				resu = new DataResultadoTicket(mensaje, false);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			mensaje = e.getMessage();
			resu = new DataResultadoTicket(mensaje, false);
		}
		
		
		return resu;
	}
	
}
