package main;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import ws.DataTicket;
import ws.WsImm;
import ws.WsImmService;

public class PruebaWS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WsImmService service = new WsImmService();
		
		WsImm ws = service.getWsImmPort();
		
		DataTicket dt = new DataTicket();
		
		java.util.Date utilDate = new java.util.Date();
	    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
	    
	    
			dt.setIdAgencia(12);
			dt.setCodigoAnulacion(null);
			dt.setEstado("ACTIVO");
			dt.setFechaFin(sqlDate);
			dt.setFechaInicio(sqlDate);
			dt.setFechaVenta(sqlDate);
			dt.setIdTarifa(1);
			dt.setImporte(450);
			dt.setMatricula("sap 1322");
			ws.altaTicket(dt);
			
		
		
		
		
		
	}

}
