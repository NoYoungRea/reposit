package kr.co.shdudfo.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface ServiceController {
	public void doService(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException;
}
