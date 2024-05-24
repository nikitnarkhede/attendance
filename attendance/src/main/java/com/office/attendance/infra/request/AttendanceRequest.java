package com.office.attendance.infra.request;

import java.time.LocalDate;

public class AttendanceRequest {
	
	String employeeRef;
	LocalDate date;
	float hours;
	String task;
	public String getEmployeeRef() {
		return employeeRef;
	}
	public void setEmployeeRef(String employeeRef) {
		this.employeeRef = employeeRef;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public float getHours() {
		return hours;
	}
	public void setHours(float hours) {
		this.hours = hours;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	
	
	
}
