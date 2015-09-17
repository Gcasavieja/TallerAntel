package logica;

import java.sql.SQLException;

import persistencia.FachadaPersistencia;
import datatypes.DataResultadoTicket;
import datatypes.DataTicket;

public class TicketManager {
	
	private FachadaPersistencia persistencia;
	
	public TicketManager(){
		
	}
	
	public DataResultadoTicket altaTicket(DataTicket dtEntrada)
	{
		String mensaje="";
		DataResultadoTicket resu=null;
		DataTicket dtSalida; 
		boolean existe = persistencia.existeAgencia(dtEntrada.getIdAgencia());
		if(existe)
		{
			try {
				persistencia.altaTicket(dtEntrada);
				resu = new DataResultadoTicket("Ok", true);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				mensaje = e.getMessage();
				resu = new DataResultadoTicket(mensaje, false);
			}
			
		}
		else
		{
			mensaje = "No existe la agencia.";
			resu = new DataResultadoTicket(mensaje, false);
		}
		
		return resu;
	}
	
}
