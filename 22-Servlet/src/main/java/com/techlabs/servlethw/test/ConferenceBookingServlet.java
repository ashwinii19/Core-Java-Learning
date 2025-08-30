package com.techlabs.servlethw.test;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/bookConference")
public class ConferenceBookingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String seatsStr = request.getParameter("seats");
        String date = request.getParameter("date");
        String session = request.getParameter("session");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        boolean isValid = true;
        String message = "";
        int seats = 0;

        try {
            seats = Integer.parseInt(seatsStr);
            if (seats < 1 || seats > 5) {
                isValid = false;
                message = "You can only book 1 to 5 seats.";
            }
        } catch (NumberFormatException e) {
            isValid = false;
            message = "Invalid number of seats.";
        }

        out.println("<html><body>");

        if (isValid) {
            out.println("<h2 style='color:green;'>Booking Confirmed!</h2>");
            out.println("<p><strong>Name:</strong> " + name + "</p>");
            out.println("<p><strong>Email:</strong> " + email + "</p>");
            out.println("<p><strong>Seats:</strong> " + seats + "</p>");
            out.println("<p><strong>Date:</strong> " + date + "</p>");
            out.println("<p><strong>Session:</strong> " + session + "</p>");
            out.println("<hr><h3>Your ticket has been generated. Please check your email for details.</h3>");
        } else {
            out.println("<h2 style='color:red;'>Booking Failed</h2>");
            out.println("<p>" + message + "</p>");
        }

        out.println("</body></html>");
    }
}
