package com.techlabs.typesoffunctionalinterface.test;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		
		Supplier<Double> random = () -> Math.random();
		System.out.println(random.get());
		
		Supplier<LocalDateTime> currenttime = () -> LocalDateTime.now();
		System.out.println(currenttime.get());
		
		Supplier<List<String>> supplier = () -> Arrays.asList("User","Admin","Manager");
		System.out.println(supplier.get());
		
	}
}
