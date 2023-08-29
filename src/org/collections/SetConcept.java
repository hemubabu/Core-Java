package org.collections;

import java.util.HashSet;
import java.util.Set;

public class SetConcept {
	public static void main(String[] args) {
		Set<Integer>S=new HashSet<>();
		S.add(89);
		S.add(49);
		S.add(179);
		S.add(89);
		S.add(49);
		S.add(230);
		System.out.println(S);
		for(Integer X:S) {
			System.out.println(X);
		}
		boolean contains = S.contains(89);
		System.out.println(contains);
		Set<Integer>S1=new HashSet<>();
		S1.addAll(S);
		System.out.println(S1);
		boolean b = S1.equals(S);
		System.out.println(b);
		int size = S1.size();
		System.out.println(size);
	

	}
	

}
