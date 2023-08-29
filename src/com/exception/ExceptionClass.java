package com.exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionClass {
	public static void main(String[] args) {
		int [] a = new int [2];
		try {
			System.out.println(a[3]);
		}
	
		
		catch (Exception e){ 
			System.out.println(e.toString());
			System.out.println(0);	
		}
		
			
		
		finally {
			System.out.println("Answer is 0 ");
		}
		
		Scanner Sc = new Scanner(System.in);
		byte b = Sc.nextByte();
		System.out.println(b);
		List<Integer> li = new ArrayList<>();
		li.add(0,89);
		li.add(1, 77);
		System.out.println(li.get(2));
		
		
		 String s = null;
		 char C = s.charAt(1);
		 System.out.println(C);

		
		 String S  = "h123456";
		  int i = Integer.parseInt(S);
		 System.out.println(i);
	}

}
