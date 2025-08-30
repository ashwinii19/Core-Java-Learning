package com.techlabs.interfaces.model;

public class Razorpay extends Paypal implements IPaymentGateway{

	@Override
	public void processPayment() {
		System.out.println("Pay using Razorpay");
	}
	
	@Override
	public void payment() {
		super.payment();
	}
	
}
