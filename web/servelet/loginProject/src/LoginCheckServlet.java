

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loginCheck")
public class LoginCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginCheckServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain;charset=utf-8");
		PrintWriter out=response.getWriter();
		
		HttpSession session=request.getSession(false);
		try {
			Enumeration<String> atts=session.getAttributeNames();
			while(atts.hasMoreElements()) {
				String attr=atts.nextElement();
				if(attr.equals("email")) {
					out.println("{result:true,message:'���� �α��εǾ� �ִ� ����'}");
					return;
				}
			}
			out.println("{result:false,message:'����α��� �Ǿ� ���� ���� �����Դϴ�.'}");
		}catch(NullPointerException e) {
			out.println("{result:false,message:'����α��� �Ǿ� ���� ���� �����Դϴ�.'}");
		}
		
	}

}
