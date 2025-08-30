package InventorySystem.test;

import java.util.Locale;
import java.util.Scanner;

import InventorySystem.model.EmailSender;
import InventorySystem.model.INotifier;
import InventorySystem.model.InventoryService;
import InventorySystem.model.Product;
import InventorySystem.model.ReorderService;
import InventorySystem.model.SMSSender;

public class InventorySystem {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("==== Inventory Management System ====");
		while (true) {
			System.out.println();
			System.out.println("Enter details for product:");
			System.out.print("Name: ");
			String name = scanner.nextLine();

			System.out.print("Quantity: ");
			int quantity = scanner.nextInt();

			System.out.print("Price per unit: ");
			double price = scanner.nextDouble();

			System.out.print("Reorder level: ");
			int reorderLevel = scanner.nextInt();
			scanner.nextLine();

			Product product = new Product(name, quantity, price, reorderLevel);

			System.out.println("-------------------------------------");
			System.out.println("Choose notification method: 1. Email  2. SMS");
			int notifierChoice = scanner.nextInt();

			INotifier notifier;

			switch (notifierChoice) {
			case 1:
				notifier = new EmailSender();
				break;
			case 2:
				notifier = new SMSSender();
				break;
			default:
				System.out.println("Invalid choice.");
				continue;
			}
			
			ReorderService reorderService = new ReorderService(notifier);
            InventoryService inventoryService = new InventoryService(reorderService);

			System.out.print("Enter quantity to remove: ");
			int removeQty = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Stock updated: Removed " + removeQty + " units of '" + name + "'");
            inventoryService.removeStock(product, removeQty);

			System.out.println("-------------------------------------");
			System.out.println("Choose valuation method: 1. FIFO  2. LIFO");
			int valChoice = scanner.nextInt();
			scanner.nextLine();
			double value;
			
			if (valChoice == 1) {
			    value = product.getQuantity() * product.getPrice(); // FIFO
			    System.out.printf("Total inventory value using FIFO: ₹"+ value);
			} else if (valChoice == 2) {
			    value = product.getQuantity() * product.getPrice(); // LIFO
			    System.out.printf("Total inventory value using LIFO: ₹"+ value);
			} else {
			    System.out.println("Invalid valuation choice.");
			}
			System.out.println();

		}

	}
}
