package com.techlabs.educationexamsystem.test;

import java.util.Scanner;

import com.techlabs.educationexamsystem.model.IExamEvaluator;
import com.techlabs.educationexamsystem.model.OnlineQuiz;
import com.techlabs.educationexamsystem.model.PracticalExam;
import com.techlabs.educationexamsystem.model.TheoryExam;

public class ResultPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Exam Evaluation System");

        String name = "";
        while (true) {
            System.out.print("Enter Student Name: ");
            name = scanner.nextLine().trim();
            if (!name.isEmpty() && name.matches("[a-zA-Z ]+")) {
                break;
            } else {
                System.out.println("Invalid name. Please use letters only.");
            }
        }

        System.out.print("Enter Roll Number: ");
        String rollNo = scanner.nextLine().trim();

        Integer theoryMarks = null;
        String theoryGrade = null;

        Integer practicalMarks = null;
        String practicalGrade = null;

        Integer quizMarks = null;
        String quizGrade = null;

        boolean running = true;

        System.out.println("\n"+name+ " Student registered successfully.\n");

        while (running) {
            System.out.println("Which exam marks do you want to enter?");
            System.out.println("1. Theory Exam");
            System.out.println("2. Practical Exam");
            System.out.println("3. Online Quiz");
            System.out.println("4. Exit");

            int choice = 0;
            while (true) {
                System.out.print("Enter your choice: ");
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    if (choice >= 1 && choice <= 4) {
                        break;
                    } else {
                        System.out.println("Please enter a valid option (1-4).");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next();
                }
            }

            if (choice == 4) {
                System.out.println("\nExiting and generating your summary...");
                break;
            }

            boolean enterAgain = true;
            while (enterAgain) {
                if (choice == 1) {
                    System.out.println("\nEntering marks for Theory Exam:");

                    int os = 0, dbms = 0, java = 0;
                    while (true) {
                        System.out.print("  OS marks (0-100): ");
                        if (scanner.hasNextInt()) {
                            os = scanner.nextInt();
                            if (os >= 0 && os <= 100) break;
                        } else scanner.next();
                        System.out.println("  Please enter valid marks between 0 and 100.");
                    }

                    while (true) {
                        System.out.print("  DBMS marks (0-100): ");
                        if (scanner.hasNextInt()) {
                            dbms = scanner.nextInt();
                            if (dbms >= 0 && dbms <= 100) break;
                        } else scanner.next();
                        System.out.println("  Please enter valid marks between 0 and 100.");
                    }

                    while (true) {
                        System.out.print("  Java marks (0-100): ");
                        if (scanner.hasNextInt()) {
                            java = scanner.nextInt();
                            if (java >= 0 && java <= 100) break;
                        } else scanner.next();
                        System.out.println("  Please enter valid marks between 0 and 100.");
                    }

                    int avg = (os + dbms + java) / 3;
                    IExamEvaluator theory = new TheoryExam(avg);
                    theory.evaluateMarks();
                    theoryGrade = theory.calculateGrade();
                    theoryMarks = avg;
                    System.out.println("Grade: " + theoryGrade);
                } else if (choice == 2) {
                    System.out.println("\nEntering marks for Practical Exam:");

                    int lab1 = 0, lab2 = 0;
                    while (true) {
                        System.out.print("  Lab1 marks (0-100): ");
                        if (scanner.hasNextInt()) {
                            lab1 = scanner.nextInt();
                            if (lab1 >= 0 && lab1 <= 100) break;
                        } else scanner.next();
                        System.out.println("  Please enter valid marks between 0 and 100.");
                    }

                    while (true) {
                        System.out.print("  Lab2 marks (0-100): ");
                        if (scanner.hasNextInt()) {
                            lab2 = scanner.nextInt();
                            if (lab2 >= 0 && lab2 <= 100) break;
                        } else scanner.next();
                        System.out.println("  Please enter valid marks between 0 and 100.");
                    }

                    int avg = (lab1 + lab2) / 2;
                    IExamEvaluator practical = new PracticalExam(avg);
                    practical.evaluateMarks();
                    practicalGrade = practical.calculateGrade();
                    practicalMarks = avg;
                    System.out.println("Grade: " + practicalGrade);
                } else if (choice == 3) {
                    System.out.println("\nEntering scores for Online Quiz:");

                    int javaQuiz = 0, pythonQuiz = 0;
                    while (true) {
                        System.out.print("  Java Quiz correct answers (0-10): ");
                        if (scanner.hasNextInt()) {
                            javaQuiz = scanner.nextInt();
                            if (javaQuiz >= 0 && javaQuiz <= 10) break;
                        } else scanner.next();
                        System.out.println("  Please enter valid score between 0 and 10.");
                    }

                    while (true) {
                        System.out.print("  Python Quiz correct answers (0-10): ");
                        if (scanner.hasNextInt()) {
                            pythonQuiz = scanner.nextInt();
                            if (pythonQuiz >= 0 && pythonQuiz <= 10) break;
                        } else scanner.next();
                        System.out.println("  Please enter valid score between 0 and 10.");
                    }

                    int avg = (javaQuiz + pythonQuiz) / 2;
                    IExamEvaluator quiz = new OnlineQuiz(avg);
                    quiz.evaluateMarks();
                    quizGrade = quiz.calculateGrade();
                    quizMarks = avg;
                    System.out.println("Grade: " + quizGrade);
                }

                System.out.println("\nWhat would you like to do next?");
                System.out.println("1. Enter again for the same exam");
                System.out.println("2. Enter for a different exam");
                System.out.println("3. Exit");

                int next = 0;
                while (true) {
                    System.out.print("Enter your choice: ");
                    if (scanner.hasNextInt()) {
                        next = scanner.nextInt();
                        if (next >= 1 && next <= 3) break;
                    } else scanner.next();
                    System.out.println("Please enter 1, 2, or 3.");
                }

                if (next == 1) {
                    enterAgain = true;
                } else if (next == 2) {
                    enterAgain = false;
                } else {
                    enterAgain = false;
                    running = false;
                    System.out.println("\nExiting and generating your summary...");
                }
            }
        }

        // Summary
        System.out.println("\n========== Final Summary ==========");
        System.out.println("Name     : " + name);
        System.out.println("Roll No. : " + rollNo);

        if (theoryMarks != null) {
            System.out.println("\nTheory Exam:");
            System.out.println("Total Marks: " + theoryMarks);
            System.out.println("Grade      : " + theoryGrade);
        }

        if (practicalMarks != null) {
            System.out.println("\nPractical Exam:");
            System.out.println("Total Marks: " + practicalMarks);
            System.out.println("Grade      : " + practicalGrade);
        }

        if (quizMarks != null) {
            System.out.println("\nOnline Quiz:");
            System.out.println("Total Marks: " + quizMarks);
            System.out.println("Grade      : " + quizGrade);
        }

        if (theoryMarks == null && practicalMarks == null && quizMarks == null) {
            System.out.println("\nNo exam marks were entered.");
        }

        System.out.println("=====================================");
        scanner.close();
    }
}