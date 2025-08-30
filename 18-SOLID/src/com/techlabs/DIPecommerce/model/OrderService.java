package com.techlabs.DIPecommerce.model;

public class OrderService {
	
	INotifier notifier;

	public OrderService(INotifier notifier) {
		this.notifier = notifier;
	}
	
	public void placeOrder(String orderId) {
		 System.out.println("Order placed successfully. Order ID: " + orderId);
		 notifier.send("order "+orderId+" has been placed");
	}
}
