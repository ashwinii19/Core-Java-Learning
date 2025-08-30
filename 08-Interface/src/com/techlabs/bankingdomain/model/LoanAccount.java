package com.techlabs.bankingdomain.model;

public class LoanAccount implements IAccountOperations {
    private double loanAmount = 0;

    public void takeLoan(double amount) {
        if (amount <= 0) {
            System.out.println("Loan amount must be Greater than 0");
            return;
        }
        loanAmount += amount;
        System.out.println("Loan granted.Remaining Loan: " + loanAmount);
    }

    public void deposit(double amount) {
        System.out.println("Deposits not allowed in Loan Account.");
    }

    public void withdraw(double amount) {
        if (loanAmount == 0) {
            System.out.println("No loan to repay.");
            return;
        }
        if (amount <= 0) {
            System.out.println("Repayment must be Greater than 0.");
            return;
        }
        if (amount > loanAmount) {
            System.out.println("Repayment exceeds loan.");
            return;
        }
        loanAmount -= amount;
        System.out.println("Repayment successful. Remaining Loan: " + loanAmount);
    }

    public void checkbalance() {
        System.out.println("Outstanding Loan: " + loanAmount);
    }
}