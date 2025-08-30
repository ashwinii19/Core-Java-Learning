package com.techlabs.MathodOverloading.model;

public class Printer {
 
	String message;
	int number;
	
	public void print() {
		System.out.println("Default Message");
	}
	
	public void  print(String messsage) {
		System.out.println(messsage);
	}
	
	public void print(int number) {
		System.out.println(number);
	}
}
