package ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import datatypes.DataResultadoTicket;
import datatypes.DataTicket;

@WebService
public class WsImm {

	@WebMethod
	public DataResultadoTicket altaTicket(DataTicket dt){
		
		return null;
	}
}
