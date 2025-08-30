package com.techlabs.FunctionExamples.test;

import java.util.function.Function;

public class TemperatureConverter {

	public static void main(String[] args) {
		
		Function<Double, Double> temperature = c -> (c * 9 / 5) + 32;
		
		//Declares an array
		double[] temps = {0.0, 20.0, 37.0};
		
		for(double celsius : temps) {
			System.out.println(temperature.apply(celsius));
		}
	}
}
