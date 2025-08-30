package com.techlabs.Guitar37.model;

public class Guitar {

	private String serialNumber;
	private Double price;
	private GuitarSpecs spec;
	
	public Guitar(String serialNumber, Double price, GuitarSpecs spec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public double getPrice() {
		return price;
	}

	public GuitarSpecs getSpec() {
		return spec;
	}
}
