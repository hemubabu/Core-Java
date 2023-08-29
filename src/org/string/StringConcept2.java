package org.string;

public class StringConcept2 {
	public static void main(String[] args) {
		String S = "Automation Testing";
		char c = S.charAt(4);
		System.out.println(c);
		int indexof = S.indexOf('t');
		System.out.println(indexof);
		String substring = S.substring(6,12);
		System.out.println(substring);
		String[] split = S.split(" ");
		System.out.println(split[1]);
		String s = S.replace('s', 'x');
		System.out.println(s);
		String T = "Automation Texting";
		String U = "Automation Texting";
		System.out.println(System.identityHashCode(T));
		System.out.println(System.identityHashCode(U));
		String SB = new String("Hemanth");
		String SB1 = new String("Hemanth");
		System.out.println(System.identityHashCode(SB));
		System.out.println(System.identityHashCode(SB1));
		String se = SB+"Babu";
		System.out.println(se);



	}
	

}
