package com.parthu.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<List<String>> li=Arrays.asList(Arrays.asList("John"),Arrays.asList("Cam"),Arrays.asList("Martin"));
		List<String> collect = li.stream().flatMap(i->i.stream()).sorted((a,b)->{
			return a.compareTo(b);
		}).collect(Collectors.toList());
		System.out.println(collect.toString());
	}

}
