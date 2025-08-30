package com.techlabs.enumeration.model;

public class PizzaOrder {

	public static void main(String[] args) {
		
		Size pizzaSize = Size.MEDIUM;
//		Size pizzaSize2 = Size.SMALL;
		
		switch(pizzaSize) {
			case SMALL:
				System.out.println("Small pizza cost $150");
				break;
				
			case MEDIUM:
				System.out.println("Medium pizza cost $300");
				break;
				
			case LARGE:
				System.out.println("Large pizza cost $500");
				break;	
		}
		
		for(Size size : pizzaSize.values()) {
			System.out.println(size);
		}
	}
}
