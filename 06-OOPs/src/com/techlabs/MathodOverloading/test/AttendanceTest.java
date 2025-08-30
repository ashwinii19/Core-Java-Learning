package com.techlabs.MathodOverloading.test;

import com.techlabs.MathodOverloading.model.Attendance;

public class AttendanceTest {

	public static void main(String[] args) {
		
		Attendance attendance = new Attendance();
		
		attendance .markAttendance();
		attendance.markAttendance("Ashwini");
		String[] names = {"Durgesh","Yash","Jaya"};
		attendance.markAttendance(names);
	}
}
