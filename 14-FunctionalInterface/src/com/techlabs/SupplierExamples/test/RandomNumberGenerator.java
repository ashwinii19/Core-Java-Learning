package com.techlabs.SupplierExamples.test;

import java.util.function.Supplier;

public class RandomNumberGenerator {

	public static void main(String[] args) {
		
		Supplier<Double> randomNumber = () -> Math.random();
		System.out.println(randomNumber.get());
	}
}
