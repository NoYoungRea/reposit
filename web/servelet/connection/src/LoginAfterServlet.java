

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bin.Member;

/**
 * Servlet implementation class LoginAfterServlet
 */
@WebServlet("/loginAfter")
public class LoginAfterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

  		PrintWriter out=response.getWriter();
  		HttpSession session=request.getSession(false);
  		if(session==null)//login페이지를 거치지 않고 바로 올수도 있기때문에 로그인 페이지를 거쳐야 한다.
  			out.println("로그인상태가 아닙니다.");
  		else {
  			Member m=(Member)session.getAttribute("member");
  			if(m==null)
  	  			out.println("로그인상태가 아닙니다.");
  			else {
  				out.println("메일주소:"+m.getEmail()+"<br>");
  				out.println("별명:"+m.getNick()+"<br>");
  				out.println("사용자 인증이 정상적으로 처리되었습니다.");  	
  			}
  		}
  	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
