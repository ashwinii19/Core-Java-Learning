package com.techlabs.ConsumerExamples.test;

public class Invoice {

	String itemName;
	int quantity;
	double price;
	
	Invoice(String itemName, int quantity, double price) {
		super();
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}
	
}
