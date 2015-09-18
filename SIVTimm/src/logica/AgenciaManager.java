package logica;

import java.sql.SQLException;

import datatypes.DataAgencia;
import datatypes.DataResultadoAgencia;
import persistencia.FachadaPersistencia;

public class AgenciaManager {

	private FachadaPersistencia persistencia;
	
	public AgenciaManager(){
		
		persistencia = new FachadaPersistencia();
	}
	
	public DataResultadoAgencia altaAgencia(DataAgencia da)
	{
		DataResultadoAgencia dra = null;
		try {
			int idAgencia = persistencia.altaAgencia(da);
			dra = new DataResultadoAgencia(idAgencia, true);
		} catch (SQLException e) {
			
			dra = new DataResultadoAgencia(-1, false);
		}
		
		return dra;
	}
}
