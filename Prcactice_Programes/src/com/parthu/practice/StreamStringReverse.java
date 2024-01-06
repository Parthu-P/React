package com.parthu.practice;

import java.util.Arrays;
import java.util.List;

public class StreamStringReverse {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,20,30,40,10000);
		long count = list.stream().mapToInt(i->i).sum();
		System.out.println(count);
	}
}
