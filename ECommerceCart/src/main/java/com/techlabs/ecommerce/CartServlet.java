package com.techlabs.ecommerce;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/cart")
public class CartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession(false);
        String username = (String) session.getAttribute("username");
        String[] productIds = request.getParameterValues("product");

        if (productIds != null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "admin#123");
                for (String pid : productIds) {
                    PreparedStatement ps = con.prepareStatement("INSERT INTO cart (username, product_id) VALUES (?, ?)");
                    ps.setString(1, username);
                    ps.setInt(2, Integer.parseInt(pid));
                    ps.executeUpdate();
                }
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        response.sendRedirect("viewcart");
    }
}
