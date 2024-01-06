package com.EightFeatures;

import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamStringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str = sc.next();
		StreamStringReverse.stringReverse(str);
		sc.close();
	}
	private static void stringReverse(String str) {
		StringBuilder sb=new StringBuilder(str);
		String reverse = sb.reverse().chars()
				           .mapToObj(i->String.valueOf((char)i))
				           .collect(Collectors.joining());
		System.out.println(reverse);
	}

}
