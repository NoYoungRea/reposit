

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ServerInfo {
	private static String SERVER = "192.168.30.200";
	private static String USER = "student";
	private static String PASSWORD = "1234";
	private static String DATABASE = "student";
	
	public static String getSERVER() {
		return SERVER;
	}
	public static void setSERVER(String server) {
		SERVER = server;
	}
	public static String getUSER() {
		return USER;
	}
	public static void setUSER(String user) {
		USER = user;
	}
	public static String getPASSWORD() {
		return PASSWORD;
	}
	public static void setPASSWORD(String password) {
		PASSWORD = password;
	}
	public static String getDATABASE() {
		return DATABASE;
	}
	public static void setDATABASE(String database) {
		DATABASE = database;
	}
	
	//URL���� jdbc:mariadb://�����ּ�:��Ʈ��ȣ/�����ͺ��̽�?user=����&password=��й�ȣ
	public static String getURL() {
		return ("jdbc:mariadb://" + SERVER + ":3306/" + DATABASE + "?user="
				+ USER + "&password=" + PASSWORD);
	}
	public static Connection getConnection() throws SQLException{
		try {
			Class.forName("org.mariadb.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("jdbc ����̹��� ��ġ���� �ʾҽ��ϴ�.");
			System.exit(1);
		}
		return DriverManager.getConnection(getURL());

	}
	
	
}
