package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import datatypes.DataAgencia;
import datatypes.DataTicket;


public class FachadaPersistencia {

	private Connection cn = null;
	private Consultas consultas = null;
	
	
	public FachadaPersistencia()
	{
		try {

			InitialContext context = new InitialContext();
			consultas = new Consultas();
			DataSource dataSource = (DataSource) context
					.lookup("java:jboss/datasources/mysqlDS");
			cn = dataSource.getConnection();
			
		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void altaTicket(DataTicket dt) throws SQLException
	{
		
		Connection conexion = cn;

		String sql = consultas.insertTicket();
		PreparedStatement comando = conexion.prepareStatement(sql);
		
		comando.setInt(1, dt.getIdTicket());
		comando.setInt(2, dt.getIdAgencia());
		comando.setString(3, dt.getMatricula());
		comando.setDate(4, dt.getFecha_inicio());
		comando.setDate(5, dt.getFecha_fin());
		comando.setDate(6, dt.getFecha_venta());
		comando.setDouble(7, dt.getImporte());
		comando.setString(8, dt.getCodigoAnulacion());
		comando.setString(9, dt.getEstado());
		
		comando.execute();

		cn.close();
		
	}
	
	public int altaAgencia(DataAgencia da) throws SQLException
	{
		int claveGenerada=-1;
		Connection conexion = cn;

		String sql = consultas.insertAgencia();
		PreparedStatement  comando= conexion.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
		
		comando.setString(1, da.getNombre());
		comando.setString(2, da.getDireccion());
		comando.setString(3, da.getTelefono());
		
		comando.execute();
		
		// Se obtiene la clave generada
		ResultSet rs = comando.getGeneratedKeys();
		while (rs.next()) {
		   claveGenerada = rs.getInt(1);
		   
		}
		

		cn.close();
		
		return claveGenerada;
	}

	public boolean existeAgencia(int idAgencia) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
