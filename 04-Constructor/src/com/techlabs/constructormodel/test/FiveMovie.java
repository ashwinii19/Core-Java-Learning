package com.techlabs.constructormodel.test;

import java.util.Scanner;

import com.techlabs.constructortest.test.Movie;

public class FiveMovie {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Number of Movies: ");
		int numberofmovies = scanner.nextInt();
		scanner.nextLine();

		Movie[] movie = new Movie[numberofmovies];

		for (int i = 0; i < numberofmovies; i++) {
			System.out.println("Enter the Details of Movie" + (i + 1) + " ");
			System.out.println("Enter the Title of Movie: ");
			String title = scanner.nextLine();

			System.out.println(" Enter the Genre of Movie: ");
			String genre = scanner.nextLine();

			movie[i] = new Movie(title, genre);
		}

		for (Movie result : movie) {
			result.display();
		}

		scanner.close();
	}
}
