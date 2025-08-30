package com.techlabs.LSPbankingsystem.model;

public class Account implements IBankDeposit, IBankWithdraw{

	 private double amount = 0.0;

	    @Override
	    public void withdraw(double amount) {
	        if (this.amount >= amount) {
	            this.amount -= amount;
	            System.out.println("Withdrawn from Account: " + amount);
	        } else {
	            System.out.println("Insufficient funds to withdraw " + amount);
	        }
	    }

	    @Override
	    public void deposit(double amount) {
	        this.amount += amount;
	        System.out.println("Deposited into Account: " + amount);
	    }

	    public double getBalance() {
	        return this.amount;
	    }

}
