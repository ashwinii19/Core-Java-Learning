package com.techlabs.FunctionExamples.test;

import java.util.function.Function;

public class StringLengthCalculator {

	public static void main(String[] args) {
		
		Function<String, Integer> stringLength = input -> input.length();
		
		//Declares an array
		String[] names = {"Ashwini", "Durgesh", "Jayesh"};
		
		for(String name : names) {
			System.out.println("Length of "+name+": "+stringLength.apply(name));
		}
	}
}
