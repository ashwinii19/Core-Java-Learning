package com.techlabs.ecommerce;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession(false);
        if (session != null) {
            String username = (String) session.getAttribute("username");
            session.invalidate();
            if (username != null) {
                ProductServlet.activeUsers.remove(username); 
            }
        }
        response.sendRedirect("index.html");
    }
}
