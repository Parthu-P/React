package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(101, "John");
		map.put(102, "Lin");
		map.put(103, "Kinny");
		
		System.out.println(map);
		
		System.out.println(map.size());
		System.out.println(map.containsKey(101));
		System.out.println(map.get(101));

		Set<Integer> keySet = map.keySet();
		for(Integer key:keySet) {
			System.out.println(key+"==="+map.get(key));
		}
		
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		for(Entry<Integer, String>entry:entrySet) {
			System.out.println(entry.getKey()+"++++++++++"+entry.getValue());
		}
		map.clear();
		System.out.println(map.size());
	}

}
