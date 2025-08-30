package com.techlabs.MathodOverloading.test;

import com.techlabs.MathodOverloading.model.VolumeCalculator;

public class VolumeCalculatorTest {

	public static void main(String[] args) {
		
		VolumeCalculator volumecalculator = new VolumeCalculator();
		
		volumecalculator.volume(9);
		volumecalculator.volume(1, 2, 3);
		volumecalculator.volume(6);
	}
}
