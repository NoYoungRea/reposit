package kr.co.shdudfo.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UnkownService implements ServiceController{

	@Override
	public void doService(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		response.getWriter().println("알수없는 서비스 요청");	
	}

}
