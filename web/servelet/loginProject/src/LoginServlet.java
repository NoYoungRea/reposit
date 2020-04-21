

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/plain; charset=utf-8");
		PrintWriter out=response.getWriter();
		out.println(request.getParameter("email"));
		
		//email과 pass 파라미터를 이용하여 members 테이블로부터 회원정보를 확인하고
		//계정이 존재하지 않으면 '계전이 존재하지 않습니다.'메세지를 반환하고
		//계정은 존재하지만 비밀번호가 일치하지 않을 겨우 '비밀번호가 일치하지 않습니다. '메세지를 반환하며
		//계정도 일치하고 비밀번호도 일치한다면 정상적으로 로그인 되었습니다. 메세지를 반환한다.
		//정장적으로 로그인 되었다면 세션변수를 설정한다.
		//사용자 계정을 email이라는 식별자로 세션에 저장한다.
		//로그인을 했는지 안 했는지 확인하겠다 
	}

}
