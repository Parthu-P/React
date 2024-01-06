package com.logical.programming;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Characters");
		String str = sc.nextLine();
		removeDuplicateWords(str);
		sc.close();
	}

	private static void removeDuplicateWords(String str) {
		String[] arr = str.split(" ");
		Set<String> set =new LinkedHashSet<String>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		
		for(String s3:set) {
			char[] charr = s3.toCharArray();
			Set<Character> set1=new LinkedHashSet<Character>();
			for(int i=0;i<charr.length;i++) {
				set1.add(charr[i]);
			}
			for(Character cha:set1) {
				System.out.print(cha+" ");
			}
		}
		System.out.println();
		for(String s2:set) {
			System.out.println(s2+"==>"+s2.length());
		}
		for(String s1:set) {
			System.out.print(s1+" ");
		}
		
		System.out.println();
		for(String s:set) {
			StringBuilder sb=new StringBuilder(s);
			System.out.print(sb.reverse()+" ");
		}
	}

}
