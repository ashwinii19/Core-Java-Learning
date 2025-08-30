package com.techlabs.test;

public class ConditionalStatementExample {
	public static void main(String args[]) {
		
		int number1 = 1;
		int number2 = 12;
		int number3 = 14;
		
		if(number1 > number2 && number1 > number3) {
			System.out.println("Number 1 is greater");
		}
		else if(number2 > number1 && number2 > number3) {
			System.out.println("Number 2 is greater");
		}
		else {
			System.out.println("Number 3 is greater");
		}
	}
}
