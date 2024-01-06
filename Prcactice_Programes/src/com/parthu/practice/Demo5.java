package com.parthu.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Demo5 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(12,23,41,23,432,456,32,4320,567);
	    
		List<Integer> collect = list.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect);
	}

}
