package org.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapConcept {
	public static void main(String[] args) {
		Map<Integer,String> M = new LinkedHashMap<>();
		M.put(35,"3 spot");
		M.put(49,"4 spot");
		M.put(60,"6 spot");
		M.put(89,"4 spot");
		M.put(35,"6 spot");
		M.put(230, "4 spot");
		M.put(36,"10 spot");
		//System.out.println(M);
		Set MK = M.keySet();
		//System.out.println(MK);
		Collection<String> MV = M.values();
		//System.out.println(MV);
		
		Set<Entry<Integer,String>> E = M.entrySet();
		
		for(Entry<Integer,String> X:E) {
			System.out.println(X.getKey());
			System.out.println(X.getValue());
			System.out.println(X);
		}
		Map<Integer,String>m1=new TreeMap<>();
		m1.putAll(M);
		//System.out.println(m1);
		boolean equals = m1.equals(M);
		//System.out.println(equals);
		Set<Entry<Integer,String>> E1 = m1.entrySet();
		for(Entry<Integer,String> X1:E1) {
			//System.out.println(X1);
		}

	}

}
