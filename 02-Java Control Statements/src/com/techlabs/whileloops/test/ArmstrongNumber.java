package com.techlabs.whileloops.test;

public class ArmstrongNumber {
	public static void main(String args[]) {

		int number = 152;
		int result = 0;
		int temporary = number;

		while (temporary != 0) {
			int digit = temporary % 10;
			result = result+ (digit * digit * digit);
			temporary /= 10;
		}

		if (number == result) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not Armstrong Number");
		}
	}
}
