package kr.co.shdudfo.controller;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.shdudfo.service.ServiceController;


public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HashMap<String,ServiceController>services;
	
	public void init(ServletConfig config)throws ServletException {
		services=new HashMap<>();
		Enumeration<String> names=config.getInitParameterNames();
		while(names.hasMoreElements()) {
			String name=names.nextElement();
			try {
				Class cls=Class.forName(config.getInitParameter(name));//해당클레스를 메모리에 올림.
				services.put(name,(ServiceController)(cls.newInstance()));
			}catch(Exception e) {
				
			}
		}

	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uri=request.getRequestURI();
		String dispatcherUri=null;
		ServiceController sc=null;
		if(services.containsKey(uri)) {
			dispatcherUri=services.get(uri).doService(request, response);
			RequestDispatcher disp=request.getRequestDispatcher(dispatcherUri);
			disp.forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
