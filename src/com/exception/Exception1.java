package com.exception;

import java.util.Scanner;

public class Exception1 {
	public static void main(String[] args) throws Exception {
		try {
			System.out.println(4/0);
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		finally {
			System.out.println("Hemanthbabu");
		}
		System.out.println("Code Finished");
		
		String s="7";
		int i=Integer.parseInt(s);
		System.out.println(i);
		String s1=String.valueOf(i);
		//System.out.println(s1);
		
		
	}


}
