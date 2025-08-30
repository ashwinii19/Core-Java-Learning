package com.techlabs.Guitar37.model;

import java.util.LinkedList;
import java.util.List;

public class Inventory {

	private List<Guitar> guitars;
	
	public Inventory() {
		guitars = new LinkedList<>();
	}
	
	public void addGuitar(String serialNumber, Double price, Builder builder, String model, Type type, Wood backWood,Wood topWood) {
		GuitarSpecs guitarSpec = new GuitarSpecs(builder, model, type, backWood, topWood);
		Guitar guitar = new Guitar(serialNumber, price, guitarSpec);
		guitars.add(guitar);
	}
	
	public Guitar getGuitar(String serialNumber) {
		for(Guitar guitar : guitars) {
			if(guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}
	
	public List search(GuitarSpecs searchSpec) {
		List<Guitar> matchingGuitars = new LinkedList<>();
		
		for(Guitar guitar : guitars) {
			
			GuitarSpecs guitarSpecs = guitar.getSpec();
			
			if (searchSpec.getBuilder() != null && !searchSpec.getBuilder().equals(guitarSpecs.getBuilder())) {
				continue;
			}

			if (searchSpec.getModel() != null && !searchSpec.getModel().equalsIgnoreCase(guitarSpecs.getModel())) {
				continue;
			}

			if (searchSpec.getType() != null && !searchSpec.getType().equals(guitarSpecs.getType())) {
				continue;
			}

			if (searchSpec.getBackWood() != null && !searchSpec.getBackWood().equals(guitarSpecs.getBackWood())) {
				continue;
			}

			if (searchSpec.getTopWood() != null && !searchSpec.getTopWood().equals(guitarSpecs.getTopWood())) {
				continue;
			}

			matchingGuitars.add(guitar);
		}
		return matchingGuitars;
	}
}
