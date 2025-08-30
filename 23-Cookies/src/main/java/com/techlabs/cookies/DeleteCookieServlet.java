package com.techlabs.cookies;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class DeleteCookieServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get cookies from request
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("username")) {
                    // Set the expiry date to 0 to delete the cookie
                    cookie.setMaxAge(0);
                    response.addCookie(cookie);
                    break;
                }
            }
        }

        // Set content type and write response
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Cookie has been deleted!</h1>");
        out.println("</body></html>");
    }
}

