package com.techlabs.MathodOverloading.model;

public class Attendance {

	public void markAttendance() {
		System.out.println("Mark General Attendance");
	}
	
	public void markAttendance(String name) {
		System.out.println("Mark Attendance for "+name);
	}
	
	public void markAttendance(String[] names) {
		System.out.println("Mark Attendance for multiple Students");
		for(String name : names) {
			System.out.println("Mark Attendance for "+name);
		}
	}
}
