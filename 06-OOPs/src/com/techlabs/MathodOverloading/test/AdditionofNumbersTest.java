package com.techlabs.MathodOverloading.test;

import com.techlabs.MathodOverloading.model.AdditionOfNumbers;

public class AdditionofNumbersTest {

	public static void main(String[] args) {
		
		AdditionOfNumbers additionofnumbers = new AdditionOfNumbers();
		additionofnumbers.add(3, 4);
		additionofnumbers.add(2.2, 3.3);
		additionofnumbers.add(3, 4, 5);
	}
}
