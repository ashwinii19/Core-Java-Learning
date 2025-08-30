package com.techlabs.ServletContextConfig.text;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/visitCounter")
public class CounterServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext context2 = getServletContext();
		Integer count = (Integer) context2.getAttribute("counter");
		
		count++;
		context2.setAttribute("counter", count);
		
		resp.setContentType("text/html");
		resp.getWriter().write("Visitor count: "+count);
	}
}
