package com.techlabs.filehandling.test;

import java.io.File;
import java.io.IOException;

public class DeleteFile {

	public static void main(String[] args) throws IOException {

		File file = new File("demo.txt");

		if (file.delete()) {
			System.out.println("File deleted: " + file.getName());
		} else {
			System.out.println("File does not exist");
		}
	}
}
