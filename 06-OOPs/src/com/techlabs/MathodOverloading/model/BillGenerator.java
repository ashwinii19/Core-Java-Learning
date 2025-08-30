package com.techlabs.MathodOverloading.model;

public class BillGenerator {

	String item;
	int qty;
	int price;
	double discount;
	double tax;

	public void generateBill(String item, int qty, int price) {
		System.out.println("Name of the Item: "+item + " Quantity: "+qty + " price: "+price);
	}
	
	public void generateBill(String item, int qty, int price, double discount) {
		discount =(discount/100) * price;
		System.out.println("Name of the Item: "+item + " Quantity: "+qty + " price: " + price +" discount: "+discount);
	}
	
	public void generateBill(String item, int qty, double discount, int price, double tax) {
		discount =(discount/100) * price;
		tax = (price*tax)/100;
		System.out.println("Name of the Item: "+item + " Quantity: "+qty + " price: " + price + " discount: "+discount + " discount tax: "+tax);
	}
}
