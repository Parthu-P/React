package com.parthu.practice;

import java.util.HashSet;

public class StringDemo {

	public static void main(String[] args) {

		String str = "parthasaradhi";
		String str1 = "";
		HashSet<Character> set = new HashSet();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					set.add(str.charAt(i));
				}
			}
		}
		StringBuffer s = new StringBuffer();
		for (Character c : set) {
			s.append(Character.toString(c));
		}
		System.out.println(set);
		System.out.println(s);
	}

}
