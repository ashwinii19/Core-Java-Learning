package com.techlabs.MathodOverloading.test;

import com.techlabs.MathodOverloading.model.AreaCalculator;

public class AreaCalculatorTest {

	public static void main(String[] args) {
		
		AreaCalculator areacalculator = new AreaCalculator();
		areacalculator.area(10);
		areacalculator.area(12, 13);
		areacalculator.area(8.8);
		
		
	}
}
