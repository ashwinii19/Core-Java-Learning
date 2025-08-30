package com.techlabs.streammap.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUpperCase {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Ashwini", "Durgesh", "Jayesh");
		
		names.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);
	}
}
