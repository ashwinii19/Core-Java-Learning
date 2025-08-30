package com.techlabs.ecommerce;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "admin#123");
            PreparedStatement ps = con.prepareStatement("SELECT role FROM users WHERE username = ? AND password = ?");
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String role = rs.getString("role");
                HttpSession session = request.getSession();
                session.setAttribute("username", username);
                if ("admin".equalsIgnoreCase(role)) {
                    response.sendRedirect("admin.html");
                } else {
                    response.sendRedirect("products");
                }
            } else {
                response.sendRedirect("index.html?error=1");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
