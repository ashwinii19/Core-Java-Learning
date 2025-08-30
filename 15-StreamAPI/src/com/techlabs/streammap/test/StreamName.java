package com.techlabs.streammap.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamName {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Ashwini", "Jayesh", "Durgesh", "Akash");
		
		list.stream().map(name -> "Mr/Ms. "+name).collect(Collectors.toList()).forEach(System.out::println);
	}
}
