package com.school;

import java.util.*;

public class Practice {
	
	public static void main(String[] args) {
		String S = "Hemanthbabu is a good boy good is";
		String[] S1 = S.split(" ");
		String output="";
	
		Map<String,Integer>	M = new LinkedHashMap<>();
		for(int i=0;i<S1.length;i++) {
			String reverse = "";
			String S2 = S1[i];
			for(int j=S2.length()-1;j>=0;j--) {
				char ch = S2.charAt(j);
				reverse = reverse+ch;
			}
			output = output+reverse+" ";
			System.out.println(reverse);
			
		}
		
		System.out.println(output);
		
     
    }

}
