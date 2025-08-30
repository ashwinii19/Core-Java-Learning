package com.techlabs.TictacToeFacadeAssignment.model;

public class Players {

	private String name;
	private Symbol symbol;
	
	public Players(String name, Symbol symbol) {
		this.name = name;
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public Symbol getSymbol() {
		return symbol;
	}
}
