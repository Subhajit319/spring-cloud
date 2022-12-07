package com.example.java.practice.mydemoproject.api.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.java.practice.mydemoproject.service.EmployeePojo;
import com.example.java.practice.mydemoproject.service.EmployeeService;

@RestController
public class DemoController {
	
	private final Logger log=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EmployeeService employeeService;
	@GetMapping("/empDetails/{salary}")
	public List<EmployeePojo> getEmpDetails (@PathVariable("salary")int Salary){

		List<EmployeePojo> response=employeeService.getEmpDetails(Salary);

		return response;
			
	}
	
	
	

}
