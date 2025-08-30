package com.techlabs.SupplierExamples.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class ProductListGenerator {

	public static void main(String[] args) {
		
		Supplier<List<String>> productList = () -> Arrays.asList("laptop", "SmartPhones", "Headphones", "Keyboard", "Monitor", "Mouse");
		List<String> products = productList.get();
		
		for(String product : products) {
			System.out.println(product);
		}
	}
}
