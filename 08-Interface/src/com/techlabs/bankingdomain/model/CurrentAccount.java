package com.techlabs.bankingdomain.model;

public class CurrentAccount implements IAccountOperations {
    private double balance = 0;

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit must be Greater than 0");
            return;
        }
        balance += amount;
        System.out.println("Deposit successful. Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal must be Greater than 0");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Balance: " + balance);
    }

    public void checkbalance() {
        System.out.println("Available Balance: " + balance);
    }
}