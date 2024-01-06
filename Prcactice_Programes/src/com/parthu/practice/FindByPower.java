package com.parthu.practice;

import java.util.Scanner;

public class FindByPower {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int b=sc.nextInt();
		int p=sc.nextInt();
		int power=power(b, p);
		System.out.println("b : "+b+" "+" p : "+p);
		System.out.println("power : "+power);
	}
	public static int power(int b, int p) {
		int power=1;
		for(int i=1;i<=p;i++) {
			power=power*b;
		}
		return power;
	}
}
