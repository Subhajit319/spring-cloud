package com.example.java.practice.mydemoproject.service;

public class EmployeePojo implements Comparable<EmployeePojo> {
	private String name;
	private int Salary;
	private int age;
	private String gender;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public EmployeePojo(String name, int salary, int age, String gender) {
		
		this.name = name;
		Salary = salary;
		this.age = age;
		this.gender = gender;
	}
	public EmployeePojo() {
		
	}
	@Override
	public String toString() {
		return "EmployeePojo [name=" + name + ", Salary=" + Salary + ", age=" + age + ", gender=" + gender + "]";
	}
	
	@Override
	public int compareTo(EmployeePojo o) {
		return this.getAge()- o.getAge();
	}
	
	
	
	
	
	
	
	
	
	

}
