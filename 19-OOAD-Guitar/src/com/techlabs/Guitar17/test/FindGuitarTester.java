package com.techlabs.Guitar17.test;

import com.techlabs.Guitar17.model.Guitar;
import com.techlabs.Guitar17.model.Inventory;

public class FindGuitarTester {

	public static void main(String[] args) {

		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		Guitar WhatErinLikes = new Guitar("123", 1500.00, "fender", "Stratocastor", "electric", "Alder", "Alder");

		Guitar guitar = inventory.search(WhatErinLikes);
		if (guitar != null) {
			System.out.println("Erin, you might like this " + guitar.getBuilder() + " " + guitar.getModel() + " "
					+ guitar.getType() + " guitar: \n" + guitar.getBackWood() + " back and sides,\n"
					+ guitar.getTopWood() + " top. \nYou can have it for only $" + guitar.getPrice() + "!");
		} else {
			System.out.println("Sorry, Erin, we have nothing for you...");
		}
	}

	private static void initializeInventory(Inventory inventory) {
		// Add guitars to the inventory...
		inventory.addguitar("V95693", 1499.95, "Fender", "Stratocastor", "electric", "Alder", "Alder");
		inventory.addguitar("124", 1600.00, "gibson", "Les Paul", "electric", "Mahogany", "Maple");
		inventory.addguitar("125", 1400.00, "fender", "Stratocastor", "acoustic", "Alder", "Spruce");
	}
}
