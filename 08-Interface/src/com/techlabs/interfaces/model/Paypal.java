package com.techlabs.interfaces.model;

public class Paypal implements IPaymentGateway  {

	@Override
	public void processPayment() {
		System.out.println("Pay using Paypal");
	}
	
	public void payment() {
		System.out.println("Hello");
	}
}
