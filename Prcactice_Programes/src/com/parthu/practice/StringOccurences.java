package com.parthu.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringOccurences {

	public static void main(String[] args) {
		String s="java developer software";
		//String[] s2 = s.split("");
		String s1 = s.replaceAll(" ", "");
		String[] s2 = s1.split("");
		char[] c = s1.toCharArray();
		Map<Character, Integer> map=new HashMap<>();
		for(Character e:c) {
			if(map.containsKey(e)) {
				map.put(e, map.get(e)+1);
			}else {
				map.put(e, 1);
			}
		}
		System.out.println(map);
		
		List<String> li = Arrays.asList(s2);
		
		li.stream().collect(Collectors.groupingBy(i->i,Collectors.counting())).forEach((i,j)->System.out.println(i+j));
		
	}

}
