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

		comando.close();
		conexion.close();
		
	}
	
	public int altaAgencia(DataAgencia da) throws SQLException
	{
		int claveGenerada=-1;
		Connection conexion = dataSource.getConnection();

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
	
	public ArrayList<DataAgencia> obtenerAgenciasNombre(String nombre) throws SQLException{
		ArrayList<DataAgencia> listaAgencias=new ArrayList<DataAgencia>();
		Connection conexion = dataSource.getConnection();
		String sql = consultas.obtenerAgenciasNombre();
		PreparedStatement  comando= conexion.prepareStatement(sql);
		
		System.out.println("el nombre que llega: "+nombre);
		comando.setString(1, nombre + "%");
		ResultSet rs = comando.executeQuery();
		
//		if(rs.next())
//		{
			//System.out.println("entró");
			int i=0;
			while(rs.next()){
	
				DataAgencia laAgencia=new DataAgencia(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
				listaAgencias.add(laAgencia);
			}
			
		//}
		
		comando.close();
		conexion.close();
		
		return listaAgencias;
	}
	
}
