package com.techlabs.DesignPatternStructural.model;

//Step 2: Leaf – simple file
public class CompositFileLeaf implements IFileComposit {

	String name;

	public CompositFileLeaf(String name) {
		super();
		this.name = name;
	}

	@Override
	public void show() {
		System.out.println("File: " + name);
	}

}
