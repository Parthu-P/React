package com.logical.programming;

import java.util.Scanner;

public class PatternDemo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int N = sc.nextInt();
		System.out.println("Enter Number");
		int M = sc.nextInt();
		getPattern(N,M);
	}
	public static int getPattern(int N,int M) {
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("* ");
			}
		}
		System.out.println();
		return M;
	}

}
