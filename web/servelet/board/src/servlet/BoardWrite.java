package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import common.ConnectionManager;


@WebServlet("/writeBoard")
public class BoardWrite extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public String setNumber(String key, Number value) {
		return (key+ ":" +"'"+ value +"'");
	}
	
	public String setString(String key,String value) {
		return (key+ ":" + "'"+ value +"'");
	}
  
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession(false); // ���Ǿ����� null ��ȯ
		//session.invalidate();
		String a=(String)session.getAttribute("email");
		System.out.println(a);
		
		if(session == null) { //�α��� ���޴ٴ� ��
			StringBuffer sb = new StringBuffer();
			sb.append("{");
			sb.append(setNumber("errno", 9));
			sb.append(", ");
			sb.append(setString("message", "�α����� �ϼž� ����� �����մϴ�."));
			sb.append("}");
			out.println(sb);
			return;
		}
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = ConnectionManager.getConnection();
			pstmt = conn.prepareStatement("INSERT INTO boards VALUES(default,?,?,?,default, default, default)");
			pstmt.setString(1, (String)session.getAttribute("email"));
			pstmt.setString(2, request.getParameter("title"));
			pstmt.setString(3,  request.getParameter("content"));
			pstmt.executeUpdate();
			out.println("{ errno: 0, message: '�ڷ����� ���������� ó���Ǿ����ϴ�.'}");
		}
		catch(SQLException e) {
			e.printStackTrace();
			out.println("{errno: 1, message:'�ڷ��Ͽ� �����Ͽ����ϴ�.'}");
		}
		finally {
			ConnectionManager.close(pstmt);
		}
	}

}
