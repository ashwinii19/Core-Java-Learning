package com.techlabs.servlet.text;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/WeatherServlet")
public class WeatherServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String cityname = req.getParameter("cityname");

		if (cityname.equalsIgnoreCase("Mumbai")) {
			PrintWriter pw = resp.getWriter();
			pw.write("Temperature - 29 ");
			pw.write("Humidity - 34");
		}
		else if (cityname.equalsIgnoreCase("Pune")) {
			PrintWriter pw = resp.getWriter();
			pw.write("Temperature - 24 ");
			pw.write("Humidity - 30");
		}
		else if (cityname.equalsIgnoreCase("Andheri")) {
			PrintWriter pw = resp.getWriter();
			pw.write("Temperature - 28 ");
			pw.write("Humidity - 43");
		}
		else if (cityname.equalsIgnoreCase("malad")) {
			PrintWriter pw = resp.getWriter();
			pw.write("Temperature - 18 ");
			pw.write("Humidity - 22");
		}
	}
}


