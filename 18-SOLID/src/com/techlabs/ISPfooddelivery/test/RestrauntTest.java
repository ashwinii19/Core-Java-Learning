package com.techlabs.ISPfooddelivery.test;

import java.util.Scanner;

import com.techlabs.ISPfooddelivery.model.Customer;
import com.techlabs.ISPfooddelivery.model.Manage;

public class RestrauntTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("==== Food Delivery System ====");
		System.out.print("Choose role (1. Customer / 2. Restaurant): ");
		int role = scanner.nextInt();

		switch (role) {
		case 1:
			Customer customer = new Customer();

			customer.trackorder();
			
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println("Tracking interrupted.");
			}
			System.out.println("Order Placed Successfully.");
			
			System.out.print("Rate your delivery driver (1-10): ");
            int rating = scanner.nextInt();
            scanner.nextLine();
            if (rating < 1 || rating > 10) {
                System.out.println("Invalid rating. Please enter a value between 1 and 10.");
            } else {
                customer.rateDriver(rating);
            }
            break;
            
		case 2:
			Manage manage = new Manage();
			
			manage.maganeRestraunt();
			break;
			
		default:
			 System.out.println("Invalid role entered.");
		}
	}
}
