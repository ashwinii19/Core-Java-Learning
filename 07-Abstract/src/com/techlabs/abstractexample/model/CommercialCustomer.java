package com.techlabs.abstractexample.model;

public abstract class CommercialCustomer extends Customer {

	public CommercialCustomer(String name, int unitsConsumed) {
		super(name, unitsConsumed);
	}
	
	@Override
	public double calculateBill() {
		return 8*unitsConsumed;
	}
}
