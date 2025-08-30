package com.techlabs.ConsumerExamples.test;

import java.util.function.Consumer;

public class StringinUpperCase {

	public static void main(String[] args) {
		
		Consumer<String> consumer = input -> System.out.println(input.toUpperCase());
		consumer.accept("ashwini");
	}

}
