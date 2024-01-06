package com.parthu.practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Demo6 {
	public static void main(String[] args) {
		int[][][] matrix = { { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } },
				{ { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 0 }, { 3, 4, 2, 6, 1 }, { 2, 3, 4, 8, 0 }, { 9, 8, 7, 6, 5 } }

		};
		System.out.println("original");
		for (int s = 0; s < matrix.length; s++) {
			for (int i = 0; i < matrix[s].length; i++) {
				for (int j = 0; j < matrix[s][i].length; j++) {
					System.out.print(matrix[s][i][j] + " ");
				}
				System.out.println();
			}
			int n = matrix[s].length;
			// System.out.println(":::::"+n/2);
			int k = 0;
			if (n == 3) {
				k = n / 2;
			} else {
				k = n - 1 - 1;
			}

			System.out.println("::::::::::" + k);
			for (int i = 0; i <= k; i++) {
				for (int j = 0; j <= n / 2; j++) {
					if (i == n / 2) {
						int temp = matrix[s][i][j];
						matrix[s][i][j] = matrix[s][i][n - j - 1];
						matrix[s][i][n - j - 1] = temp;
					} else if (i == n / 2 + 1 && j == n / 2)

					{
						int temp = matrix[s][i][j];
						matrix[s][i][j] = matrix[s][i + 1][j];
						matrix[s][i + 1][j] = temp;
					}

					else if (i != n / 2 && j == n / 2) {
						int s1 = matrix[s][i][j];

						matrix[s][i][j] = matrix[s][n / 2 + 1 + i][j];
						matrix[s][n / 2 + 1 + i][j] = s1;
						System.out.println(s1);
					}
				}
			}
			System.out.println("expected");
			/*
			 * for (int l = 0; l < matrix.length; l++) {
			 * 
			 * for (int i = 0; i < matrix[l].length; i++) { for (int j = 0; j <
			 * matrix[l][i].length; j++) { System.out.print(matrix[l][i][j] + " "); }
			 * System.out.println(); } }
			 */

			for(int g=0;g<matrix.length;g++) {
				System.out.println(Arrays.toString(matrix[0]));
			}
		}
		System.out.println(Arrays.toString(matrix));
	}
}
