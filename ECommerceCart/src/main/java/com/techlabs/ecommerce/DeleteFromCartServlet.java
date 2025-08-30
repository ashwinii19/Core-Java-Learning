package com.techlabs.ecommerce;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/deletecartitem")
public class DeleteFromCartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession(false);
        String username = (String) session.getAttribute("username");
        String productName = request.getParameter("productName");

        if (username == null || productName == null) {
            response.sendRedirect("index.html");
            return;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "admin#123");

            PreparedStatement getProductId = con.prepareStatement("SELECT id FROM products WHERE name = ?");
            getProductId.setString(1, productName);
            ResultSet rs = getProductId.executeQuery();

            if (rs.next()) {
                int productId = rs.getInt("id");

                PreparedStatement deleteStmt = con.prepareStatement("DELETE FROM cart WHERE username = ? AND product_id = ?");
                deleteStmt.setString(1, username);
                deleteStmt.setInt(2, productId);
                deleteStmt.executeUpdate();
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        response.sendRedirect("viewcart");
    }
}
