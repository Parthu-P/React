package com.logical.programming;

import java.util.Scanner;

public class FactorsOfGivenNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Element");
		int num = sc.nextInt();
		findFactors(num);
		findFactorials(num);
		findfirstAndLastDigitSum(num);
		checkPrime(num);
		sc.close();
	}

	private static void checkPrime(int num) {
		int count=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println(num+" is Prime");
		}
	}

	private static void findfirstAndLastDigitSum(int num) {

		int last=num%10;
		int first=0;
		
		while(num>0) {
			first=num%10;
			num/=10;
		}
		System.out.println(first+last);
	}

	private static void findFactorials(int num) {

		long factorial=1;
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;
		}
		System.out.println(factorial);
	}

	private static void findFactors(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
		
	}

}
