package com.techlabs.ecommerce;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/buy")
public class BuyProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession(false);
        String username = (session != null) ? (String) session.getAttribute("username") : null;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (username == null) {
            response.sendRedirect("index.html");
            return;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ecommerce", "root", "admin#123");


            PreparedStatement ps = con.prepareStatement("DELETE FROM cart WHERE username = ?");
            ps.setString(1, username);
            int rows = ps.executeUpdate();

            con.close();

            out.println("<html><head><link rel='stylesheet' href='css/style.css'></head><body>");
            out.println("<div class='cart-container'>");
            out.println("<h2>Thank You!</h2>");
            if (rows > 0) {
                out.println("<p>Your purchase was successful. Your cart has been cleared.</p>");
            } else {
                out.println("<p>Your cart was already empty.</p>");
            }
            out.println("<div class='cart-links'>");
            out.println("<a href='products' class='btn-nav'>Shop More</a>");
            out.println("<a href='logout' class='btn-nav'>Logout</a>");
            out.println("</div>");
            out.println("</div></body></html>");
        } catch (Exception e) {
            e.printStackTrace(out);
            out.println("<p style='color:red;'>Purchase failed due to server error.</p>");
        }
    }
}
