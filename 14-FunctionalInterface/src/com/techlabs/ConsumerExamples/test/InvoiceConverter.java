package com.techlabs.ConsumerExamples.test;

import java.util.function.Consumer;

public class InvoiceConverter {

	public static void main(String[] args) {
		
		Consumer<Invoice> printInvoice = invoice -> System.out.println("Item: "+invoice.itemName+" | Quantity: "+invoice.quantity+" | Total: Rs"+(invoice.quantity * invoice.price));
		printInvoice.accept(new Invoice("Pen", 2, 10));
		printInvoice.accept(new Invoice("Pencil", 5, 3));
		printInvoice.accept(new Invoice("Book", 1, 50));
		
	}

}
