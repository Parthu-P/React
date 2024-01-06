package com.parthu.practice;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {
		TreeMap<String, String> m= new TreeMap<>();
		m.put("Aradhya", "Hyd");
		m.put("Krithi", "Bang");
		m.put("Sanjana", "Chennai");
		m.put("Adhya", "Delhi");
		Set<Entry<String, String>> set = m.entrySet();
		set.stream().sorted(Map.Entry.comparingByKey()).forEach(i->System.out.println(i.getKey()+" "+i.getValue()));
		
	}

}
