package com.techlabs.streammap.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamSquare {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(2, 3, 4, 5);
		
		List<Integer> square = list.stream().map(i -> i*i).collect(Collectors.toList());
		System.out.println(square);
	}
}
