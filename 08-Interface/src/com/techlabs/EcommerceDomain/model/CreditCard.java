package com.techlabs.EcommerceDomain.model;

public class CreditCard implements IPaymentGateway {
    @Override
    public void pay(double amount) {
            System.out.println("Processing credit card payment of ₹" + amount);
    }

    @Override
    public void refund(double amount) {
            System.out.println("Refunding ₹" + amount + " to credit card.");
    }
}

	
