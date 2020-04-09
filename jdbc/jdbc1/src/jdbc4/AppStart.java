package jdbc4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AppStart {
	public static void main(String[]args) {
		Connection con=null;
		PreparedStatement pstmt=null;
		String url="jdbc:mariadb://localhost:3306/example?user=example&password=1234";
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con=DriverManager.getConnection(url);
			pstmt=con.prepareStatement("insert into members values(?,?,?,MD5(?));");
			pstmt.setString(1, "b");
			pstmt.setString(2, "b");
			pstmt.setString(3, "c");
			pstmt.setString(4, "1234");

			int result=pstmt.executeUpdate();
			System.out.println("result:"+result);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				pstmt.close();
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
