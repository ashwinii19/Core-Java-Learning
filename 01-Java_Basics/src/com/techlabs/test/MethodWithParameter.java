package com.techlabs.test;

import java.util.Scanner;

public class MethodWithParameter {

	public static int simpleineterest(int principle, int rate, int years) {
		return (principle * rate * years) / 100;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter principle: ");
		int principle = scanner.nextInt();
		System.out.println("Enter rate: ");
		int rate = scanner.nextInt();
		System.out.println("Enter years: ");
		int years = scanner.nextInt();

		int total = simpleineterest(principle, rate, years);

		System.out.println("Simple Interest: " + total);
		scanner.close();

	}
}
