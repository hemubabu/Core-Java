package com.constructor;

public class Cons extends Cons2 {
	int i;
	int j;
	double k;
	public Cons() {
		this(100);
		System.out.println("DefaultConstructor");
	}
	public Cons(int num1) {
		this(152,5624824.44456893);
		j = 5;
		i = num1+j;
		System.out.println(num1+j);
		System.out.println("Parameterized Constructor");
		
		}
	public Cons(int num2,double num3) {
		super(15);
		k =  num2 + num3;
		System.out.println(k);
		System.out.println("Parametrized Constructor with two date type");
		
	}
	public static void main(String[] args) {
		Cons C = new Cons();
	}

}
