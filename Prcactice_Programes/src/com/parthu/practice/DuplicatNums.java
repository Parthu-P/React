package com.parthu.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatNums {
	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		Collections.addAll(al, 8,9,8,9,4,6,7,1,3);
		Set<Integer> set=new HashSet<>();
		List<Integer> duplicate = al.stream().filter(i->!set.add(i)).collect(Collectors.toList());
		System.out.println(duplicate);
	}
}
