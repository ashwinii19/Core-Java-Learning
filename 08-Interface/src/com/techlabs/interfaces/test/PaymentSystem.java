package com.techlabs.interfaces.test;

import com.techlabs.interfaces.model.Paypal;
import com.techlabs.interfaces.model.Razorpay;

public class PaymentSystem {

	public static void main(String[] args) {
		Paypal stripe = new Razorpay();
		stripe.payment();
		stripe.processPayment();
	}
}
