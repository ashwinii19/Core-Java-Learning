package com.techlabs.constructormodel.test;

import java.util.Scanner;

import com.techlabs.constructortest.test.ProductPrice;

public class Products {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Number of Product: ");
		int numberofproduct = scanner.nextInt();
		scanner.nextLine();
		
		ProductPrice[] productprice = new ProductPrice[numberofproduct];
		
		for(int i=0; i<numberofproduct; i++) {
			System.out.println("Details of product "+ (i+1)+ ":");
			System.out.print("Enter the name of the Product ");
			String name = scanner.nextLine();
			
			System.out.print("Enter the price of the Product ");
			int price = scanner.nextInt();
			
			scanner.nextLine();
			
			productprice[i] = new ProductPrice(name, price);
		}
		
		for(ProductPrice result : productprice) {
			result.diplay();
		}
	}
}
