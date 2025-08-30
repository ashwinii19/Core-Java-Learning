package com.techlabs.SRPcalculator.test;

import java.util.Scanner;

import com.techlabs.SRPcalculator.model.Addition;
import com.techlabs.SRPcalculator.model.Calculator;
import com.techlabs.SRPcalculator.model.Division;
import com.techlabs.SRPcalculator.model.Multiplication;
import com.techlabs.SRPcalculator.model.Subtraction;

public class Calculation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Number 1: ");
		int number1 = scanner.nextInt();

		System.out.print("Enter Number 2: ");
		int number2 = scanner.nextInt();

		Calculator cal = new Calculator(number1, number2);

		System.out.println("------------------------------");
		Addition addition = new Addition();
		addition.add(cal);

		System.out.println("------------------------------");
		Subtraction subtraction = new Subtraction();
		subtraction.sub(cal);

		System.out.println("------------------------------");
		Multiplication multiplication = new Multiplication();
		multiplication.mul(cal);

		System.out.println("------------------------------");
		Division division = new Division();
		division.div(cal);
		
		
		scanner.close();
	}

}
