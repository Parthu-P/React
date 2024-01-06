package com.parthu.practice;

public class PassByValueDemo {

	public static void main(String[] args) {
		
		// Pass By Value

		int number = 25;
		System.out.println("Before " + number);
		display(number);
		System.out.println("After " + number);
		System.out.println("=====================================");

		// Pass by Reference
		
		int[] values = { 123, 1245 };
		System.out.println("Before " + values[0]);
		displayArray(values);
		System.out.println("After " + values[0]);
	}

	private static void displayArray(int[] value) {
		value[0] = 100;
		System.out.println("Inside " + value[0]);
	}

	private static void display(int num) {
		num = 100;
		System.out.println("Inside " + num);
	}

}
