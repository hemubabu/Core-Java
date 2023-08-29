package org.string;

public class StringConcept3 {
	public static void main(String[] args) {
		String S = "HemanthBabu";//index to n-1
		String S1 = "Lokesh";
		String Merge = S+S1; 
		System.out.println(Merge);
		int length = S.length();
		System.out.println(length);
		String upper = S.toUpperCase();
		String lower = S.toLowerCase();
		System.out.println(upper);
		System.out.println(lower);
		int index = S.indexOf('e');
		System.out.println(index);
		char c = S.charAt(4);
		System.out.println(c);
		String N = "Hem\nbabu";//new line(\n)
		System.out.println(N);
		boolean B = S.equals("hemanthbabu");
		System.out.println(B);	
		boolean b = S.equalsIgnoreCase("hemanthbabu");
		System.out.println(b);
		boolean b1 = S.contains(S1);
		System.out.println(b1);
		boolean b2 = S.contains("Babu");
		System.out.println(b2);
		boolean b3 = S.startsWith("Hem");
		System.out.println(b3);
		String L = "Lokesh ";
		String trim = L.trim();
		System.out.println(trim);
		int l = L.length();
		System.out.println(l);
		char cl = L.charAt(2);
		System.out.println(cl);
		String s = "SureshBabu";
		String s1 = s.substring(4,9);
		System.out.println(s1);
		String m ="mom";
		String m1 = "dad";
		String m2 = m.concat(m1);
		System.out.println(m2);
		String F = "Hemanth Lokesh Suresh Sujatha";
		String[] f = F.split(" ");
		System.out.println(f[1]);
		System.out.println(f[2]);
		
		
				
		

	}

}
