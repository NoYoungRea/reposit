

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
			System.err.println("articles���̺��� id�� ���ϴµ��� ������ �߻��Ͽ����ϴ�.");
			e.printStackTrace();
			throw e; //finally �ϰ��� ���ο� �Ұ��� //finally�� �����ϰ� throw�� �� �� �� id�� ���������� ���� ��.
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
			pstmt = con.prepareStatement("INSERT INTO articles VALUES(?,?,?,?,?,?);"); // 6���� default�� �ص��ȴ�. �Ʒ��� 3�پ��ϰ�
			//articles ���̺��� 'movie'�ڵ带 ������ �Խñ��� ����ؾ��� ��ȣ�� ���ϼ���.
			pstmt.setInt(1, getNextId(con,"fishing"));
			pstmt.setString(2, "fishing");
			pstmt.setString(3, "�輺��");
			pstmt.setString(4, "abcdef");
			pstmt.setString(5, "���⿡ ������ �Է��մϴ�.");
			//stmt.setString(6, default); //�̰� �ƴ� �� ���� ����ǥ ���ٰ� ����Ʈ
			//Calendar cal=Calendar.getInstance();
			//stmt.setDate(6, cal.getTime());//���� ȣȯ�� �ȵ�.
			//stmt.setString(6, "1234-12-23 23:12:32"); 
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String now = sdf.format(Calendar.getInstance().getTime()); // Ÿ���� �ȸ±⶧���� �̷��� �ٲ㼭 �־�����Ѵ�.
			pstmt.setString(6, now);
			if(pstmt.executeUpdate() > 0) {
				System.out.println("�Խù� ��Ͽ� �����Ͽ����ϴ�.");
			}
			else {
				throw new Exception("�˼����� ���ο� ���� �Խñ� ��Ͽ� �����Ͽ����ϴ�.");
				//���� �޼��� ����� ������ �Ʒ����� �޾Ƶ� ��.
			}
		
			
		}
		catch(SQLException e) {
			System.err.println("�Խñ� ��Ͽ� �����Ͽ����ϴ�.");
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
