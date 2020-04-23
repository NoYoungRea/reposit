package kr.co.shdudfo.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.shdudfo.service.BoardService;
import kr.co.shdudfo.service.MemberService;
import kr.co.shdudfo.service.ServiceController;
import kr.co.shdudfo.service.UnkownService;

@WebServlet("/*")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HashMap<String,ServiceController>services;
	
	public void init(ServletConfig config)throws ServletException {
		services=new HashMap<>();
		services.put("/controllerProject/member", new MemberService());
		services.put("/controllerProject/board", new BoardService());
		services.put("/controllerProject/unknown", new UnkownService());
		

	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri=request.getRequestURI();
		ServiceController sc=null;
		if(services.containsKey(uri)) {
			services.get(uri).doService(request, response);
		}else {
			services.get("/controllerProject/unknown").doService(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
