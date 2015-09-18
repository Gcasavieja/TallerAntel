package persistencia;

public class Consultas {

	public String insertTicket()
	{
		String query = "INSERT INTO TABLE_NAME VALUES (?,?,?,?,?,?,?,?,?);";
		return query;
	}
	
	public String insertAgencia()
	{
		String query = "INSERT INTO agencia VALUES (null,?,?,?);";
		return query;
	}
}
