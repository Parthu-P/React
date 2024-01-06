package com.parthu;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		getPattern(n);
		sc.close();
	}

	public static void getPattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int space = n; space >= 1; i--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
