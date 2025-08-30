package com.techlabs.constructormodel.test;

import java.util.Scanner;

import com.techlabs.constructortest.test.MarksofStudents;

public class StudentMarks {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Number of Students: ");
        int numberofstudents = scanner.nextInt();
        scanner.nextLine();

        MarksofStudents[] marksofstudents = new MarksofStudents[numberofstudents];

        for (int i = 0; i < numberofstudents; i++) {
            System.out.println("Details of Student " + (i + 1));

            System.out.print("Enter the Name of Student: ");
            String name = scanner.nextLine();

            System.out.print("Enter the Roll Number: ");
            int rollNumber = scanner.nextInt();
            scanner.nextLine();

            int[] subjectmarks = new int[3];
            for (int j = 0; j < subjectmarks.length; j++) {
                System.out.print("Enter the Subject Marks " + (j + 1) + ": ");
                subjectmarks[j] = scanner.nextInt();
            }
            scanner.nextLine();

            marksofstudents[i] = new MarksofStudents(name, rollNumber, subjectmarks);
        }

        System.out.println("\n--- Student Details ---");
        for (MarksofStudents student : marksofstudents) {
            student.display();
        }

        scanner.close();
	}
}
