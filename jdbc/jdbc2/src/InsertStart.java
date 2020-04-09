

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class InsertStart {
	public static int getNextId(Connection con, String code) throws SQLException {
		int id = 0;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("SELECT IFNULL(MAX(id),0) + 1 AS nextId FROM articles WHERE p_code = '" + code + "';");
			while(rs.next()) {
				id = rs.getInt("nextId");
			}
		}
		catch(SQLException e) {
			System.err.println("articles테이블의 id를 구하는도중 문제가 발생하였습니다.");
			e.printStackTrace();
			throw e; //finally 하고나서 쓰로우 할것임 //finally를 실행하고 throw를 할 것 즉 id를 리턴하지는 않을 것.
		}
		finally {
			try {rs.close();} catch(Exception e) {}
			try {stmt.close();} catch(Exception e) {}
		}
		
		return id;
	}
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		
		try {
			con = ServerInfo.getConnection();
			pstmt = con.prepareStatement("INSERT INTO articles VALUES(?,?,?,?,?,?);"); // 6번은 default로 해도된다. 아래꺼 3줄안하고
			//articles 테이블에서 'movie'코드를 가지는 게시글의 등록해야할 번호를 구하세요.
			pstmt.setInt(1, getNextId(con,"fishing"));
			pstmt.setString(2, "fishing");
			pstmt.setString(3, "김성재");
			pstmt.setString(4, "abcdef");
			pstmt.setString(5, "여기에 내용을 입력합니다.");
			//stmt.setString(6, default); //이거 아님 저 벨류 물음표 에다가 디폴트
			//Calendar cal=Calendar.getInstance();
			//stmt.setDate(6, cal.getTime());//서로 호환이 안됨.
			//stmt.setString(6, "1234-12-23 23:12:32"); 
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String now = sdf.format(Calendar.getInstance().getTime()); // 타입이 안맞기때문에 이렇게 바꿔서 넣어줘야한다.
			pstmt.setString(6, now);
			if(pstmt.executeUpdate() > 0) {
				System.out.println("게시물 등록에 성공하였습니다.");
			}
			else {
				throw new Exception("알수없는 원인에 의해 게시글 등록에 실패하였습니다.");
				//예외 메세지 만들어 던져서 아래에서 받아도 됨.
			}
		
			
		}
		catch(SQLException e) {
			System.err.println("게시글 등록에 실패하였습니다.");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		finally {
			try {pstmt.close();} catch(Exception e) {}
			try {con.close();} catch(Exception e) {}
		}
	}
}
