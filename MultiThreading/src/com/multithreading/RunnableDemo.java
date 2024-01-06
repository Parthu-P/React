package com.multithreading;

import java.util.Scanner;

public class RunnableDemo implements Runnable {

	@Override
	public void run() {
		System.out.println("run() started.......");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number....");
		int a = sc.nextInt();
		String digit = String.valueOf(a);
		int length = digit.length();
		if(length==3)
		m1(a);
		else
			System.out.println("3 digits mandatory");
	}

	public void m1(int num) {
		int sum = 0;
		int rem;
		int count = 0;
		int temp = num; // Store the original number
		while (num > 0) {
			rem = num % 10;
			sum = sum + rem * rem * rem;
			num = num / 10;
			count++;
		}
		if (sum == temp && count == 3) {
			System.out.println(temp + " is a Armstrong");
		}else {
			System.out.println(temp+" is not a ArmStrong");
		}
	}

	public static void main(String[] args) {
		RunnableDemo rd = new RunnableDemo();
		Thread t = new Thread(rd);
		t.start();
	}

}
