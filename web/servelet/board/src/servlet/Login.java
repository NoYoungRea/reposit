package servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/login")
public class Login extends HttpServlet {
   private static final long serialVersionUID = 1L;


   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      request.setCharacterEncoding("utf-8");
      response.setContentType("text/plain; charset=utf-8");
      PrintWriter out=response.getWriter();
     String email = request.getParameter("email");
     String pass = request.getParameter("pass");
      
  	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	Statement stmt2 = null;
	ResultSet rs2 = null;
	
	try {
		String sql = "SELECT * FROM members WHERE email= '" + email + "'";
		Class.forName("org.mariadb.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/servlet", "servlet", "1234");
		
		stmt = con.createStatement();
		rs = stmt.executeQuery(sql);
		if(rs.next()) {
			String sql2 = "SELECT * FROM members WHERE email= '" + email + "' AND pass = PASSWORD('"+ pass +"')";
			
			stmt2 = con.createStatement();
			rs2 = stmt2.executeQuery(sql2);
			if(rs2.next()) { //비밀번호 일치
				HttpSession session = request.getSession(); //없으면 새로운 세션 만들어반환할것.
				session.setAttribute("email", email);
				out.println("{errno: 0, message: '로그인이 정상적으로 처리되었습니다.'}");
			}
			else {
				out.println("{errno: 1, message: '비밀번호가 일치하지않습니다.'}");
			}
		}
		else {
			out.println("{errno: 2, message: '존재하지않는 메일주소입니다.'}");
		}
	}
	
	catch(ClassNotFoundException e) {
		e.printStackTrace();
		out.println("{error: 3, message:'jdbc드라이버가 설치되지않았습니다.'}");
	}
	catch(SQLException e) {
		e.printStackTrace();
		out.println("{error: 4, message:'SQL오류가 발생하였습니다.'}");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		try {rs2.close();} catch(Exception e) {}
		try {rs.close();} catch(Exception e) {}
		try {stmt2.close();} catch(Exception e) {}
		try {stmt.close();} catch(Exception e) {}
		try {con.close();} catch(Exception e) {}
	}
	

   }

}