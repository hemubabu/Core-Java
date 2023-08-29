package org.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListConcept {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(85);
		l1.add(56);
		l1.add(57);
		l1.add(89);
		l1.add(89);
		l1.add(58);
		l1.add(3023);
		l1.add(87);
		
		
		System.out.println(l1);
		boolean B1 = l1.contains(58);
		System.out.println(B1);
		l1.remove(0);
		List<Integer> subList = l1.subList(0,4);
		System.out.println(subList);
		l1.set(0, 65); // to replace the value in particular index
		
		Set<Integer> s1 = new HashSet<>();
		s1.addAll(l1);
		System.out.println(s1);
		
		
		
		
		List <Integer> l2 = new ArrayList<>();
		l2.addAll(l1);
		System.out.println(l2);
		int value = l2.get(0);
		System.out.println(value);
		boolean B2 = l2.containsAll(l1);
		System.out.println(B2);
		for(int i=0;i<4;i++) {
			int l2value = l2.get(i);
			System.out.println(l2value);
		}
		
	
		}
	}
		


