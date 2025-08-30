package com.techlabs.DIPecommerce.model;

public class EmailSender implements INotifier{

	@Override
	public void send(String message) {
		System.out.println("Email sent: " + message);
	}

}
