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

import objetos.Agencia;
import datatypes.DataAgencia;
import datatypes.DataTicket;


public class FachadaPersistencia {

	private DataSource dataSource = null;
	private Consultas consultas = null;
	private InitialContext context = null;
	
	
	public FachadaPersistencia()
	{
		try {

			context = new InitialContext();
			consultas = new Consultas();
			dataSource = (DataSource) context
					.lookup("java:jboss/datasources/mysqlDS");
					//.lookup("java:/mysqlDS");
			
		} catch (NamingException e) {
			e.printStackTrace();
		} 
	}
	
	public void altaTicket(DataTicket dt) throws SQLException
	{
		
		Connection conexion = dataSource.getConnection();

		String sql = consultas.insertTicket();
		PreparedStatement comando = conexion.prepareStatement(sql);
		
		//comando.setInt(1, dt.getIdTicket());
		comando.setInt(1, dt.getIdAgencia());
		comando.setString(2, dt.getMatricula());
		comando.setDate(3, dt.getFecha_inicio());
		comando.setDate(4, dt.getFecha_fin());
		comando.setDate(5, dt.getFecha_venta());
		comando.setDouble(6, dt.getImporte());
		comando.setString(7, dt.getCodigoAnulacion());
		comando.setString(8, dt.getEstado());
		
		ResultSet rs = comando.executeQuery();
		while(rs.next())
		{
			int idTicket = rs.getInt("importe");
			Double importe = rs.getDouble("importe");
		}
		
		comando.close();
		conexion.close();
		
	}
	
	public int altaAgencia(Agencia ag) throws SQLException
	{
		int claveGenerada=-1;
		Connection conexion = dataSource.getConnection();

		String sql = consultas.insertAgencia();
		PreparedStatement  comando= conexion.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
		
		comando.setString(1, ag.getNombre());
		comando.setString(2, ag.getDireccion());
		comando.setString(3, ag.getTelefono());
		
		comando.execute();
		
		// Se obtiene la clave generada
		ResultSet rs = comando.getGeneratedKeys();
		while (rs.next()) {
		   claveGenerada = rs.getInt(1);
		   
		}
		

		comando.close();
		conexion.close();
		
		return claveGenerada;
	}

	public boolean existeAgencia(String nombreAgencia, String telefono) throws SQLException {
		// TODO Auto-generated method stub
		boolean existe = false;
		Connection conexion = dataSource.getConnection();

		String sql = consultas.existAgencia();
		PreparedStatement  comando= conexion.prepareStatement(sql);
		
		comando.setString(1, nombreAgencia);
		comando.setString(2, telefono);
		
		ResultSet rs = comando.executeQuery();
		
		if(rs.next())
		{
			existe = true;
		}
		
		comando.close();
		conexion.close();
		
		return existe;
	}

	public boolean existeAgenciaId(int idAgencia) throws SQLException {
		// TODO Auto-generated method stub
		boolean existe = false;
		Connection conexion = dataSource.getConnection();

		String sql = consultas.existAgenciaId();
		PreparedStatement  comando= conexion.prepareStatement(sql);
		
		comando.setInt(1, idAgencia);
		
		ResultSet rs = comando.executeQuery();
		
		if(rs.next())
		{
			existe = true;
		}
		
		comando.close();
		conexion.close();
		
		return existe;
	}
	
}
