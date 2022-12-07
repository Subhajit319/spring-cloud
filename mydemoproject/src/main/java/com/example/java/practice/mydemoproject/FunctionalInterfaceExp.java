package com.example.java.practice.mydemoproject;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.example.java.practice.mydemoproject.entity.Employee;

public class FunctionalInterfaceExp {
	

	public static void main(String[] args) {
		
		Predicate<String> predicateFunc=t->t.length()>5;
		
		System.out.println(predicateFunc.test("Ram"));
		System.out.println(predicateFunc.test("Subhajit"));
		
		Function<Integer,Integer> function=t->t*5;
		
		System.out.println(function.apply(6));
		
		Supplier<Integer> supplier=()->5;
		
		System.out.println(supplier.get());
		
		Employee emp=new Employee();
		Consumer<Employee> consumer=p->p.setEmpName("Subhajit");
		consumer.accept(emp);
		System.out.println((emp.getEmpName()));
		
		
		String [] words=new String[10];
		
		
	
		
		
		Optional<String> checkNull=Optional.ofNullable(words[5]);
		if(checkNull.isPresent()) {
			
			String word=words[5].toLowerCase();
			System.out.println(word);
			
		}else {
			
			System.out.println("word is null");
		}
	}

}
