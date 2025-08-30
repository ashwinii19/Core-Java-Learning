package com.techlabs.ecommerce;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/admin")
public class AdminServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String action = req.getParameter("action");

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "admin#123");

            if (action.equals("Add Product")) {
                String name = req.getParameter("name");
                double price = Double.parseDouble(req.getParameter("price"));
                int qty = Integer.parseInt(req.getParameter("quantity"));

                PreparedStatement ps = con.prepareStatement("INSERT INTO products(name, price, quantity) VALUES (?, ?, ?)");
                ps.setString(1, name);
                ps.setDouble(2, price);
                ps.setInt(3, qty);
                ps.executeUpdate();
            } else if (action.equals("Delete Product")) {
                int id = Integer.parseInt(req.getParameter("id"));
                PreparedStatement ps = con.prepareStatement("DELETE FROM products WHERE id=?");
                ps.setInt(1, id);
                ps.executeUpdate();
            }

            con.close();
        } catch (Exception e) {
            res.getWriter().println("Error: " + e.getMessage());
        }

        res.sendRedirect("admin.html");
    }
}
