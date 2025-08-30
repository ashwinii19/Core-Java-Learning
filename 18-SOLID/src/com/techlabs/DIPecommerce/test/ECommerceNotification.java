package com.techlabs.DIPecommerce.test;

import java.util.Scanner;

import com.techlabs.DIPecommerce.model.EmailSender;
import com.techlabs.DIPecommerce.model.INotifier;
import com.techlabs.DIPecommerce.model.OrderService;
import com.techlabs.DIPecommerce.model.PushNotifier;
import com.techlabs.DIPecommerce.model.SMSSender;
import com.techlabs.DIPecommerce.model.WhatsApp;

public class ECommerceNotification {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println();
			System.out.println("Choose Notification Type:");
			System.out.println("1. Email");
			System.out.println("2. SMS");
			System.out.println("3. Push Notification");
			System.out.println("4. WhatsApp");
			System.out.println("5. Exit");
			System.out.print("Your choice: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			INotifier notifier;
			
			switch (choice) {
			case 1:
				notifier = new EmailSender();
				break;
			case 2:
				notifier = new SMSSender();
				break;
			case 3:
				notifier = new PushNotifier();
				break;
			case 4:
				notifier = new WhatsApp();
				break;
			case 5:
				 System.out.println("Exiting the system. Thank you!");
                 scanner.close();
                 System.exit(0); 
			default:
				System.out.println("Invalid choice.");
				continue;
			}

			System.out.print("Enter Order ID: ");
			String orderId = scanner.nextLine();

			OrderService service = new OrderService(notifier);
			service.placeOrder(orderId);
		}

	}
}
