package com.techlabs.Guitar29.model;

import java.util.LinkedList;
import java.util.List;

public class Inventory {

	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<>();
	}

	public void addGuitar(String serialNumber, Double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {
		Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
		guitars.add(guitar);
	}

	public Guitar getGuitar(String serialNumber) {
		for (Guitar guitar : guitars) {
			if (guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}


//  //Ek hi input deta hai
//	public Guitar search(Guitar searchGuitar) {
//		for (Guitar guitar : guitars){
//
//			if (searchGuitar.getBuilder() != null && !searchGuitar.getBuilder().equals(guitar.getBuilder())) {
//				continue;
//			}
//
//			if (searchGuitar.getModel() != null && !searchGuitar.getModel().equalsIgnoreCase(guitar.getModel())) {
//				continue;
//			}
//
//			if (searchGuitar.getType() != null && !searchGuitar.getType().equals(guitar.getType())) {
//				continue;
//			}
//
//			if (searchGuitar.getBackWood() != null && !searchGuitar.getBackWood().equals(guitar.getBackWood())) {
//				continue;
//			}
//
//			if (searchGuitar.getTopWood() != null && !searchGuitar.getTopWood().equals(guitar.getTopWood())) {
//				continue;
//			}
//
//			return guitar;
//		}
//		return null;
//	}

	// What if Erin would love two guitars
	public List<Guitar> search(Guitar searchGuitar) {
		List<Guitar> matchingGuitars = new LinkedList<>();

		for (Guitar guitar : guitars) {

			if (searchGuitar.getBuilder() != null && !searchGuitar.getBuilder().equals(guitar.getBuilder())) {
				continue;
			}

			if (searchGuitar.getModel() != null && !searchGuitar.getModel().equalsIgnoreCase(guitar.getModel())) {
				continue;
			}

			if (searchGuitar.getType() != null && !searchGuitar.getType().equals(guitar.getType())) {
				continue;
			}

			if (searchGuitar.getBackWood() != null && !searchGuitar.getBackWood().equals(guitar.getBackWood())) {
				continue;
			}

			if (searchGuitar.getTopWood() != null && !searchGuitar.getTopWood().equals(guitar.getTopWood())) {
				continue;
			}

			matchingGuitars.add(guitar);
		}
		return matchingGuitars;
	}
	
	
}
