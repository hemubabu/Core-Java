package org.string;

public class StringConcept {
	
	public static void main(String[] args) {
		String s = "HemanthBabu";
		
		// TO FIND THE LENGTH OF THE STRING
		int l = s.length();
		System.out.println(l);
		
		// TO FIND CHARACTER IN STRING
		char CI = s.charAt(4);
		System.out.println(CI);
		
		// INDEX OF METHOD
		int indexof = s.indexOf('a');
		System.out.println(indexof);
		int lastIndexOf = s.lastIndexOf('a');
		System.out.println(lastIndexOf);
		
		// EQUALS
		boolean b = s.equals(" HemanthBabu ");
		System.out.println(b);
		
		// UPPER CASE & LOWER CASE
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		// CONTAINS
		boolean contains = s.contains("man");
		System.out.println(contains);
		
		// TO REMOVE UNWANTED LENGTH USING TRIM METHOD IN STRING
		String s1 = s.trim();
		System.out.println(s1);
		String S = "WelcometoIndia";
		char c = S.charAt(7);
		System.out.println(c);
		char c1 = S.charAt(11);
		System.out.println(c1);
		int length = S.length();
		System.out.println(length);
		
		// TO SEPERATE CHARACTERS IN STRING USING SUBSTRING METHOD
		String substring = S.substring(7,9); // end index = n-1
		System.out.println(substring);
		String SU = S.substring(9); // begin index = n
		System.out.println(SU);
		
		// TO SEPERATE STRING USING SPLIT METHOD
		String S1 = "India is my Country";
		String substring2 = S1.substring(9,19);
		System.out.println(substring2);
		String[] split =  S1.split(" "); //split works in array format & split return type is string of array
		System.out.print(split[2]);
		System.out.println(split[3]);
		
		//MERGE METHOD
		
		String A1 = "Amma";
		String A2 = A1.concat("Appa");
		System.out.println(A2);  
		// IMMUTABLE STRING (We cannot change in the value in same memory)
		 
		//MUTABLE STRING (We can change the value in same memory)
		StringBuffer SB = new StringBuffer("Sujatha");
		SB.append("Suresh");// to merge in mutable string we using append method
		System.out.println(SB);
		
		//LITERAL STRING - SAME MEMORY ADDRESS USING SAME STRING
		String S3 = "Hemanth";
		String S4 = "Hemanth";
		System.out.println(S4);
		System.out.println(System.identityHashCode(S3));
		System.out.println(System.identityHashCode(S4));
		
		// NON LITERAL STRING - DIFFERENT MEMORY ADDRESS USING SAME STRING
		String S5 = new String("Lokesh");
		String S6 = new String("Lokesh");
		System.out.println(System.identityHashCode(S5));
		System.out.println(System.identityHashCode(S6));
		 

		
		String replace = S3.replace('e', 'm');
		System.out.println(replace);
		
	}

}
