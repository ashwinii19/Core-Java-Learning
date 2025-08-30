package com.techlabs.servlet.text;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/aaa")
public class CurrencyConverter extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String amount = req.getParameter("Amount");
		Integer amonutInt = Integer.parseInt(amount);
		String from = req.getParameter("From");
		String to = req.getParameter("To");
		
		if(from.equalsIgnoreCase("rupees")) {
			if(to.equalsIgnoreCase("usd")) {
				PrintWriter pw = resp.getWriter();
				pw.write("Amount in Usd: "+amonutInt/86.78);
			}
		}
		if(from.equalsIgnoreCase("usd")) {
			if(to.equalsIgnoreCase("rupees")) {
				PrintWriter pw = resp.getWriter();
				pw.write("Amount in rupees: "+amonutInt*86.78);
			}
		}
		
	}
}
