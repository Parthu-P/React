package com.logical.programming;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class CommonElementsArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements");
		int arr1 = sc.nextInt();
		String s1[] = new String[arr1];
		for (int i = 0; i < arr1; i++) {
			s1[i] = sc.next();
		}
		System.out.println("Enter elements");
		int arr2 = sc.nextInt();
		String s2[] = new String[arr2];
		for (int i = 0; i < arr2; i++) {
			s2[i] = sc.next();
		}
		findCommonElement(s1, s2);
		sc.close();
	}

	public static void findCommonElement(String[] s1, String[] s2) {
		Set<String> set=new LinkedHashSet<String>();
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i].equals(s2[j])) {
					set.add(s1[i]);
				}
			}
		}
		for (String s : set) {
			if (s != null)
				System.out.println(s);
		}
	}
}
