package com.techlabs.MathodOverloading.test;

import com.techlabs.MathodOverloading.model.Printer;

public class PrinterTest {

	public static void main(String[] args) {
		
		Printer printer = new Printer();
		printer.print();
		printer.print("Hello World");
		printer.print(50);
		
		
		
	}
}
