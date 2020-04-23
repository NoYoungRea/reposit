package kr.co.shdudfo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.shdudfo.service.BoardService;
import kr.co.shdudfo.service.MemberService;
import kr.co.shdudfo.service.ServiceController;

@WebServlet("/*")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri=request.getRequestURI();
		ServiceController sc=null;
		if(uri.equals("/controllerProject/member")) {
			sc=new MemberService();
			sc.doService(request, response);
		}
		else if(uri.equals("/controllerProject/board")) {
			sc=new BoardService();
			sc.doService(request, response);
			
		}else {
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().println("해당서비스는 지원되지 않습니다.");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
