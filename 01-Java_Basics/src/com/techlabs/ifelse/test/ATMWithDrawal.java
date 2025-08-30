package com.techlabs.ifelse.test;

import java.util.Scanner;

public class ATMWithDrawal {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter withdrawal amount within 50000 and input should be multiple of 100: ");
		int amount = scanner.nextInt();

		int twothousand = 0, fivehundred = 0, twohundred = 0, onehundred = 0;
		if (amount <= 50000) {
			if (amount % 100 != 0) {
				System.out.println("Amount should be multiple of 100");
			} else {
				System.out.println("\nEntered Amount: " + amount);
				while (amount > 0) {
					if (amount >= 2000) {
						twothousand = amount / 2000;              // how much notes to give
						amount = amount % 2000;                   // how much remaining amount
						System.out.println("Two Thousand= " + twothousand);
					} else if (amount >= 500) {
						fivehundred = amount / 500;
						amount = amount % 500;
						System.out.println("Five Hundred= " + fivehundred);
					} else if (amount >= 200) {
						twohundred = amount / 200;
						amount = amount % 200;
						System.out.println("Two Hundred= " + twohundred);
					} else if (amount >= 100) {
						onehundred = amount / 100;
						amount = amount % 100;
						System.out.println("One Hundred= " + onehundred);
					}
				}
			}
		} 
		else {
			System.out.println("Amount exceeds withdrawal limit of 50000");
		}

		scanner.close();
	}
}
