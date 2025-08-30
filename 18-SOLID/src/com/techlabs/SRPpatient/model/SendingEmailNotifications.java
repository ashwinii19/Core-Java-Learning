package com.techlabs.SRPpatient.model;

public class SendingEmailNotifications {

	public void email(PatientRecord record) {
		System.out.println("Sending email: "+record.email);
	}
}
