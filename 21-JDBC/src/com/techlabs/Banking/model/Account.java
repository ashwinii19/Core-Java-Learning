package com.techlabs.Banking.model;

public class Account {

	private int id;
	private String name;
	private double balance;
	
	public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) throws Exception{
		if(amount <= 0) {
			throw new Exception("Deposit amount must be greater than 0.");
		}
			balance += amount;
			System.out.println("Deposited successfully!");
	}
	
	public boolean withdraw(double amount) {
		if(amount <= 0 || amount > balance) {
			return false;
		}
		balance -= amount;
		return true;
	}
	
	
}






















//
//if (!isNameValid(name)) {
//	throw new IllegalArgumentException("Invalid name. Only alphabets and spaces allowed.");
//}
//if (!isEmailValid(email)) {
//	throw new IllegalArgumentException("Invalid email format.");
//}
//if (!isPhoneValid(phone)) {
//	throw new IllegalArgumentException("Invalid phone number. Must start with 6-9 and be 10 digits.");
//}
//if (!isPasswordValid(password)) {
//	throw new IllegalArgumentException("Password must be at least 8 characters with one letter and one number.");
//}

