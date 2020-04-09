package jdbc1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AppStart {
	public static void main(String[]args) {
		Connection con=null;
		String url="jdbc:mariadb://127.0.0.1:3306/shdudfoils";
		String user="shdudfoils";
		String pass="1234";
		try {
			Class.forName("org.mariadb.jdbc.Driver");
//forname은 클레스 로더를 호출시킨다.
			System.out.println("jdbc 드라이버를 drivermanager에 등록하였습니다.");
			con=DriverManager.getConnection(url,user,pass);
			System.out.println("데이터베이스 서버에 정상적으로 접속함");
		} catch (ClassNotFoundException e) {
			System.err.println("jdbc 드라이버 검색에 실패하였습니다.");
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try{con.close();}catch(Exception e) {}
			//null이랑 sqlexception
		}
	}
}
//서드 파티 드라이버를 사용하기 위해서는 
//1. 프로젝트 안에 넣는다. 빌드 페스에서 추가 but 이거는 이클립스 안에서만 시동이 가능하다.(cmd는 루트 설정이 jre system만)
//2. jre에 직접 추가

//드라이버 메니저가 뉴를 하여 드라이버의 인스턴스를 만드는 것이 아니라 드라이버 자체가 인스턴스를 만들어서 매니저한테 넘긴다.(외부에서는 못 만드며 싱글톤으로 구성)
