package com.techlabs.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/smart_portal";
	private static final String DB_USER = "root";
	private static final String DB_PASS = "admin#123";

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("studentName");
		String password = request.getParameter("studentPassword");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		if (name == null || name.trim().isEmpty() || password == null || password.trim().isEmpty()) {
			response.sendRedirect("error.html");
			return;
		}

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);

			PreparedStatement check = con.prepareStatement("SELECT id FROM students WHERE name = ?");
			check.setString(1, name);
			ResultSet rs = check.executeQuery();

			if (rs.next()) {
				out.println("<!DOCTYPE html>");
				out.println("<html><head><title>Registration Failed</title>");
				out.println("<link rel='stylesheet' href='css/style.css'></head><body class='error-body'>");
				out.println("<div class='error-box'>");
				out.println("<h3>User already exists</h3>");
				out.println("<form action='register.html'>");
				out.println("<button type='submit' class='btn'>Back</button>");
				out.println("</form>");
				out.println("</div></body></html>");
			} else {
				PreparedStatement insert = con.prepareStatement("INSERT INTO students(name, password) VALUES (?, ?)");
				insert.setString(1, name);
				insert.setString(2, password);
				insert.executeUpdate();
				con.close();

				response.sendRedirect("index.html");
			}

		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("error.html");  
		}
	}
}
