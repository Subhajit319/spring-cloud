package com.example.java.practice.mydemoproject.entity;

public class Employee {
	
	private String empName;
	
	

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Employee(String empName) {
		this.empName = empName;
	}

	public Employee() {
		
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + "]";
	}
	
	
	

}
