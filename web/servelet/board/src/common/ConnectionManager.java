package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManager {
	private static final String URL = "jdbc:mariadb://localhost:3306/servlet?user=servlet&password=1234";
	private static Connection connection;
	
	public static Connection getConnection() throws SQLException{
		if(connection == null) {
			connection = DriverManager.getConnection(URL);
		}	
		return connection;
	}
	public static void close(ResultSet rs) {
		try {rs.close();} catch(Exception e) {}
	}
	public static void close(Statement stmt) {
		try {stmt.close();} catch(Exception e) {}
	}
	public static void close(Statement stmt, ResultSet rs) {
		close(rs);
		close(stmt);
	}
}
