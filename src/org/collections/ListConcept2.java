package org.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ListConcept2 {
	public static void main(String[] args) {
		ArrayList<Integer> AL = new ArrayList<Integer>();
		AL.add(8);
		AL.add(56);
		AL.add(89);
		AL.add(77);
		AL.add(56);
		System.out.println(AL);
		Collections.sort(AL);
		System.out.println(AL);
		Set<Integer> s = new HashSet<Integer>();
		s.addAll(AL);
		System.out.println(s);
		for(Integer b:s) {
			System.out.println(b);
		}
		boolean bo = AL.contains(s);
		System.out.println(bo);
		for(int j=0;j<=3;j++) {
			int a1 = AL.get(j);
			System.out.println(a1);
		}
		
		int a = AL.get(3);
		System.out.println(a);
		AL.set(3, 125);
		System.out.println(AL);
		for(Integer i:AL) {
			System.out.println(i);
		}
	}

}
