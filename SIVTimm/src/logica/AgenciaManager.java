package logica;

import java.sql.SQLException;

import objetos.Agencia;
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
		Agencia ag = new Agencia(da.getNombre(),da.getDireccion(),da.getTelefono());
		try {
			int idAgencia = -2;
			if(!persistencia.existeAgencia(da.getNombre(),da.getTelefono()))
				idAgencia = persistencia.altaAgencia(ag);
			
			dra = new DataResultadoAgencia(idAgencia, true);
		} catch (SQLException e) {
			
			dra = new DataResultadoAgencia(-1, false);
		}
		
		return dra;
	}
}
