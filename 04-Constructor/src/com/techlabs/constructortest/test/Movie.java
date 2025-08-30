package com.techlabs.constructortest.test;

public class Movie {

	String title;
	String genre;

	public Movie(String title, String genre) {
		this.title = title;
		this.genre = genre;
	}

	public void display() {
		if (genre.equalsIgnoreCase("action")) {
			System.out.println("Title of the movie " + title + " Genre " + genre);
			System.out.println(" ");
		}
	}
}
