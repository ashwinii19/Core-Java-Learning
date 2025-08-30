package com.techlabs.Banking.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class AccountManager {

	Map<Integer, Account> accounts = new HashMap<>();
	int nextAccountId;

	final String URL = "jdbc:mysql://localhost:3306/banking_system";
	final String USER = "root";
	final String PASS = "admin#123";

	public AccountManager() {
		loadAccountsFromDatabase();
	}

	private void loadAccountsFromDatabase() {
		try (Connection connection = DriverManager.getConnection(URL, USER, PASS)) {
			String selectQuery = "SELECT * FROM accounts";
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(selectQuery);

			while (rs.next()) {
				int id = rs.getInt("account_id");
				String name = rs.getString("name");
				double balance = rs.getDouble("balance");

				accounts.put(id, new Account(id, name, balance));
				nextAccountId = Math.max(nextAccountId, id + 1);
			}
			System.out.println("Accounts loaded from database.");
		} catch (Exception e) {
			System.out.println("Error loading accounts: " + e.getMessage());
		}

	}

	public void updateBalanceInDatabase(int id, double balance) throws Exception {
		try (Connection connection = DriverManager.getConnection(URL, USER, PASS)) {
			String updateQuery = "UPDATE accounts SET balance = ? WHERE account_id = ?";
			PreparedStatement ps = connection.prepareStatement(updateQuery);

			ps.setDouble(1, balance);
			ps.setInt(2, id);
			ps.executeUpdate();
		}
	}

	public boolean accountExists(int id) {
		return accounts.containsKey(id);
	}

	public void addAccount(String name, double balance) throws Exception {
		if (balance < 0) {
			throw new Exception("Initial balance cannot be negative.");
		}

		try (Connection connection = DriverManager.getConnection(URL, USER, PASS)) {
			String insertQuery = "INSERT into accounts (name, balance) VALUES (?,?)";
			PreparedStatement ps = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);

			ps.setString(1, name);
			ps.setDouble(2, balance);

			int rowsAffected = ps.executeUpdate();

			if (rowsAffected > 0) {
				ResultSet generateKeys = ps.getGeneratedKeys();
				if (generateKeys.next()) {
					int generateId = generateKeys.getInt(1);
					accounts.put(generateId, new Account(generateId, name, balance));
					System.out.println("Account added successfully! ID: " + generateId);
				}
				else {
					System.out.println("No ID returned from database.");
				}
			} else {
				System.out.println("Failed to add account to database.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void depositTo(int id, double amount) throws Exception {
		Account acc = accounts.get(id);
		if (acc == null) {
			throw new Exception("Account not found.");
		}
		if (amount <= 0) {
			throw new Exception("Deposit amount must be positive..");
		}
		acc.deposit(amount);
		updateBalanceInDatabase(id, acc.getBalance());
	}

	public void withdrawFrom(int id, double amount) throws Exception {
		Account acc = accounts.get(id);
		if (acc == null) {
			throw new Exception("Account not found.");
		}
		if (!acc.withdraw(amount)) {
			throw new Exception("Insufficient balance or invalid amount.");
		}
		updateBalanceInDatabase(id, acc.getBalance());
		System.out.println("Withdrawal successful for Account ID: " + id);
	}

	public void transfer(int fromId, int toId, double amount) throws Exception {
		if (fromId == toId) {
			throw new Exception("Cannot transfer to the same account.");
		}

		Account sender = accounts.get(fromId);
		Account receiver = accounts.get(toId);

		if (sender == null || receiver == null) {
			throw new Exception("One or both accounts not found.");
		}
		if (amount <= 0) {
			throw new Exception("Transfer amount must be positive.");
		}
		if (sender.getBalance() < amount) {
			throw new Exception("Insufficient balance for transfer.");
		}

		sender.withdraw(amount);
		receiver.deposit(amount);

		updateBalanceInDatabase(fromId, sender.getBalance());
		updateBalanceInDatabase(toId, receiver.getBalance());
		
		System.out.println("₹" + amount + " transferred from Account ID " + fromId + " to Account ID " + toId);
	}

	public void checkBalance(int id) throws Exception {
		Account acc = accounts.get(id);
		if (acc == null) {
			System.out.println("Account not found.");
			return;
		}
		System.out.println("---- Account Balance Details ----");
		System.out.println("Account ID   : " + id);
		System.out.println("Account Name : " + acc.getName());
		System.out.println("Balance      : ₹" + acc.getBalance());
		System.out.println("---------------------------------");
	}

}
