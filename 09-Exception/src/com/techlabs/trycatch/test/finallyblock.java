package com.techlabs.trycatch.test;

import java.util.Scanner;

public class finallyblock {

	public static void main(String[] args) {
		
		int balance = 10000;
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Enter the amount to withdraw: ");
			int amount = scanner.nextInt();
			
			if(amount > balance) {
				throw new ArithmeticException("You have only account balance 10000");
			}
			
			balance = balance - amount;
			System.out.println("Your remaining balance is Rs"+balance);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Excuted!!!!");
		}
	
	}
}
