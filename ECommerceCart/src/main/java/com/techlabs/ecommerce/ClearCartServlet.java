package com.techlabs.ecommerce;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/clear")
class ClearCartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.removeAttribute("cart");
            session.setAttribute("total", 0.0);
        }
        response.sendRedirect("viewcart");
    }
}