package org.jsp.Servlet_demo;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyServlet extends GenericServlet {
	@Override
	public void service(ServletRequest req,ServletResponse resp) throws ServletException,IOException{
		System.out.println("welcome to the world of servlets");
	}
}
