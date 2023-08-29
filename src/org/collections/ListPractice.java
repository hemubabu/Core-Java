package org.collections;

import java.util.*;

public class ListPractice {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(56);
		l1.add(56);
		l1.add(89);
		l1.add(89);
		l1.add(58);
		l1.add(3023);
		l1.add(87);
		Set<Integer>S = new LinkedHashSet<>();
		S.addAll(l1);
		System.out.println(l1);
		System.out.println(S);
		//for(WrapperClassdatatype X:S)
		for(Integer X:l1){
			System.out.println(X);
		}
		boolean b =S.isEmpty();
		System.out.println(b);		
	}

}
