package com.techlabs.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class JDBCDemo {

	public static void main(String[] args) throws Exception {
		
		//register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//create connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "admin#123");
		System.out.println("Connection established successfully");
		
//		//insert data into table
//		String insertQuery = "insert into employee(id, name, age, salary) values(?,?,?,?)";
//		PreparedStatement ps = conn.prepareStatement(insertQuery);
//		
////		ps.setInt(1, 101);
////		ps.setString(2, "Jaya");
////		ps.setInt(3, 22);
////		ps.setDouble(4, 34000);
//		
////		ps.execute();
//		
////		int numberOfRowAffected = ps.executeUpdate();
//		ps.setInt(1,104);
//		ps.setString(2, "Aksha");
//		ps.setInt(3, 22);
//		ps.setDouble(4, 34000);
//		
//		int numberOfRowAffected = ps.executeUpdate();
////		numberOfRowAffected += ps.executeUpdate();
//		System.out.println(numberOfRowAffected+ " Rows inserted successfully");
		
		
//		//Read data into table
//		String selectQuery = "Select * From employee";
//	    Statement st = conn.createStatement();
//		
//		ResultSet rs =st.executeQuery(selectQuery);
//		
//		while(rs.next()) {
//			System.out.println(rs.getInt("id") + " - " + rs.getString("name") + " - "+ rs.getInt("age") + " - "+ rs.getDouble("salary"));
//		}
		
		
//		//Update data into table
//		String updateQuery = "update employee set age = ? where salary = ?";
//		PreparedStatement ps = conn.prepareStatement(updateQuery);
//		

//		ps.setInt(2, 34000);
//		
//		ps.execute();
//		System.out.println("Updated successfully");
//		
		
//		//delete data into table 
//		String deleteQuery = "delete from employee where id = ?";
//		PreparedStatement ps = conn.prepareStatement(deleteQuery);
//		
//		ps.setInt(1, 104);
//		ps.execute();
//		System.out.println("Deleted Successfully");
		
	}
}
