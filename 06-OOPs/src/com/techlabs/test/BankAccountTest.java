package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.BankAccount;

public class BankAccountTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter the Account Number ");
		int accountNumber = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Enter the Account Holder ");
		String accountHolder = scanner.nextLine();
		
		System.out.println("Enter the Balance ");
		double balance = scanner.nextDouble();
		
		
//		BankAccount bankAccount = new BankAccount(accountNumber, accountHolder, balance);
		
		BankAccount account1 = new BankAccount();
		account1.setBalance(balance);
		account1.setAccountHolder(accountHolder);
		account1.checkBalance();
		
		
		scanner.close();
	}
}
