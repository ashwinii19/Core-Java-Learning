package com.techlabs.model;

public class Product {

	
	private String productName;
	private double price;
	private double quantity;
	
	public String getProductName() {
		return productName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getQuantity() {
		return quantity;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	
	
//	public Product(String productName, double price, double quantity) {
//		this.productName = productName;
//		this.price = price;
//		this.quantity = quantity;
//	}
	
	public void calculateTotal(double price, double quantity) {
		double total = price * quantity;
		System.out.println("\nName of the Product "+productName + " Price is "+price +" and the quantity "+quantity + "\n Total price "+total);
	}
}
