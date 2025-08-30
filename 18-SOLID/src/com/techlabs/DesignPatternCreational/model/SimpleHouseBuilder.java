package com.techlabs.DesignPatternCreational.model;
//Concrete Builder – how to build a simple house ------- Kaisa ghar chahiye
public class SimpleHouseBuilder implements IHouseBuilder {
	BuilderPatternHouse house = new BuilderPatternHouse();

	public void buildFoundation() {
		house.foundation = "Concrete foundation";
	}

	public void buildStructure() {
		house.structure = "Brick walls";
	}

	public void buildRoof() {
		house.roof = "Wooden roof";
	}

	public void paintHouse() {
		house.paint = "White paint";
	}

	public BuilderPatternHouse getHouse() {
		return house;
	}
}