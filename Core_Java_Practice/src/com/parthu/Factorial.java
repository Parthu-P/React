package com.parthu;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int factorial = getFactorial(n);
		System.out.println(factorial);
	}
	public static int getFactorial(int n) {
		int factorial=1;
		
		for(int i=n;i>=1;i--) {
			factorial=factorial*i;
		}
		return factorial;
	}

}
