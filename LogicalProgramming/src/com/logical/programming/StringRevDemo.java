package com.logical.programming;

import java.util.Scanner;

public class StringRevDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String nextLine = sc.nextLine();
		revString(nextLine);
		sc.close();
	}

	private static void revString(String nextLine) {
		String[] split = nextLine.split(" ");
		for(int i=0;i<split.length;i++) {
			char[] charArray = split[i].toCharArray();
			for(int j=charArray.length-1;j>=0;j--) {
				System.out.print(charArray[j]);
			}
			System.out.print(" ");
		}
	}

}
