package com.techlabs.MathodOverloading.model;

import java.nio.file.spi.FileSystemProvider;

public class TemperatureConverter {

	double celsius;
	double value;
	String scale;
	double fahrenheit;
	
	public void convert(double celsius) {
		fahrenheit=(celsius*9/5)+32;
		System.out.println("celsius: "+celsius + " to " + "Fahrenheit: "+fahrenheit);
	}
	
	public void convert(double value, String scale) {
		if(scale == "c" || scale == "C") {
			fahrenheit=(value*9/5)+32;
			System.out.println("celsius: "+ value + " to Fahrenheit: "+fahrenheit);
		}
		else if(scale == "f" || scale =="F") {
			value = (fahrenheit-32)*5/9;
			System.out.println("Fahrenheit: "+fahrenheit + " to celsius: "+ value);
		}
		
	}
}
