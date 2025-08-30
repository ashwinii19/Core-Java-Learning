package com.techlabs.ifelse.test;

public class PositiveNegativeCheck {
	public static void main(String args[]) {
		
		int number = -4;
		
		if(number > 0) {
			System.out.println("Number is positive");
		}
		else if(number < 0) {
			System.out.println("Number is negative");
		}
		else {
			System.out.println("zero");
		}
	}
}
