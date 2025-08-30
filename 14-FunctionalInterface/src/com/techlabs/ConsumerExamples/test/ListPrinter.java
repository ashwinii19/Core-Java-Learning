package com.techlabs.ConsumerExamples.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ListPrinter {

	public static void main(String[] args) {
		
		//consumer that prints each element using a loop
		Consumer<List<String>> listPrinter = list -> {
			for(String item : list) {
				System.out.println(item);
			}
		};
		
		List<String> items = Arrays.asList("Apply", "Banana", "Mango", "Pear");
		listPrinter.accept(items);
	}
}
