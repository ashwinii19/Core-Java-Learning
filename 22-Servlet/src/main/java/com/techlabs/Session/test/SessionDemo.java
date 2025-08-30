package com.techlabs.Session.test;
 
//Java Program to Illustrate Creation and last-accessed

//Times for a Session
 
//Import required java libraries

import java.io.*;

import java.util.*;

import javax.servlet.*;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.*;
 
//Extend HttpServlet class

@WebServlet("/Session")

public class SessionDemo extends HttpServlet {
 
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
		// Create a session object if it is already not

		// created.

		HttpSession session = request.getSession(true);
 
		// Get session creation time.

		Date createTime = new Date(session.getCreationTime());
 
		// Get last access time of this web page.

		Date lastAccessTime = new Date(session.getLastAccessedTime());
 
		String title = "Welcome to Servlet demo";

		Integer visitCount = new Integer(0);

		String visitCountKey = new String("visitCount");

		String userIDKey = new String("userID");

		String userID = new String("Admin");
 
		// Check if this is new comer on your web page.

		if (session.isNew()) {

			title = "Welcome to Servlet demo";

			session.setAttribute(userIDKey, userID);

		} else {

			visitCount = (Integer) session.getAttribute(visitCountKey);

			visitCount = visitCount + 1;

			userID = (String) session.getAttribute(userIDKey);

		}

		session.setAttribute(visitCountKey, visitCount);
 
		// Set response content type

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		
		if(visitCount >= 5) {
			session.invalidate();
		}
 
//		session.setMaxInactiveInterval(10);

		//session.invalidate();
 
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
 
		out.println(docType + "<html>\n" + "<head><title>" + title + "</title></head>\n" +
 
				"<body bgcolor = \"#f0f0f0\">\n" + "<h1 align = \"center\">" + title + "</h1>\n"

				+ "<h2 align = \"center\">Session Information</h2>\n" + "<table border = \"1\" align = \"center\">\n" +
 
				"<tr bgcolor = \"#949494\">\n" + "  <th>Session info</th><th>value</th>" + "</tr>\n" +
 
				"<tr>\n" + "  <td>id</td>\n" + "  <td>" + session.getId() + "</td>" + "</tr>\n" +
 
				"<tr>\n" + "  <td>Creation Time</td>\n" + "  <td>" + createTime + "  </td>" + "</tr>\n" +
 
				"<tr>\n" + "  <td>Time of Last Access</td>\n" + "  <td>" + lastAccessTime + "</td>" + "</tr>\n" +
 
				"<tr>\n" + "  <td>User ID</td>\n" + "  <td>" + userID + "</td>" + "</tr>\n" +
 
				"<tr>\n" + "  <td>Number of visits</td>\n" + "  <td>" + visitCount + "</td>" + "</tr>\n" + "</table>\n"

				+ "</body>" + "</html>");

	}

}

 