package com.techlabs.ifelse.test;

import java.util.Scanner;

public class TreasureIslandGame {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Treasure Island. \nYour mission is to find the treasure.\n");

		System.out.println("Enter the direction where you want to move(left or right): ");
		String direction = scanner.nextLine();

		if (direction.equals("left")) {
			System.out.println("\nDo you want to swim or wait?");
			String action = scanner.nextLine();

			if (action.equals("wait")) {
				System.out.println("\nTo which door you want to move(red, yellow, blue): ");
				String door = scanner.nextLine();

				switch (door) {

				case "red":
					System.out.println("\nBurned by fire. \nGame over.");
					break;

				case "yellow":
					System.out.println("\nYou win. \nCongrulations.");
					break;

				case "blue":
					System.out.println("\nEaten by beasts. \nGame Over.");
					break;

				default:
					System.out.println("\nGame Over.");
				}
			} else {
				System.out.println("\nAttack by trout. \nGame over.");
			}
		} else {
			System.out.println("\nFall into a hole. \nGame Over.");
		}

		scanner.close();
	}
}
