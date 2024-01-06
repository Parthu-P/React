package com.parthu;

import java.util.Scanner;

public class SumOfDigits {

	public static int getIteration(int num) {
		int sum=0;
		int rem;
		int count=0;
		while(num>0) {
			rem=num%10;
			sum =sum+rem;
			num=num/10;
			count++;
		}
		return 0;
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System .in);
		System.out.println("enter number");
		int num = sc.nextInt();
		getIteration(num);
		
	}

}
