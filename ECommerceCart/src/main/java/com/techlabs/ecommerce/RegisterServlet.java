package com.techlabs.ecommerce;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "admin#123");

            PreparedStatement ps = con.prepareStatement("INSERT INTO users (username, password, role) VALUES (?, ?, 'user')");
            ps.setString(1, username);
            ps.setString(2, password);
            ps.executeUpdate();

            response.sendRedirect("register-success.html");

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("register.html?message=Registration+Failed");
        }
    }
}
