

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
	
	//URL형식 jdbc:mariadb://서버주소:포트번호/데이터베이스?user=계정&password=비밀번호
	public static String getURL() {
		return ("jdbc:mariadb://" + SERVER + ":3306/" + DATABASE + "?user="
				+ USER + "&password=" + PASSWORD);
	}
	public static Connection getConnection() throws SQLException{
		try {
			Class.forName("org.mariadb.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("jdbc 드라이버가 설치되지 않았습니다.");
			System.exit(1);
		}
		return DriverManager.getConnection(getURL());

	}
	
	
}
