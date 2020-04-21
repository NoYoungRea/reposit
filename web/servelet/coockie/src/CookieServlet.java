

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  		response.setContentType("text/html;charset=utf-8");
  		Cookie cookie=new Cookie("name",request.getParameter("name"));
  		cookie.setMaxAge(1*24*60*60);
  		//cookie.setDomain("powerlinux.co.kr");
  		//cookie.setPath("/");
  		//http://localhost:8080/내에서 유효 /second하면 8080/second내에서 유효
  		response.addCookie(cookie);
  		response.getWriter().println("쿠기를 저장하였습니다.");
  	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
