package jdbc2;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class AppStart {
	public static void main(String[]args) {
		Properties prop=new Properties();
		final String url="jdbc:mariadb://localhost:3306/example";
		final String user="example";
		final String pass="1234";
		
		
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			prop.load(new FileReader("a.txt"));
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("jdbc ����̹��� �˻��Ǿ����ϴ�.");//!=���
			//con=DriverManager.getConnection(url,user,pass);
			con=DriverManager.getConnection(prop.getProperty("url"),prop.getProperty("user"),prop.getProperty("pass"));
			System.out.println("�����ͺ��̽� ������ ���ӵǾ����ϴ�.");
			stmt=con.createStatement();
			rs=stmt.executeQuery("select* from members");
			while(rs.next()) {
				System.out.printf("%s %s\n", rs.getString(2),rs.getString(3));//1base
			}
		}catch(ClassNotFoundException e) {
			System.out.println("����̹� �˻��� �����߾��!");
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
