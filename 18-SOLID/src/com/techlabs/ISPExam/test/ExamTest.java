package com.techlabs.ISPExam.test;

import java.util.Scanner;

import com.techlabs.ISPExam.model.ExamCell;
import com.techlabs.ISPExam.model.Student;
import com.techlabs.ISPExam.model.Teacher;

public class ExamTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("============ Exam Management System ============");

		System.out.println("select Role: \n1. Student\n2. Teacher\n3. ExamCell ");
		int role = scanner.nextInt();
		scanner.nextLine();

		switch (role) {
		case 1:
			Student student = new Student();

			student.startExam();
			student.endExam();
			break;
		
		case 2:
			Teacher teacher = new Teacher();
			
			teacher.createQuestionBank();
			System.out.print("Enter marks (0–100): ");
			int marks = scanner.nextInt();
			scanner.nextLine();
			teacher.gradeExam(marks);
			break;
			
		case 3:
			ExamCell examCell = new ExamCell();
			
			examCell.assignTeacher();
			break;
			
		default:
			System.out.println("Invalid Input");
		}
	}
}
