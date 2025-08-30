package com.techlabs.ifelse.test;

import java.util.Scanner;

public class RideBillGenerator {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("\nHello Rider\n");

		System.out.println("Enter your Height(in cm): ");
		int height = scanner.nextInt();

		if (height > 120) {
			System.out.println("Enter your Age: ");
			int age = scanner.nextInt();

			int bill = 0;

			if (age <= 12) {
				bill = 5;
			} else if (age <= 18) {
				bill = 7;
			} else if (age <= 45) {
				bill = 12;
			} else {
				bill = 0;
			}

			scanner.nextLine();
			System.out.println("Do you want Photos(yes, no): ");
			String choice = scanner.nextLine();

			switch (choice) {

			case "yes":
				bill += 3;
				System.out.println("You have to pay for $" + bill);
				break;

			case "no":
				System.out.println("You have to pay for $" + bill);
				break;

			default:
				System.out.println("Invalid input, assuming no photos");
			}

		} else {
			System.out.println("You Can't ride");
		}
		scanner.close();
	}
}
