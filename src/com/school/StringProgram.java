package com.school;

public class StringProgram {
	public static void main(String[] args) {
		String  S = "a1b2c3q1";
		StringBuilder out = new StringBuilder();
		for(int i=0;i<S.length();i++) {
			char c = S.charAt(i);
			if(Character.isLetter(c)) {
				out.append(c); // a, ab
			}
			else if(Character.isDigit(c)){
				int count = Character.getNumericValue(c); //1 // 2
				char lastchar = out.charAt(out.length()-1); // a // b
				for(int j=0;j<count-1;j++) {
					out.append(lastchar);
				}
			}
			
			
				
					}
		System.out.println(out);
		
	}

}
