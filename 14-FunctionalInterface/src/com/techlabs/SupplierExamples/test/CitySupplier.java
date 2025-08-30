package com.techlabs.SupplierExamples.test;

import java.util.function.Supplier;

public class CitySupplier {

	public static void main(String[] args) {
		
		Supplier<String> citySupplier = () -> "Pune";
		System.out.println(citySupplier.get());
	}
}
