package com.school;
import java.util.HashMap;
import java.util.Map;

import org.student.StudentDetails;

public class Data {
	
	public static void main(String[] args) {
		String S = "ISHRAQHULLAH";
		char[] c = S.toCharArray();
		System.out.println(c);
		Map<Character,Integer> MP = new HashMap<>();
		for(char ch:c) {
			if(MP.containsKey(ch)) {
				Integer i = MP.get(ch);
				MP.put(ch, i+1);
				
			}
			else {
				MP.put(ch,1);
			}
		}
		System.out.println(MP);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int length = S.length();
//		System.out.println(length);
//		for(int i=length-1; i>=0;i--) {
//			char c = S	.charAt(i);
//			System.out.println(c);
//		}
	}
}
