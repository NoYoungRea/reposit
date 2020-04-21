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
			if(rs2.next()) { //��й�ȣ ��ġ
				HttpSession session = request.getSession(); //������ ���ο� ���� ������ȯ�Ұ�.
				session.setAttribute("email", email);
				out.println("{errno: 0, message: '�α����� ���������� ó���Ǿ����ϴ�.'}");
			}
			else {
				out.println("{errno: 1, message: '��й�ȣ�� ��ġ�����ʽ��ϴ�.'}");
			}
		}
		else {
			out.println("{errno: 2, message: '���������ʴ� �����ּ��Դϴ�.'}");
		}
	}
	
	catch(ClassNotFoundException e) {
		e.printStackTrace();
		out.println("{error: 3, message:'jdbc����̹��� ��ġ�����ʾҽ��ϴ�.'}");
	}
	catch(SQLException e) {
		e.printStackTrace();
		out.println("{error: 4, message:'SQL������ �߻��Ͽ����ϴ�.'}");
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