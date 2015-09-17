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

import datatypes.DataTicket;


public class FachadaPersistencia {

	private Connection cn = null;
	private Consultas consultas = null;
	
	
	public FachadaPersistencia()
	{
		try {

			InitialContext context = new InitialContext();
			DataSource dataSource = (DataSource) context
					.lookup("java:jboss/datasources/mysqlDS");
			cn = dataSource.getConnection();
			consultas = new Consultas();
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

		comando.execute();

		cn.close();
		
	}

	public boolean existeAgencia(int idAgencia) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
