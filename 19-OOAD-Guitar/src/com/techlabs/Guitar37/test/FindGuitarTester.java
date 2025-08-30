package com.techlabs.Guitar37.test;

import java.util.List;

import com.techlabs.Guitar37.model.Builder;
import com.techlabs.Guitar37.model.Guitar;
import com.techlabs.Guitar37.model.GuitarSpecs;
import com.techlabs.Guitar37.model.Inventory;
import com.techlabs.Guitar37.model.Type;
import com.techlabs.Guitar37.model.Wood;

public class FindGuitarTester {

	private static void initializeInventory(Inventory inventory) {
		// ✅ Add some guitars to inventory
		inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
		inventory.addGuitar("124", 1600.00, Builder.GIBSON, "Les Paul", Type.ELECTRIC, Wood.MAHOGANY, Wood.MAPLE);
		inventory.addGuitar("V9512", 1549.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
	}

	public static void main(String[] args) {

		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		GuitarSpecs whatErinLikes = new GuitarSpecs(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER,
				Wood.ALDER);
		List<Guitar> matchingGuitars = inventory.search(whatErinLikes);

		if (!matchingGuitars.isEmpty()) {
			System.out.println("Erin, you might like this: ");
			for (Guitar guitar : matchingGuitars) {
				GuitarSpecs spec = guitar.getSpec();
				System.out.println("\nWe have a " + spec.getBuilder() + " " + spec.getModel() + " " + spec.getType()
						+ " guitar:\n" + spec.getBackWood() + " back and sides,\n" + spec.getTopWood() + " top.\n"
						+ "You can have it for only $" + guitar.getPrice() + "!");
			}
		} else {
			System.out.println("Sorry, Erin, we have nothing for you...");
		}

	}

}
