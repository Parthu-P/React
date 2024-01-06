package com.logical.programming;

import java.util.Scanner;
public class StringLineReverse {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter charactors");
		String str = sc.nextLine();
		stringReverse(str);
		sc.close();
	}

	private static void stringReverse(String str) {
		String[] arr = str.split(" ");
		for(int i=0;i<arr.length;i++) {
			StringBuilder sb=new StringBuilder(arr[i]);
			System.out.print(sb.reverse()+" ");
		}
		
	}

}
