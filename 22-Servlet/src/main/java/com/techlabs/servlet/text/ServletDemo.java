package com.techlabs.servlet.text;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/FeedbackServlet")
public class ServletDemo extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("username");
		String feedback = req.getParameter("feedback");
		PrintWriter pw = resp.getWriter();

		HttpSession session = req.getSession();
		session.setAttribute("username", name);
		session.setAttribute("feedback", feedback);

		resp.sendRedirect("thankyou.html");
	}

}
