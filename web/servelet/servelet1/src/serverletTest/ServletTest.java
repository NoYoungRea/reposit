package serverletTest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/third")
public class ServletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ServletTest() {
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
    	String name=request.getParameter("name");
    	int age=Integer.parseInt(request.getParameter("age"));
    	PrintWriter out=response.getWriter();
    	
    	out.println("<!DOCType html>");
    	out.println("<html>");
    	out.println("<head>");
    	out.println("<meta charset='UTF-8'/>");
    	out.println("<title>ThirdServlet</title>");
    	out.println("</head>");
    	out.println("<body>");
    	out.println("<div>¿Ã∏ß"+name+"<div>");
    	out.println("<div>age"+age+"<div>");
    	out.println("</body>");
    	out.println("</html>");
	}

}
