package com.parthu;

public class TrianglePattern {

	public static void main(String[] args) {

		int r = 30;
		int c = 33;
		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= c; j++) {
				if (i + j == 18 || j - i == 16||i==17) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
