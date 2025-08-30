package com.techlabs.MathodOverloading.test;

import com.techlabs.MathodOverloading.model.DiscountCalculator;

public class DiscountCalculatorTest {

	public static void main(String[] args) {
		DiscountCalculator discountcalculator = new DiscountCalculator();
		System.out.println("Default Discount: "+discountcalculator.calculateDiscount(1000));
		System.out.println("Default Discount with coupon: "+discountcalculator.calculateDiscount(1000, "SAVE10"));
		System.out.println("Default Discount with coupon and member: "+discountcalculator.calculateDiscount(1000, "SAVE10", true));
	}
	
}
