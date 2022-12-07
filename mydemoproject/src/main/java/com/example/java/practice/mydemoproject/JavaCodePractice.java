package com.example.java.practice.mydemoproject;

import com.example.java.practice.mydemoproject.api.pojo.C1;
import com.example.java.practice.mydemoproject.api.pojo.C2;

public class JavaCodePractice {
	
	int x,y;
	
	public void display(){
		System.out.println(x + " " +y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		/*C1 c1=new C1(1, new C2(1));		
		C2 c2=c1.getC2();		
		c2.setx(3);*/
		
		JavaCodePractice obj=new JavaCodePractice();
		 obj.x=20;
		 obj.y=25;
	
		obj.display();
		
		JavaCodePractice obj1=new JavaCodePractice();
		obj1.display();
		obj1.x=obj.x;
		obj1.y=obj.y;
		obj1.display();
		
		JavaCodePractice obj2=obj;
		obj2.display();
		
	}

}
