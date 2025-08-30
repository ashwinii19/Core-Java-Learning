package com.techlabs.DIPecommerce.model;

public class SMSSender implements INotifier{

	@Override
	public void send(String message) {
		System.out.println("SMS sent: " + message);
	}

}
