package serverletTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Servlet")
public class ServletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ServletTest() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF8");
		PrintWriter out =response.getWriter();
		out.println("get method요청에 대한 응답");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		out.println("post method요청에 대한 응답");	
	}

}
