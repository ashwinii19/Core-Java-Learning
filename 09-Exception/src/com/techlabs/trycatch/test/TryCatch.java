package com.techlabs.trycatch.test;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter the number 1: ");
			int number1 = scanner.nextInt();
			
			System.out.println("Enter the number 2: ");
			int number2 = scanner.nextInt();
			
			int divide = number1/number2;
			System.out.println("Divison of Number1 and Number2: "+divide);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Program successfully excuted");
		}
	}
}
