package com.techlabs.EcommerceDomain.model;

public class NetBanking implements IPaymentGateway {
    @Override
    public void pay(double amount) {
            System.out.println("Processing NetBanking payment of ₹" + amount);
    }

    @Override
    public void refund(double amount) {
            System.out.println("Refunding ₹" + amount + " via NetBanking.");
    }
}


