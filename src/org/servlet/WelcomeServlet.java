package org.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet{
	
	//获取当前servlet的初始化参数
	public void init() {
		System.out.println("init...");
		//获取当前Servlet的初始化参数
		String value = super.getInitParameter("servletParamName");
		System.out.println("当前servlet的参数servletParamName的值是： "+value);
		
		//获取当前web容器的初始化参数
		ServletContext servletContext = getServletContext();
		String globalValue = servletContext.getInitParameter("globalParam");
		System.out.println("当前web容器的参数globalParam的值是： " + globalValue);
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy...");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//super.doGet(req, resp);
		System.out.println("service的具体实现...");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//super.doPost(req, resp);
		//System.out.println("doPost...");
		this.doGet(req, resp);
	}
	
}
