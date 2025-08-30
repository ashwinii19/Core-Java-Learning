package com.techlabs.enumeration.model;

public class PaymentStatusTracker {

	public static void printMessage(PaymentStatus status) {

		switch (status) {

		case SUCCESS:
			System.out.println("Payment received");
			break;

		case PENDING:
			System.out.println("Payment pending");
			break;

		case FAILED:
			System.out.println("Payment failed");
			break;

		case CANCELLED:
			System.out.println("Payment cancelled");
			break;
		}
	}

	public static void main(String[] args) {
		printMessage(PaymentStatus.CANCELLED);
	}
}
