package com.techlabs.LSPbankingsystem.test;

import java.util.Scanner;

import com.techlabs.LSPbankingsystem.model.Account;
import com.techlabs.LSPbankingsystem.model.FixedDepositAccount;

public class BankingTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Account account = new Account();
		FixedDepositAccount fda = new FixedDepositAccount();

		boolean exit = false;
		System.out.println("====== Welcome to the Banking System ======");

		while (!exit) {
			 System.out.println("\nSelect an operation:");
	            System.out.println("1. Deposit to Account");
	            System.out.println("2. Withdraw from Account");
	            System.out.println("3. Deposit to Fixed Deposit Account");
	            System.out.println("4. Show Balances");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");

			int operation = scanner.nextInt();

			switch (operation) {
			case 1:

				System.out.print("Enter amount to deposit: ");
				double depositAmount = scanner.nextDouble();
				if(depositAmount > 0) {
                    account.deposit(depositAmount);
                } else {
                    System.out.println("Please enter a positive amount.");
                }
                break;

			case 2:
				System.out.print("Enter amount to withdraw: ");
				double withdrawAmount = scanner.nextDouble();
				if(withdrawAmount > 0) {
                    account.withdraw(withdrawAmount);
                } else {
                    System.out.println("Please enter a positive amount.");
                }
                break;

			case 3:
				System.out.print("Enter amount to deposit in Fixed Deposit Account: ");
				double fdAmount = scanner.nextDouble();
				if(fdAmount > 0) {
                    fda.deposit(fdAmount);
                } else {
                    System.out.println("Please enter a positive amount.");
                }
                break;

			case 4:
				 System.out.println("Regular Account Balance: " + account.getBalance());
                 System.out.println("Fixed Deposit Account Balance: " + fda.getBalance());
                 break;
                 
			case 5:
				System.out.println("Thank you for using the Banking System. Goodbye!");
                exit = true;
                break;

			default:
				System.out.println("Invalid choice. Please enter 1, 2, 3, 4 or 5.");
			}
		}

	}
}
