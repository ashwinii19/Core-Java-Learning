package com.techlabs.streamcount.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductPrice {

public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(100, 2000, 300, 400, 5000);
		System.out.println(list);
		
		long price =list.stream().map(i -> i-i*0.5).filter(j -> j>=500).count();
		System.out.println(price);
	}
}
