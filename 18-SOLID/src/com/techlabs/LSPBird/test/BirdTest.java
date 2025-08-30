package com.techlabs.LSPBird.test;

import java.util.Scanner;

import com.techlabs.LSPBird.model.IFlyable;
import com.techlabs.LSPBird.model.INonFlyable;
import com.techlabs.LSPBird.model.Ostrich;
import com.techlabs.LSPBird.model.Pigeon;
import com.techlabs.LSPBird.model.Sparrow;

public class BirdTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter bird type: sparrow, pigeon, or ostrich");
		String birdType = sc.nextLine().toLowerCase();

		switch (birdType) {
		case "sparrow":
			IFlyable sparrow = new Sparrow();
			sparrow.fly();
			sparrow.bodyColor();
			break;
		case "pigeon":
			IFlyable pigeon = new Pigeon();
			pigeon.fly();
			pigeon.bodyColor();
			break;
		case "ostrich":
			INonFlyable ostrich = new Ostrich();
			ostrich.walk();
			ostrich.bodyColor();
			break;
		default:
			System.out.println("Invalid bird type");
		}
	}
}
