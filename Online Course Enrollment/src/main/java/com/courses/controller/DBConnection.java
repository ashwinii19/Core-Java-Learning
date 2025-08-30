package com.courses.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/online_course";
    private static final String USER = "root";
    private static final String PASS = "admin#123";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USER, PASS);
        }catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
        return connection;
    }
}
