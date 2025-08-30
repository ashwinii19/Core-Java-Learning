package com.techlabs.ServletContextConfig.text;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/context")
public class ServletContextDemo extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context = getServletContext();
		String company = context.getInitParameter("Company Name");
		String name = context.getInitParameter("Employee Name");
		String age = context.getInitParameter("Age");
		
		
		resp.setContentType("text/html");
		resp.getWriter().write("Company name is: "+company+"\n");
		resp.getWriter().write("Employee name is: "+name+"\n");
		resp.getWriter().write("Age is: "+age+" ");
		
	}
}