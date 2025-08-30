package com.techlabs.SRPpatient.test;

import java.util.Scanner;

import com.techlabs.SRPpatient.model.FormattingRecordsPrinting;
import com.techlabs.SRPpatient.model.PatientRecord;
import com.techlabs.SRPpatient.model.SendingEmailNotifications;
import com.techlabs.SRPpatient.model.storingpatientdata;

public class PatientRecordTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Patient name: ");
		String name = scanner.nextLine();
		

		System.out.print("Enter Patient email: ");
		String email = scanner.nextLine();
		
		System.out.print("Enter Patient ID: ");
		int patientId = scanner.nextInt();
		
		System.out.print("Enter Patient age: ");
		int age = scanner.nextInt();
		
		PatientRecord record = new PatientRecord(name, patientId, email, age);
		
		System.out.println("------------------------------");
		storingpatientdata dats = new storingpatientdata();
		dats.data(record);
		
		System.out.println("------------------------------");
		SendingEmailNotifications emails = new SendingEmailNotifications();
		emails.email(record);
		
		System.out.println("------------------------------");
		FormattingRecordsPrinting prints = new FormattingRecordsPrinting();
		prints.print(record);
		
	}
}
