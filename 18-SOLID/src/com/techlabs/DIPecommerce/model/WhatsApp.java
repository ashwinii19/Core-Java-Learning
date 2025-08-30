package com.techlabs.DIPecommerce.model;

public class WhatsApp implements INotifier{

	@Override
	public void send(String message) {
		System.out.println("WhatsApp message sent: " + message);
	}

}
