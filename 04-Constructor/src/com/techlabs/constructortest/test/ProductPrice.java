package com.techlabs.constructortest.test;

public class ProductPrice {

	String name;
	float price;

	public ProductPrice(String name, float price) {
		this.name = name;
		this.price = price;
	}

	public void diplay() {
		if (price <= 1000) {
			System.out.println("\n\nDeatils of the Product");
			System.out.println("Name of the Product " + name + " And the price " + price);
		}
		System.out.println(" ");

	}
}
