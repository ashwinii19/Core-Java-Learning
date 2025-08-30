package com.techlabs.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/assignments")
public class AssignmentServlet extends HttpServlet {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/smart_portal";
	private static final String DB_USER = "root";
	private static final String DB_PASS = "admin#123";

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		HttpSession session = request.getSession(false);
		if (session == null || session.getAttribute("studentName") == null) {
			response.sendRedirect("index.html?error=1");
			return;
		}

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html><html><head><title>Assignments</title>");
		out.println("<link rel='stylesheet' href='css/style.css'>");
		out.println("<style>");
		out.println("table { width: 100%; border-collapse: collapse; margin-top: 20px; }");
		out.println("th, td { padding: 12px; border: 1px solid #ddd; text-align: left; }");
		out.println("th { background-color: #6c5ce7; color: white; }");
		out.println("tr:hover { background-color: #f2f2f2; }");
		out.println("</style>");
		out.println("</head><body class='login-body'>");

		out.println("<div class='login-box'>");
		out.println("<h2>Your Assignments</h2>");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM assignments ORDER BY deadline");

			out.println("<table>");
			out.println("<tr><th>Title</th><th>Subject</th><th>Deadline</th></tr>");

			boolean found = false;
			while (rs.next()) {
				found = true;
				String title = rs.getString("title");
				String subject = rs.getString("subject");
				String deadline = rs.getString("deadline");

				out.println("<tr>");
				out.println("<td>" + title + "</td>");
				out.println("<td>" + subject + "</td>");
				out.println("<td>" + deadline + "</td>");
				out.println("</tr>");
			}

			if (!found) {
				out.println("<tr><td colspan='3' style='text-align:center;'>No assignments available</td></tr>");
			}

			out.println("</table>");
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
			out.println("<p style='color:red;'>Error loading assignments</p>");
		}

		out.println("<form action='dashboard' method='get' style='margin-top: 20px;'>");
		out.println("<button type='submit' class='btn'>Back to Dashboard</button>");
		out.println("</form>");

		out.println("</div></body></html>");
	}
}