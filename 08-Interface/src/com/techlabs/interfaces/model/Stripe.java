package com.techlabs.interfaces.model;

public class Stripe extends Razorpay implements IPaymentGateway{

	@Override
	public void processPayment() {
		System.out.println("Pay using Stripe");
	}
	
	@Override
	public void payment() {
		super.payment();
	}
}
