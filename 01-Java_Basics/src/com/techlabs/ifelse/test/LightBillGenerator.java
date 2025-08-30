package com.techlabs.ifelse.test;

import java.util.Scanner;

public class LightBillGenerator {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int meterCharge = 75;
		int totalWaterbill = 0;
		int charge = 0;

		System.out.println("Enter No. of Units Consumed: ");
		int unitsConsumed = scanner.nextInt();

		if (unitsConsumed <= 100) {
			charge = unitsConsumed * 5;
		} else if (unitsConsumed <= 250) {
			charge = unitsConsumed * 10;
		} else {
			charge = unitsConsumed * 20;
		}

		totalWaterbill = charge + meterCharge;
		System.out.println("Your Total Water Bill is: " + totalWaterbill);

		scanner.close();
	}
}
