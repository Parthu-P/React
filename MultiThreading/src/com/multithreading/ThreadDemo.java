package com.multithreading;

import java.util.Scanner;

public class ThreadDemo extends Thread {
	public void run() {
		System.out.println("rum method excuted......");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number...");
		int nextInt = sc.nextInt();
		if (nextInt < 0)
			System.out.println("-1");
		else if (nextInt > 1000)
			System.out.println("-2");
		else
			digitSum(nextInt);
	}

	public void digitSum(int a) {
		int sum = 0;
		int count = 0;
		int rem;
		while (a > 0) {
			rem = a % 10;
			sum = sum + rem;
			a = a / 10;
			count++;
		}
		if (count == 3) {
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {

		ThreadDemo td = new ThreadDemo();
		Thread t = new Thread(td);
		t.start();

	}

}
