package org.jsp.Servlet_demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/hello"})
public class YourServlets extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		PrintWriter writter=resp.getWriter();
		writter.write("<html><body><h1>hello from your servlet</h1></body></html>");
	}
}
