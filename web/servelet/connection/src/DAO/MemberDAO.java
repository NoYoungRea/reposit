package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import javax.naming.NamingException;

import bin.Member;
import connection.DbController;

public class MemberDAO {

	public boolean insert(Member m) {
		boolean result=false;
		return result;
	}
	
	public boolean delete(Member m) {
		boolean result=false;
		return result;
	}
	public Member search(String email,String password) {
		Member m=null;
		
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			con=DbController.getConnection();
			stmt=con.createStatement();
			rs=stmt.executeQuery("select*from members where email='"+email+"' AND pass=password("+password+")");
			if(rs.next()) {
				m=new Member();
				m.setEmail(rs.getString("email"));
				m.setNick(rs.getString("nick"));
				m.setPassword(rs.getString("pass"));
				m.setRegdate(rs.getString("regdate"));
				m.setRmoveAt(rs.getString("remove_at"));

			}
		}catch(NamingException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DbController.close(rs,stmt,con);
		}
		
		
		return m;
	}
	public ArrayList<Member> getMemberList(){
		ArrayList<Member>list =new ArrayList<>();	
		return list;
	}
}
