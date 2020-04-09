package jdbc3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AppStart {
	public static void main(String[]args) {
		Connection con=null;
		String url="jdbc:mariadb://localhost:3306/example?user=example&password=1234";
		Statement stme=null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con=DriverManager.getConnection(url);
			stme=con.createStatement();
			int result=stme.executeUpdate("insert into members values('laee','ÀÌ¼ø½Å','sunsin@naver.com',MD5('1234'))");
			System.out.println("result: "+result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				stme.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
