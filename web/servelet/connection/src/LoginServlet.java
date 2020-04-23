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


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
  
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
      request.setCharacterEncoding("utf-8");
      response.setContentType("text/html; charset=utf-8"); 
      PrintWriter out = response.getWriter();
      
      String email = request.getParameter("email");
      String pass = request.getParameter("pass");
	   MemberDAO memberdao=new MemberDAO();
	   Member member =memberdao.search(email,pass);
	   
	   if(member==null) {
		   out.println("x");
	   }
	   else {
		   HttpSession session =request.getSession();
		   session.setAttribute("member", member);
		   RequestDispatcher disp=request.getRequestDispatcher("/loginAfter");
		   disp.forward(request, response);
	   }
			   
      
   }

   
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      doGet(request, response);
   }

}