package com.techlabs.MathodOverloading.test;

import com.techlabs.MathodOverloading.model.SafeCalculator;

public class SafeCalculatorTest {

	public static void main(String[] args) {
		
		SafeCalculator safecalculator = new SafeCalculator();
		safecalculator.divide(10, 2);
		safecalculator.divide(2.2, 0.0);
	}
}
