package com.techlabs.bankingdomain.model;

public class SavingsAccount implements IAccountOperations{

	private double balance = 0;
    private static final double minimum_Balance = 500;
    private static final double max__Withdraw = 5000;
    
    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit must be Greater than 0");
            return;
        }
        balance += amount;
        System.out.println("Deposit successful. Balance: " + balance);
    }
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal must be Greater than 0");
            return;
        }
        if (amount > max__Withdraw) {
            System.out.println("Max withdrawal is " + max__Withdraw + ".");
            return;
        }
        if (balance - amount < minimum_Balance) {
            System.out.println("Maintain minimum balance of " + minimum_Balance + ".");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Balance: " + balance);
    }


	@Override
	public void checkbalance() {
		System.out.println("Available Balance: " + balance);
		
	}

	
}
