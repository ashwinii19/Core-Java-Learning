package com.techlabs.ManageStudentRecords.model;

import java.io.*;
import java.util.Scanner;

public class StudentManager {
    String fileName = "students.txt";

    public void addStudent() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Roll Number: ");
            int rollNumber = Integer.parseInt(scanner.nextLine().trim());

            String name;
            while (true) {
                System.out.print("Enter Student Name: ");
                name = scanner.nextLine().trim();

                if (!name.isEmpty() && name.matches("^[a-zA-Z ]+$")) {
                    break;
                } else {
                    System.out.println("Invalid name! Please enter letters only.");
                }
            }

            System.out.print("Enter Marks: ");
            int marks = Integer.parseInt(scanner.nextLine().trim());

            Student student = new Student(rollNumber, name, marks);

            FileWriter writer = new FileWriter(fileName, true);
            writer.write(student.toString() + "\n");
            writer.close();

            System.out.println("Student added successfully.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void viewStudents() {
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                System.out.println("No student records found.");
                return;
            }

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("All Students:");
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    System.out.println("Roll No: " + data[0].trim() + ", Name: " + data[1].trim() + ", Marks: " + data[2].trim());
                }
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void searchStudent() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Roll Number to search: ");
            int searchRoll = Integer.parseInt(scanner.nextLine().trim());

            File file = new File(fileName);
            if (!file.exists()) {
                System.out.println("No student records found.");
                return;
            }

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            boolean found = false;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    int roll = Integer.parseInt(data[0].trim());
                    if (roll == searchRoll) {
                        System.out.println("Student Found: Roll No: " + data[0].trim() + ", Name: " + data[1].trim() + ", Marks: " + data[2].trim());
                        found = true;
                        break;
                    }
                }
            }

            if (!found) {
                System.out.println("Student with roll number " + searchRoll + " not found.");
            }

            reader.close();
        } catch (NumberFormatException e) {
            System.out.println("Invalid roll number format.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void deleteStudent() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Roll Number to delete: ");
            int deleteRoll = Integer.parseInt(scanner.nextLine().trim());

            File originalFile = new File(fileName);
            File tempFile = new File("temp_students.txt");

            if (!originalFile.exists()) {
                System.out.println("No student records found.");
                return;
            }

            BufferedReader reader = new BufferedReader(new FileReader(originalFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String line;
            boolean deleted = false;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    int roll = Integer.parseInt(data[0].trim());
                    if (roll != deleteRoll) {
                        writer.write(line + "\n");
                    } else {
                        deleted = true;
                    }
                }
            }

            reader.close();
            writer.close();

            if (!originalFile.delete()) {
                System.out.println("Failed to delete original file.");
                return;
            }

            if (!tempFile.renameTo(originalFile)) {
                System.out.println("Failed to rename temp file to original.");
                return;
            }

            if (deleted) {
                System.out.println("Student deleted successfully.");
            } else {
                System.out.println("Roll number not found.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid roll number.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}