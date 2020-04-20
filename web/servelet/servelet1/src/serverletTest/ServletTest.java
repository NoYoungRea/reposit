package serverletTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/second")
public class ServletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ServletTest() {
        super();
    	System.out.println("새성자 호출");
    }
    public void init(ServletConfig config)throws ServletException{
    	System.out.println("initmethod is called");
    	
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   	System.out.println("doget is called");
	}

}
