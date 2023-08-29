package com.abs;

public class Interview {
	public static int method1() {
		
		return 6;
	}
	public static void main(String[] args) {
		Interview I = new Interview();
		I.method1();
		if(I.method1()==6) {
			System.out.println("Success");
		}
		
	}

}
