package persistencia;

public class Consultas {

	public String insertTicket()
	{
		String query = "INSERT INTO TABLE_NAME VALUES (?,?,?,?,?,?,?,?,?);";
		return query;
	}
}
