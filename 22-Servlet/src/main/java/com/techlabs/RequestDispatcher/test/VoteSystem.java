package com.techlabs.RequestDispatcher.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/voteEligible")
public class VoteSystem extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String age = req.getParameter("vote");

		Integer ageInt = Integer.parseInt(age);

		if (ageInt < 18) {
			PrintWriter pw = resp.getWriter();
			pw.println("<p style='color:red;'>You Are Not Eligible To Vote!</p>");
			RequestDispatcher rd = req.getRequestDispatcher("VoteSystem.html");
			rd.include(req, resp);
		}
		else if (ageInt >= 18 && ageInt <= 60) {
			RequestDispatcher rd = req.getRequestDispatcher("welcomee");
			rd.forward(req, resp);
		}
		else {
			RequestDispatcher rd = req.getRequestDispatcher("old");
			rd.forward(req, resp);
		}
	}
}