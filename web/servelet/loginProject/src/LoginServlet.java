

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
		
		//email�� pass �Ķ���͸� �̿��Ͽ� members ���̺�κ��� ȸ�������� Ȯ���ϰ�
		//������ �������� ������ '������ �������� �ʽ��ϴ�.'�޼����� ��ȯ�ϰ�
		//������ ���������� ��й�ȣ�� ��ġ���� ���� �ܿ� '��й�ȣ�� ��ġ���� �ʽ��ϴ�. '�޼����� ��ȯ�ϸ�
		//������ ��ġ�ϰ� ��й�ȣ�� ��ġ�Ѵٸ� ���������� �α��� �Ǿ����ϴ�. �޼����� ��ȯ�Ѵ�.
		//���������� �α��� �Ǿ��ٸ� ���Ǻ����� �����Ѵ�.
		//����� ������ email�̶�� �ĺ��ڷ� ���ǿ� �����Ѵ�.
		//�α����� �ߴ��� �� �ߴ��� Ȯ���ϰڴ� 
	}

}
