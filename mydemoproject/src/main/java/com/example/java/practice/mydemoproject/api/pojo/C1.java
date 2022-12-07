package com.example.java.practice.mydemoproject.api.pojo;

public class C1 {
	
	private int x;
	private C2 c2;
	
	public C1 (int x,C2 c2) {		
		this.x=x;		
		this.c2=c2;
	}
	
	public int getX() {		
		return this.x;
	}
	
	public C2 getC2() {
		
		return this.c2;
	}

}
