package connection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class DbController {
	public static Connection getConnection() throws NamingException,SQLException{
		 InitialContext ic = new InitialContext();
         DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/servlet");
         return ds.getConnection();
        
	}
	public static void close(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void close(Statement stmt) {
		try {
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void close(ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void close(Statement stmt,Connection con) {
		close(stmt);
		close(con);
	}
	public static void close(ResultSet rs,Statement stmt,Connection con) {
		close(rs);
		close(stmt,con);
	}

}
