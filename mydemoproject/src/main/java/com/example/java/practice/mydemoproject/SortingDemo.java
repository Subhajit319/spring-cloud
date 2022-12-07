package com.example.java.practice.mydemoproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

import com.example.java.practice.mydemoproject.service.EmployeePojo;

public class SortingDemo {
	


	public static void main(String[] args) {
		
		int temp=0;
		int [] number=new int[]{1,2,3,4,7,28,98,4,38,43,32};		
		
		  Arrays.sort(number);
		  
		  for(int i=0;i<number.length;i++) {
		  
		  
		  
		  }		 
		
	for(int i=0;i<number.length;i++) {		
		for (int j = i + 1; j < number.length; j++) {

			if (number[i] < number[j]) {

				temp = number[i];
				number[i] = number[j];
				number[j] = temp;

			}
			
		}
		
		System.out.println(number[i]);
	}
		
	List<Integer> maxNumber=Arrays.asList(1,2,3,4,7,28,98,4,38,43,32);
	
	int max=maxNumber.stream().mapToInt(v->v).max().orElseThrow(NoSuchElementException ::new);
	int numbers=maxNumber.stream().reduce(0, Integer::sum);	
	System.out.println("Sum" + numbers);
	

	List<EmployeePojo> empList=new ArrayList<>();	
	
	empList.add(new EmployeePojo("John",30000,29,"M"));
	empList.add(new EmployeePojo("John",30000,28,"F"));
	empList.add(new EmployeePojo("Tery",50000,68,"M"));
	empList.add(new EmployeePojo("Lamp",550000,20,"M"));
	empList.add(new EmployeePojo("Asle",60000,58,"F"));
	empList.add(new EmployeePojo("Tony",70000,48,"F"));
	
	Collections.sort(empList);
	
	System.out.println("After Sorting  " + empList);
	
	
	
	}

}
