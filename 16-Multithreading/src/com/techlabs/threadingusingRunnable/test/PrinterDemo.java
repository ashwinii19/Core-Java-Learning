package com.techlabs.threadingusingRunnable.test;

import com.techlabs.threadingusingRunnable.model.Printer;

public class PrinterDemo {

	public static void main(String[] args) {
		
		Printer sharedPrinter = new Printer();
		
		Runnable r1 = () -> sharedPrinter.print("Report.pdf");
		Runnable r2 = () -> sharedPrinter.print("Invoice.pdf");
		
		new Thread(r1, "Ashwini ").start();
		new Thread(r2, "Durgesh ").start();
	}
}
