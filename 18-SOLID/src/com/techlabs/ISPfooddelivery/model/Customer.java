package com.techlabs.ISPfooddelivery.model;

public class Customer implements ICustomerOps {

	@Override
	public void trackorder() {
		System.out.println("Tracking your order...");
	}

	@Override
	public void placeOrder() {
		System.out.println("Order Placed Successfully");
	}

	@Override
	public int rateDriver(int rate) {
		System.out.println("Rating submitted: " + rate + "/10");
		return rate;
	}

}
