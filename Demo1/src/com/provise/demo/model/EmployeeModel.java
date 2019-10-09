package com.provise.demo.model;

import java.util.Date;

public class EmployeeModel {

	private String firstName;
	
	private String lastName;
	
	private Date DOB;
	
	private String emailAddress;

	public EmployeeModel(String firstName, String lastName,Date DOB,String emailAddress) {
		// TODO Auto-generated constructor stub
	}

	public EmployeeModel(String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
	}

	public EmployeeModel() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", DOB=" + DOB + ", emailAddress="
				+ emailAddress + "]";
	}
	
	
	
	
}
