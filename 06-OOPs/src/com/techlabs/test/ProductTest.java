package com.techlabs.test;

import java.util.Scanner;

import com.techlabs.model.Product;

public class ProductTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the name of the Product ");
		String productName = scanner.nextLine();
		
		System.out.println("Enter the price of the Product ");
		double price = scanner.nextDouble();
		
		System.out.println("Enter the quantity of the Product ");
		double quantity = scanner.nextDouble();
		
	
		Product product1 = new Product();
//		product1.setProductName(productName);
		product1.setPrice(100);
		product1.calculateTotal(price, quantity);
		
		System.out.println("\n The price of the product: "+product1.getPrice());
		
		
		scanner.close();
	}
}
