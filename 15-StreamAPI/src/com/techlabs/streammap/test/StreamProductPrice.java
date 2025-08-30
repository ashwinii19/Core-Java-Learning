package com.techlabs.streammap.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamProductPrice {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
		
		List<Double> price =list.stream().map(i -> i-i*0.1).collect(Collectors.toList());
		System.out.println(price);
	}
}
