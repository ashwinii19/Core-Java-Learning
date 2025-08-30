package com.techlabs.Guitar29.test;

import java.util.List;

import com.techlabs.Guitar29.model.Builder;
import com.techlabs.Guitar29.model.Guitar;
import com.techlabs.Guitar29.model.Inventory;
import com.techlabs.Guitar29.model.Type;
import com.techlabs.Guitar29.model.Wood;

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

		Guitar whatErinLikes = new Guitar(null, 0.0, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.ALDER,Wood.ALDER);

//	  //Ek hi input deta hai
//		Guitar guitar = inventory.search(whatErinLikes);
//		if (guitar != null) {
//			System.out.println("Erin, you might like this " + guitar.getBuilder() + " " + guitar.getModel() + " "
//					+ guitar.getType() + " guitar:\n" + guitar.getBackWood() + " back and sides,\n"
//					+ guitar.getTopWood() + " top.\n" + "You can have it for only $" + guitar.getPrice() + "!");
//		} else {
//			System.out.println("Sorry, Erin, we have nothing for you...");
//		}
		
		
		// What if Erin would love two guitars
		List<Guitar> matchingGuitars = inventory.search(whatErinLikes);
		if(!matchingGuitars.isEmpty()) {
			System.out.println("Erin, you might like this: "); 
			for(Guitar guitar : matchingGuitars) {
				System.out.println("\nWe have a "+ guitar.getBuilder() + " " + guitar.getModel() + " " + guitar.getType() + " guitar:\n" + guitar.getBackWood() + " back and sides,\n" + guitar.getTopWood() + " top.\n" + "You can have it for only $" + guitar.getPrice() + "!");
			}
		}else {
			System.out.println("Sorry, Erin, we have nothing for you...");
		}
		
		
		
		
		
	}
}
