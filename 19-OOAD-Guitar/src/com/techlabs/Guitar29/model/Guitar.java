package com.techlabs.Guitar29.model;

public class Guitar {

	private String serialNumber, model;
	private Double price;
	private Builder builder;      //reference variable
	private Type type;
	private Wood backWood, topWood;

	public Guitar(String serialNumber, Double price, Builder builder, String model, Type type, Wood backWood,Wood topWood) {
		this.serialNumber = serialNumber;
		this.model = model;
		this.price = price;
		this.builder = builder;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public double getPrice() {
		return price;
	}

	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}
	
	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}
}
