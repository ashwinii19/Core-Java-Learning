package com.techlabs.cookies;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class GetCookieServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get cookies from request
        Cookie[] cookies = request.getCookies();

        String username = null;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("username")) {
                    username = cookie.getValue();
                    break;
                }
            }
        }

        // Set content type and write response
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        if (username != null) {
            out.println("<h1>Welcome, " + username + "!</h1>");
        } else {
            out.println("<h1>No username cookie found!</h1>");
        }
        out.println("</body></html>");
    }
}

