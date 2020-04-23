package kr.co.shdudfo.service;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberService implements ServiceController{

	@Override
	public void doService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String type=request.getParameter("type");
		switch(type) {
		case "insert" :
			register(request,response);
			break;
		case "entire" :
			entire(request,response);
			break;
		case "login" :
			login(request,response);
			break;
		default:
			;
			
		}
		
	}
	private void register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println("ȸ�����Լ���");	
	}
	private void entire(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println("ȸ��Ż�𼭺�");	

	}
	private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println("�α��� ����");	

	}
}
