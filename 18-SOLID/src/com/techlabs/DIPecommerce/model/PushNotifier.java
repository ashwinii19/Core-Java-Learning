package com.techlabs.DIPecommerce.model;

public class PushNotifier implements INotifier{

	@Override
	public void send(String message) {
		System.out.println("Push Notification sent: " + message);
	}

}
