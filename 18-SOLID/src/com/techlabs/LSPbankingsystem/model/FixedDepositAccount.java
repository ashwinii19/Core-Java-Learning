package com.techlabs.LSPbankingsystem.model;

public class FixedDepositAccount implements IBankDeposit {

	private double amount = 0.0;

	@Override
	public void deposit(double amount) {
		this.amount += amount;
		System.out.println("Deposited into Fixed Deposit: " + amount);
	}

	public double getBalance() {
		return this.amount;
	}

}
