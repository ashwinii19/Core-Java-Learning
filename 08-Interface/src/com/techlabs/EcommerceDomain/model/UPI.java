package com.techlabs.EcommerceDomain.model;

public class UPI implements IPaymentGateway {
    @Override
    public void pay(double amount) {
            System.out.println("Processing UPI payment of ₹" + amount);
    }

    @Override
    public void refund(double amount) {
            System.out.println("Refunding ₹" + amount + " via UPI.");
    }
}
