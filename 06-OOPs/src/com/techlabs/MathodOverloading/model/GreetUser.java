package com.techlabs.MathodOverloading.model;

public class GreetUser {

	String name;
	
	public void greet() {
		System.out.println("Hello");
	}
	
	public void greet(String name) {
		System.out.println("Hello "+name);
	}
}
