

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException{
		ServletContext sc=config.getServletContext();
		String jdbcURL=sc.getInitParameter("jdbcURL");
		String database=sc.getInitParameter("database");
		String dbUser=sc.getInitParameter("dbUser");
		String dbPass=sc.getInitParameter("dbPass");
		StringBuffer sb=new StringBuffer();
		sb.append(jdbcURL).append("/").append(database).append("?").append("user=").append(dbUser)
		.append("&").append("password=").append(dbPass);
		System.out.println(sb);
		sc.setAttribute("URL", sb);

	}//최초 이클레스에 대한 요청이 있을때 딱 한번. 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
