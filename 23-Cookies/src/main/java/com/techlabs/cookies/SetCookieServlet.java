package com.techlabs.cookies;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SetCookieServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Create a new cookie
        Cookie userCookie = new Cookie("username", "JohnDoe");

        // Set cookie expiry time (in seconds)
        userCookie.setMaxAge(60 * 60 * 24);  // 1 day

        // Add the cookie to the response
        response.addCookie(userCookie);

        // Set content type and write response
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Cookie has been set!</h1>");
        out.println("</body></html>");
    }
}

