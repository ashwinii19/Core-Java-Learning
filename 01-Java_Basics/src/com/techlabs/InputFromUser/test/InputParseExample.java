package com.techlabs.InputFromUser.test;

public class InputParseExample {
	public static void main(String[] args) {
		
		int number1 = Integer.parseInt(args[0]);
		int number2 = Integer.parseInt(args[1]);
		String name = args[2];
		
		int sum = number1 + number2;
		
		System.out.println("Sum is: "+ sum);
		System.out.println("Hello "+name);
	}
}
