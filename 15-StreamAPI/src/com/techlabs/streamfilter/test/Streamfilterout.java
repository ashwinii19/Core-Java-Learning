package com.techlabs.streamfilter.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streamfilterout {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Ashwini", " ", "Jayesh", "Durgesh", "Akash");
		System.out.println(list);
		
		List<String> names = list.stream().filter(name -> name != null && !name.trim().isEmpty()).collect(Collectors.toList());
		System.out.println(names);
	}
}
