package com.datatypes;

public class DataTypes {
	public static void main(String[] args) {
		// 1 byte = 8bit  [n=8bit]
		// (-)2^n-1 to (2^n-1)-1	
		byte b = 127;
		System.out.println(b);
		short s = 8564; // size=2 (i.e)2*8
		System.out.println(s);
		int i = 233131313; // size=4
		System.out.println(i);
		long l = 3231664331366l;  // size=8
		System.out.println(l);
		float f = 856.45f;
		System.out.println(f);
		double d = 2664613.61464946131f;
		System.out.println(d);
		char c = 'H';
		System.out.println(c);
		String st = "hem8072861*";
		System.out.println(st);
		boolean bo = true;
		System.out.println(bo);
		Object O = "hemanth"; // It is a superclass.
		//(i.e)It supports all the data types
		System.out.println(O);
		
	}

}
