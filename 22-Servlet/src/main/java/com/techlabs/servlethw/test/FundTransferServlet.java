package com.techlabs.servlethw.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/transfer")
public class FundTransferServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String source = request.getParameter("source");
        String destination = request.getParameter("destination");
        String amountStr = request.getParameter("amount");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        double amount = 0;
        boolean valid = true;
        String message = "";

        try {
            amount = Double.parseDouble(amountStr);
        } catch (NumberFormatException e) {
            valid = false;
            message = "Invalid amount format.";
        }

        if (source.equals(destination)) {
            valid = false;
            message = "Source and destination accounts must be different.";
        } else if (amount <= 0 || amount > 50000) {
            valid = false;
            message = "Amount must be between Rs 1 and Rs 50,000.";
        }

        out.println("<html><body>");

        if (valid) {
            out.println("<h2 style='color:green;'>Transaction Successful!</h2>");
            out.println("<p>From: " + source + "</p>");
            out.println("<p>To: " + destination + "</p>");
            out.println("<p>Amount: RS " + amount + "</p>");
        } else {
            out.println("<h2 style='color:red;'>Transaction Failed!</h2>");
            out.println("<p>" + message + "</p>");
        }

        out.println("</body></html>");
    }
}