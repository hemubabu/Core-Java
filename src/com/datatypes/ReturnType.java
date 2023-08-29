package com.datatypes;

public class ReturnType {
	public int method1() {
		int i=5;
		int j=6;
		int c = i+j;
		return c ;
		
	}
	public String method2() {
		String d = "babu";
		
		return d ;
		
	}
	public static void main(String[] args) {
		ReturnType R = new ReturnType();
		int k = R.method1();
		System.out.println(k+100);
		String E = R.method2();
		System.out.println("hemanth"+E);
		
	}

}
