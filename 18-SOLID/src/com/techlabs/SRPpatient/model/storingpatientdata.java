package com.techlabs.SRPpatient.model;

public class storingpatientdata {

	public void data(PatientRecord record) {
		System.out.println("Storing patient records: "+record.patientId+ " "+record.name+" "+ record.age);
	}
}
