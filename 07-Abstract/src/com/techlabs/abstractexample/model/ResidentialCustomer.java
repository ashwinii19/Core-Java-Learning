package com.techlabs.abstractexample.model;

public abstract class ResidentialCustomer extends Customer {

	public ResidentialCustomer(String name, int unitsConsumed) {
		super(name, unitsConsumed);
	}
	
	@Override
	public double calculateBill() {
		return 5*unitsConsumed;
	}
}
