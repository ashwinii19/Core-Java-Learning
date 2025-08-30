package com.techlabs.SRPpatient.model;

public class PatientRecord {

	String name;
	int patientId;
	String email;
	int age;
	
	public PatientRecord(String name, int patientId, String email, int age) {
		super();
		this.name = name;
		this.patientId = patientId;
		this.email = email;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getPatientId() {
		return patientId;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}
	
}
