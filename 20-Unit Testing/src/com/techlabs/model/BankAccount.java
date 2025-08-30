package com.techlabs.model;

public class BankAccount {

	private double balance;

	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}

	public void deposit(double amount) {
		System.out.println("Amount to Deposited: " + amount);
		if (amount <= 0) {
			throw new IllegalArgumentException();
		} else {
			balance += amount;
		}
	}

	public void withdraw(double amount) {
		System.out.println("Amount to Withdraw: " + amount);
		if (amount > balance) {
			throw new IllegalArgumentException();
		} else {
			balance -= amount;
		}
	}

	public void getBalance() {
		System.out.println("Balance: " + balance);
	}
}
