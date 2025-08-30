package com.techlabs.typesoffunctionalinterface.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> consumer = s -> System.out.println(s.toLowerCase());
		consumer.accept("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		
		Consumer<List<String>> consumer2 = list -> list.forEach(System.out::println);
		consumer2.accept(Arrays.asList("Ashwini"));
	}
}
