package com.techlabs.Guitar17.model;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

	private List guitars;
	
	public Inventory() {
		guitars = new LinkedList();
	}
	
	public void addguitar(String serialNumber, double price, String builder, String model,String type, String backWood,String topWood) {
		Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
		guitars.add(guitar);
	}
	
	public Guitar getGuitar(String serialNumber) {
		for(Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar)i.next();
			if(guitar.getSerialNumber().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}
	
	public Guitar search(Guitar searchGuitar) {
		for(Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar)i.next();
			
			String builder = searchGuitar.getBuilder();
			if((builder != null) && (!builder.equals("")) && (!builder.equalsIgnoreCase(guitar.getBuilder()))){
				continue;
			}
			
			String model = searchGuitar.getModel();
			if((model != null) && (!model.equals("")) && (!model.equalsIgnoreCase(guitar.getModel()))) {
				continue;
			}
			
			String type = searchGuitar.getType();
			if((type != null) && (!type.equals("")) && (!type.equalsIgnoreCase(guitar.getType()))) {
				continue;
			}
			
			String backWood = searchGuitar.getBackWood();
			if((backWood != null) && (!backWood.equals("")) && (!backWood.equalsIgnoreCase(guitar.getBackWood()))) {
				continue;
			}
			
			String topWood = searchGuitar.getTopWood();
			if((topWood != null) && (!topWood.equals("")) && (!topWood.equalsIgnoreCase(guitar.getTopWood()))) {
				continue;
			}
			
			return guitar;
		}
		return null;
	}
	
}
