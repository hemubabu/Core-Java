package org.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapConcept2 {
	public static void main(String[] args) {
		
		Map<String,Integer> M = new LinkedHashMap<>();
		M.put("Hemanth",98);
		M.put("Babu",97);
		M.put("Hema",99);
		M.put("Chandru",95);
		M.put("Chandru",87);
		boolean b = M.containsKey("Chandru");
		System.out.println(b);
		System.out.println(M.get("Hemanth"));
		Set<String> key = M.keySet();
		Collection<Integer> values=M.values();
		System.out.println(key);
		System.out.println(values);
		Set<Entry<String,Integer>> E= M.entrySet();
		for(Entry<String,Integer> X:E) {
			System.out.println(X);
			System.out.println(X.getKey());
			System.out.println(X.getValue());
		}
		
		
		
	}

}
