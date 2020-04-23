

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
  		if(session==null)//login�������� ��ġ�� �ʰ� �ٷ� �ü��� �ֱ⶧���� �α��� �������� ���ľ� �Ѵ�.
  			out.println("�α��λ��°� �ƴմϴ�.");
  		else {
  			Member m=(Member)session.getAttribute("member");
  			if(m==null)
  	  			out.println("�α��λ��°� �ƴմϴ�.");
  			else {
  				out.println("�����ּ�:"+m.getEmail()+"<br>");
  				out.println("����:"+m.getNick()+"<br>");
  				out.println("����� ������ ���������� ó���Ǿ����ϴ�.");  	
  			}
  		}
  	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
