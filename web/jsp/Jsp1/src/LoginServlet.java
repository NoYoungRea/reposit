

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.MemberDAO;
import bin.Member;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
      request.setCharacterEncoding("utf-8");
      response.setContentType("text/html; charset=utf-8"); 
      PrintWriter out = response.getWriter();
	  MemberDAO memberdao=new MemberDAO();
	  
	  
	  String email = request.getParameter("email");
      String pass = request.getParameter("pass");

	   Member member =memberdao.search(email,pass);
	   
	   if(member==null) {
		   out.println("x");
	   }
	   else {
		   HttpSession session =request.getSession();
		   session.setAttribute("member", member);
		   response.sendRedirect("login.jsp");
		   
//		   
//		   RequestDispatcher disp=request.getRequestDispatcher("/loginAfter");
//		   disp.forward(request, response);
	   }
		
	}

}
