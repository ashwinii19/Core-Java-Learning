package com.techlabs.MathodOverloading.model;

public class AdditionOfNumbers {

	int number1, number2, number3;
	double number4, number5;

	public void add(int number1, int number2) {
		System.out.println("Addition Of Number1+Number2: " + (number1 + number2));
	}
	
	public void add(double number4, double number5) {
		System.out.println("Addition Of Number4+Number5: "+(number4+number5));
	}

	public void add(int number1, int number2, int number3) {
		System.out.println("Addition Of Number1+Number2+Number3: " + (number1 + number2 +number3));
	}
}

