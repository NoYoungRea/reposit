

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MemberDAO;
import bin.Member;

/**
 * Servlet implementation class register
 */
@WebServlet("/registerMember")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      request.setCharacterEncoding("utf-8");
	      response.setContentType("text/html; charset=utf-8"); 
	      PrintWriter out = response.getWriter();
		  MemberDAO memberdao=new MemberDAO();
		
	      String email = request.getParameter("email");
	      String nick= request.getParameter("nick");
	      String pass = request.getParameter("pass");
	      Member m=new Member();
	      m.setEmail(email);
	      m.setNick(nick);
	      m.setPassword(pass);
	      memberdao.insert(m);
	      
	      request.setAttribute("member", m);
	      RequestDispatcher disp=request.getRequestDispatcher("register.jsp");
	      disp.forward(request, response);
	}

}
