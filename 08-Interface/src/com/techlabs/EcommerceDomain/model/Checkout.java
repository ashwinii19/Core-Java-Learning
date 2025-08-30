package com.techlabs.EcommerceDomain.model;

public class Checkout {
    IPaymentGateway paymentGateway;
    double balance;

    public Checkout(IPaymentGateway paymentGateway, double initialBalance) {
        this.paymentGateway = paymentGateway;
        this.balance = initialBalance;
    }

    public void completePayment(double amount) {
        System.out.println("Processing payment of ₹" + amount);
        balance -= amount;
        System.out.println("Payment successful. New balance: ₹" + balance);
    }

    public void processRefund(double amount) {
        System.out.println("Processing refund of ₹" + amount);
        balance += amount;
        System.out.println("Refund successful. New balance: ₹" + balance);
    }

    public double getBalance() {
        return balance;
    }
}