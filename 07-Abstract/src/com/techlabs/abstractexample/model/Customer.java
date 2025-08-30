package com.techlabs.abstractexample.model;

public abstract class Customer {

	String name;
	int unitsConsumed;
	
	public Customer(String name, int unitsConsumed) {
		this.name = name;
		this.unitsConsumed = unitsConsumed;
	}
	
	public abstract double calculateBill();
	
}
