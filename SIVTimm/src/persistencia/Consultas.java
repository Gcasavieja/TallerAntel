package persistencia;

public class Consultas {

	public String insertTicket()
	{
		String query = "INSERT INTO ticket VALUES (null,?,?,?,?,?,?,?,?);";
		return query;
	}
	
	public String insertAgencia()
	{
		String query = "INSERT INTO agencia VALUES (null,?,?,?);";
		return query;
	}
	
	public String existAgencia()
	{
		String query = "SELECT * FROM agencia where nombre = ? and telefono = ?;";
		return query;
	}

	public String existAgenciaId() {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM agencia where id_agencia = ?;";
		return query;
	}
}
