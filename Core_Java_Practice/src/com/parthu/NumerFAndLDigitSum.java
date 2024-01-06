package com.parthu;

public class NumerFAndLDigitSum {

	public static void main(String[] args) {
		int number= 12345;
		int lastDigit=number%10;
		int count=0;
		int firstDigit=0;
		while(number>0) {
			firstDigit=number%10;
			number/=10;
			count++;
		}
		System.out.println(firstDigit+lastDigit);

	}

}
