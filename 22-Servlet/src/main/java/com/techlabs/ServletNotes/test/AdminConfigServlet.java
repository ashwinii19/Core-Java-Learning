package com.techlabs.ServletNotes.test;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

@WebServlet(
	    urlPatterns = {"/admin"},
	    initParams = {
	        @WebInitParam(name = "storeName", value = "BookVerse"),
	        @WebInitParam(name = "adminEmail", value = "admin@bookverse.com"),
	        @WebInitParam(name = "category", value = "Science")
	    }
	)
	public class AdminConfigServlet extends HttpServlet {
	    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
	        ServletConfig config = getServletConfig();

	        String store = config.getInitParameter("storeName");
	        String email = config.getInitParameter("adminEmail");
	        String category = config.getInitParameter("category");

	        PrintWriter out = res.getWriter();
	        res.setContentType("text/html");

	        out.println("<html><head><style>");
	        out.println("body { font-family: 'Segoe UI', sans-serif; padding: 30px; background-color: #fffbe7; }");
	        out.println("h2 { color: #ff9800; } p { font-size: 16px; } a { color: #007bff; text-decoration: none; }");
	        out.println("</style></head><body>");
	        out.println("<h2> Admin Configuration Servlet Output</h2>");
	        out.println("<p><strong>Admin Panel</strong></p>");
	        out.println("<p>Configured Category: " + category + "</p>");
	        out.println("<p>Store Name: " + store + "</p>");
	        out.println("<p>Contact Admin: " + email + "</p>");
	        out.println("<br><a href='welcome'>Back to Home</a>");
	        out.println("</body></html>");
	    }
	}