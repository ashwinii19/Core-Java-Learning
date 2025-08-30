package com.techlabs.ecommerce;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/viewcart")
public class ViewCartServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession(false);
        String username = (session != null) ? (String) session.getAttribute("username") : null;

        if (username == null) {
            response.sendRedirect("index.html");
            return;
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head>");
        out.println("<link rel='stylesheet' href='css/style.css'>");
        out.println("<title>Your Cart</title>");
        out.println("</head><body>");

        out.println("<div class='cart-container'>");
        out.println("<h2>" + username + "'s Cart</h2>");

        double totalAmount = 0.0;
        boolean hasItems = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "admin#123");

            PreparedStatement ps = con.prepareStatement(
                "SELECT p.id, p.name, p.price, c.quantity FROM cart c JOIN products p ON c.product_id = p.id WHERE c.username = ?");
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                hasItems = true;
                int productId = rs.getInt("id");
                String name = rs.getString("name");
                double price = rs.getDouble("price");
                int qty = rs.getInt("quantity");
                double itemTotal = price * qty;
                totalAmount += itemTotal;

                out.println("<div class='cart-item'>");
                out.println("<p>" + name + " - Rs" + price + " × " + qty + " = Rs" + itemTotal + "</p>");

                out.println("<form action='deletecartitem' method='post' class='inline-form'>");
                out.println("<input type='hidden' name='productName' value='" + name + "'>");
                out.println("<input type='submit' value='Delete' class='btn-delete'>");
                out.println("</form>");
                out.println("</div>");
            }

            if (!hasItems) {
                out.println("<p style='text-align:center;'>Your cart is empty.</p>");
            } else {
                out.println("<h3>Total: ₹" + totalAmount + "</h3>");
                out.println("<form action='buy' method='post'>");
                out.println("<input type='submit' value='Buy Products' class='btn-buy'>");
                out.println("</form>");
            }

            con.close();
        } catch (Exception e) {
            out.println("<p style='color:red; text-align:center;'>Error loading cart.</p>");
            e.printStackTrace(out);
        }

        out.println("<div class='cart-links'>");
        out.println("<a href='products' class='btn-nav'>Back to Products</a>");
        out.println("<a href='logout' class='btn-nav'>Logout</a>");
        out.println("</div>");

        out.println("</div></body></html>");
    }
}
