package com.example.java.practice.mydemoproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import com.example.java.practice.mydemoproject.service.EmployeePojo;

public class MainClass {

	public static void main(String[] args) {
		
		EmployeePojo empDetalis=new EmployeePojo();	
		List<EmployeePojo> empList=new ArrayList<>();	
		List<EmployeePojo> response=new ArrayList<>();
		empList.add(new EmployeePojo("John",30000,28,"M"));
		empList.add(new EmployeePojo("John",30000,28,"F"));
		empList.add(new EmployeePojo("Tery",50000,28,"M"));
		empList.add(new EmployeePojo("Lamp",550000,28,"M"));
		empList.add(new EmployeePojo("Asle",60000,28,"F"));
		empList.add(new EmployeePojo("Tony",70000,28,"F"));
		
		//Group By male and female employee
		
		Map<String,Long>NoOfMaleFemaleList=empList.stream().collect(Collectors.groupingBy(emp->emp.getGender(),Collectors.counting()));		
		System.out.println("NoOfMaleFemaleList" + NoOfMaleFemaleList);
		
		Map<String,Double> avgAge=empList.stream().collect(Collectors.groupingBy(emp->emp.getGender(),Collectors.averagingInt(emp->emp.getAge())));
	   
		System.out.println("avgAge" + avgAge); 
	   
		
	List<EmployeePojo> sortedList=	empList.stream().filter(emp->emp.getSalary()>3000).collect(Collectors.toList());
	
	List<String> sortedName=empList.stream().map(emp->emp.getName()).distinct().collect(Collectors.toList());	
	List<String> name=empList.stream().filter(emp->emp.getSalary()>30000).map(emp->emp.getName()).collect(Collectors.toList());
	
	Map<String,Long> groupByName=empList.stream().filter(emp->emp.getSalary()>30000).collect(Collectors.groupingBy(emp->emp.getName(),Collectors.counting()));
	
	
	List<Integer> salaryDetails=empList.stream().map(emp->emp.getSalary()).collect(Collectors.toList());
	
	System.out.println("SalaryList of Employee " + salaryDetails);
	
	int maxSalary=salaryDetails.stream().mapToInt(v->v).max().orElseThrow(NoSuchElementException::new);
	
	System.out.println("maxSalary of Employee " + maxSalary);
	
	int sum=salaryDetails.stream().reduce(0, Integer::sum);
	System.out.println("sum of the salary " + sum);
	int total=empList.stream().collect(Collectors.summingInt(c->c.getSalary()));
	System.out.println("total of salary " + total);
	
	String str="acabgcbdschytioti";
	
	
	
	Map<Object,Long>duplicateList=str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));
	
	duplicateList.forEach((k,v)->{
		
		if(v==1) {
			
			
			System.out.println(k + " : " +v);
		}
		
		
	});
	String string="I am Subhajit Roy I am Subhajit Roy from habra from habra";
	
	String chars=string.toLowerCase();
	String[] strng=chars.split(" ");
	
	String string1=Arrays.stream(strng).distinct().collect(Collectors.joining(" "));
	string=Arrays.stream(string.split("\\ S+ ")).distinct().collect(Collectors.joining(" "));
	
	System.out.println("Sorted List after applying filter" + string1);
	
	
	sortedList.forEach(emp->{
		empDetalis.setName(emp.getName());
		empDetalis.setAge(emp.getAge());
		empDetalis.setSalary(emp.getSalary());
		response.add(empDetalis);
		
	});	
		
		
		
	
	}

}

