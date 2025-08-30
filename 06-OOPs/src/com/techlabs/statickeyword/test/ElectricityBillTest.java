package com.techlabs.statickeyword.test;

import com.techlabs.statickeyword.model.ElectricityBill;

public class ElectricityBillTest {

	public static void main(String[] args) {
	
		ElectricityBill.displayCurrentRate();
		
		ElectricityBill apartment1 = new ElectricityBill(101, 120);
		ElectricityBill apartment2 = new ElectricityBill(102, 85);
		
		apartment1.displayBill();
		apartment2.displayBill();
	}
}
