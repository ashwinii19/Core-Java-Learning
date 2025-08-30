package com.techlabs.ecommerce;

import java.io.*;
import java.sql.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/products")
public class ProductServlet extends HttpServlet {

    public static final Map<String, HttpSession> activeUsers = new ConcurrentHashMap<>();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(false);
        String username = (session != null) ? (String) session.getAttribute("username") : null;

        if (username == null) {
            response.sendRedirect("index.html");
            return;
        }

//        session.setMaxInactiveInterval(30);
        
        HttpSession existingSession = activeUsers.get(username);
        if (existingSession != null && existingSession != session) {
            session.invalidate();
            out.println("<html><body>");
            out.println("<p style='color:red;'>User already logged in from another device/browser.</p>");
            out.println("<a href='index.html'>Login Again</a>");
            out.println("</body></html>");
            return;
        }

        activeUsers.put(username, session);

        out.println("<!DOCTYPE html>");
        out.println("<html><head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>Product List</title>");
        out.println("<link rel='stylesheet' href='css/style.css'>");
        out.println("</head><body>");

        out.println("<form class='product-form' action='cart' method='post'>");
        out.println("<h2>Welcome, " + username + "</h2>");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ecommerce", "root", "admin#123");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM products WHERE quantity > 0");

            boolean hasProducts = false;
            while (rs.next()) {
                hasProducts = true;
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double price = rs.getDouble("price");
                int qty = rs.getInt("quantity");

                out.println("<label>");
                out.println("<input type='checkbox' name='product' value='" + id + "'/> " +
                        name + " - RS" + price + " (Stock: " + qty + ")");
                out.println("</label>");
            }

            if (!hasProducts) {
                out.println("<p>No products available right now.</p>");
            }

            con.close();
        } catch (Exception e) {
            out.println("<p style='color:red;'>Error loading products.</p>");
            e.printStackTrace(out);
        }

        out.println("<input type='submit' value='Add to Cart' class='small-btn'/>");

        out.println("<div class='nav-buttons-inline'>");
        out.println("<a href='viewcart' class='small-btn'>View Cart</a>");
        out.println("<a href='logout' class='small-btn'>Logout</a>");
        out.println("</div>");

        out.println("</form>");
        out.println("</body></html>");
    }
}

