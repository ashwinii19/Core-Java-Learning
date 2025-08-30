package com.techlabs.MathodOverloading.test;

import com.techlabs.MathodOverloading.model.BillGenerator;

public class BillGeneratorTest {

	public static void main(String[] args) {
		
		BillGenerator billgenerator = new BillGenerator();
		billgenerator.generateBill("Laptop", 3, 100);
		billgenerator.generateBill("laptop", 3, 1000, 10);
		billgenerator.generateBill("Laptop", 3, 10, 10, 9);
	}
}
