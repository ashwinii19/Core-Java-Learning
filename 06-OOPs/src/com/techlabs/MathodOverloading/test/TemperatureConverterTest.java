package com.techlabs.MathodOverloading.test;

import com.techlabs.MathodOverloading.model.TemperatureConverter;

public class TemperatureConverterTest {

	public static void main(String[] args) {
		
		TemperatureConverter temperatureconverter = new TemperatureConverter();
		temperatureconverter.convert(6.6);
		temperatureconverter.convert(6.6, "C");
		temperatureconverter.convert(44, "F");
	}

}
