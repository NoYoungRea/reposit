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
	  MemberDAO memberdao=new MemberDAO();
      
      //계정 찾기
      String email = request.getParameter("email");
      String pass = request.getParameter("pass");

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
			   
	   
      //계정 만들기
      String email1 = request.getParameter("email");
      String nick= request.getParameter("nick");
      String pass1 = request.getParameter("pass");
      Member m=new Member();
      m.setEmail(email);
      m.setNick(nick);
      m.setPassword(pass);
      memberdao.insert(m);
      
      
      
      //계정 지우기
      String email2 = request.getParameter("email");
      Member m2=new Member();
      m.setEmail(email);
      memberdao.delete(m);
	   
   }

   
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      doGet(request, response);
   }
   public void search() {
	   
   }

}