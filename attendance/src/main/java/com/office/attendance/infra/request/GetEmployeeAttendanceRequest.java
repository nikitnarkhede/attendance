package com.office.attendance.infra.request;

import java.time.LocalDate;

public class GetEmployeeAttendanceRequest {

	String employeeRef;
	LocalDate attendanceForDate;

	public String getEmployeeRef() {
		return employeeRef;
	}

	public void setEmployeeRef(String employeeRef) {
		this.employeeRef = employeeRef;
	}

	public LocalDate getAttendanceForDate() {
		return attendanceForDate;
	}

	public void setAttendanceForDate(LocalDate attendanceForDate) {
		this.attendanceForDate = attendanceForDate;
	}
	
	
}
