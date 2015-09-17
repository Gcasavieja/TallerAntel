package ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import logica.AgenciaManager;
import logica.ReporteManager;
import logica.TicketManager;
import datatypes.DataResultadoTicket;
import datatypes.DataTicket;

@WebService
public class WsImm {
	
	private AgenciaManager am;
	private ReporteManager rm;
	private TicketManager tm;
	
	public WsImm()
	{
		am = new AgenciaManager();
		rm = new ReporteManager();
		tm = new TicketManager();
	}

	@WebMethod
	public DataResultadoTicket altaTicket(DataTicket dt){
		
		return tm.altaTicket(dt);
	}
}
