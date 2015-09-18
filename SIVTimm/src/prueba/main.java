package prueba;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;

import persistencia.FachadaPersistencia;
import datatypes.DataTicket;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date ahora = new Date(23,3,1989);
		DataTicket dt = new DataTicket(0,1,"sap1010",ahora,ahora,ahora,300,null,"ACTIVO",1);
		
		FachadaPersistencia persistencia = new FachadaPersistencia();
		
		try {
			persistencia.altaTicket(dt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
