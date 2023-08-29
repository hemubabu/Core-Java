package com.constructor;

public class Cons2 {
	
	public Cons2() {
		this(85,7895421.456987);
		System.out.println("Default Constructor");
	}
	public Cons2(int k) {
		this();
		System.out.println("Parametrized Constructor");
	}
	public Cons2(int i, double j) {
		//super(50);
		System.out.println("Double Paramterized Constructor");
		
	}
	
	public static void main(String[] args) {
		Cons2 C = new Cons2(5);
		
	}

}
