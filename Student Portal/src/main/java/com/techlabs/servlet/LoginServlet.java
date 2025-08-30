package com.techlabs.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final String DB_URL = "jdbc:mysql://localhost:3306/smart_portal";
	private static final String DB_USER = "root";
	private static final String DB_PASS = "admin#123";

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("studentName");
		String password = request.getParameter("studentPassword");

		if (name == null || password == null || name.trim().isEmpty() || password.trim().isEmpty()) {
			response.sendRedirect("index.html?error=1");
			return;
		}

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			PreparedStatement ps = con.prepareStatement("SELECT * FROM students WHERE name = ? AND password = ?");
			ps.setString(1, name);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				ServletContext context = getServletContext();
				Object obj = context.getAttribute("loggedInUsers");

				Map<String, HttpSession> loggedInUsers;
				if (obj == null) {
					loggedInUsers = new ConcurrentHashMap<>();
					context.setAttribute("loggedInUsers", loggedInUsers);
				} else {
					loggedInUsers = (Map<String, HttpSession>) obj;
				}

				if (loggedInUsers.containsKey(name)) {
					response.sendRedirect("already_logged_in.html");
					return;
				}

				HttpSession session = request.getSession();
				session.setAttribute("studentName", name);
				loggedInUsers.put(name, session);

				String lastLoginTime = "First time login";
				for (Cookie c : request.getCookies() != null ? request.getCookies() : new Cookie[0]) {
					if (c.getName().equals("loginTime")) {
						lastLoginTime = c.getValue();
						break;
					}
				}
				session.setAttribute("lastLoginTime", lastLoginTime);

				Cookie loginCookie = new Cookie("loginTime", String.valueOf(System.currentTimeMillis()));
				loginCookie.setMaxAge(3600); // 1 hour
				response.addCookie(loginCookie);

				response.sendRedirect("dashboard");
			} else {
				response.sendRedirect("index.html?error=1");
			}

			rs.close();
			ps.close();
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("index.html?error=db");
		}
	}
}