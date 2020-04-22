

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class b
 */
@WebServlet(
		name="test",
		urlPatterns="/test",
		initParams= {@WebInitParam(name="encoding",value="utf-8"),
				@WebInitParam(name="contentType",value="text/html;charset=utf-8"),
		})
public class b extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	
	private String encoding;
	private String contentType;
	public void init(ServletConfig config)throws ServletException{
		encoding=config.getInitParameter("encoding");
		contentType=config.getInitParameter("contentType");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding(encoding);
		response.setContentType(contentType);
		PrintWriter out=response.getWriter();
		ServletContext sc=request.getServletContext();
		out.println("testservlet doget");	
		out.println(sc.getAttribute("servername"));
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
