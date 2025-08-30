package com.techlabs.model;

public class Calculator {

	public int addition(int number1, int number2) {
		return number1 + number2;
	}
	
	public int subtraction(int number1, int number2) {
		return number1 - number2;
	}
	
	public int division(int number1, int number2) {
		if(number2 == 0) {
			throw new ArithmeticException();
		}
		return number1/number2;
	}
	
	public boolean isPrime(int number) {
		if(number <= 1) {
			return false;
		}
		for(int i=2; i<=Math.sqrt(number); i++) {
			if(number%i==0) {
				return false;
			}
		}
		return true;
	}
}
