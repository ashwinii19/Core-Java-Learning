package com.techlabs.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AmountTransferValidation {

	public static void main(String[] args) {

		String url = "jdbc:mysql://localhost:3306/jdbc_demo";
		String user = "root";
		String password = "admin#123";
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			
			// Start transaction
			conn.setAutoCommit(false);
			
			int senderId = 1;
			int receiverId = 1;
			double transferAmount = 2000;
			
			PreparedStatement checkBalanceStmt = conn.prepareStatement("SELECT balance FROM accounts WHERE id = ?");
			checkBalanceStmt.setInt(1, senderId);
			ResultSet rs = checkBalanceStmt.executeQuery();
			
			if(rs.next()) {
			 double currentBalance = rs.getDouble("balance");
			 if(currentBalance >= transferAmount) {
				 PreparedStatement withdrawStmt = conn.prepareStatement("UPDATE accounts SET balance = balance - ? WHERE id = ?");
	             withdrawStmt.setDouble(1, transferAmount);
	             withdrawStmt.setInt(2, senderId);
	             withdrawStmt.executeUpdate();
	             
	             PreparedStatement depositStmt = conn.prepareStatement("UPDATE accounts SET balance = balance + ? WHERE id = ?");
	             depositStmt.setDouble(1, transferAmount);
	             depositStmt.setInt(2, receiverId);
	             depositStmt.executeUpdate();

	             conn.commit();
                 System.out.println("✅ Transaction successful! ₹" + transferAmount + " transferred.");
			  }
			 else {
                 System.out.println("❌ Insufficient Balance! You have ₹" + currentBalance + ", can't transfer ₹" + transferAmount);
                 conn.rollback();
             }
			}
			else {
                System.out.println("❌ Sender account not found!");
                conn.rollback();
            }
			
		} catch (Exception e) {
            System.out.println("⚠️ Error: " + e.getMessage());
            try {
                if (conn != null) {
                    conn.rollback();
                    System.out.println("⛔️ Transaction rolled back.");
                }
            } catch (SQLException rollbackEx) {
                rollbackEx.printStackTrace();
            }
        } finally {
            try {
                if (conn != null && !conn.isClosed())
                    conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
