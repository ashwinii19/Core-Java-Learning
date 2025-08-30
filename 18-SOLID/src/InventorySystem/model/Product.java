package InventorySystem.model;

public class Product {

	String name;
	int quantity;
	double price;
	int reorderThreshold;
	
	public Product(String name, int quantity, double price, int reorderThreshold) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.reorderThreshold = reorderThreshold;
	}

	public String getName() {
		return name;
	}

	public int getQuantity() {
		return quantity;
	}
	
	public void addStock(int qty) {
		this.quantity += qty;
	}

	public void removeStock(int qty) {
		this.quantity -= qty;
	}
	
	public double getPrice() {
		return price;
	}

	public int getReorderThreshold() {
		return reorderThreshold;
	}
	
	
}
