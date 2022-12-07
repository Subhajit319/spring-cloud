package com.example.java.practice.mydemoproject.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class EmployeeService {
	
	private final Logger log=LoggerFactory.getLogger(this.getClass());
	
	
	
	public List<EmployeePojo> getEmpDetails(int Salary){
		
		EmployeePojo empDetalis=new EmployeePojo();	
		List<EmployeePojo> empList=new ArrayList<>();	
		List<EmployeePojo> response=new ArrayList<>();
		
		empList.add(new EmployeePojo("John",30000,28,"M"));
		empList.add(new EmployeePojo("John",30000,28,"F"));
		empList.add(new EmployeePojo("Tery",50000,28,"M"));
		empList.add(new EmployeePojo("Lamp",550000,28,"M"));
		empList.add(new EmployeePojo("Asle",60000,28,"F"));
		empList.add(new EmployeePojo("Tony",70000,28,"F"));
		
	List<EmployeePojo> sortedList=	empList.stream().filter(emp->emp.getSalary()>Salary).collect(Collectors.toList());
	log.info("Sorted List after applying filter" + sortedList);
	
	sortedList.forEach(emp->{
		empDetalis.setName(emp.getName());
		empDetalis.setAge(emp.getAge());
		empDetalis.setSalary(emp.getSalary());
		response.add(empDetalis);
		
	});
	log.info("Final Responsr" + response);
	
	return response;
	}

}
