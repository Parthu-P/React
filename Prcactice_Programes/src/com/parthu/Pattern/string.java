package com.parthu.Pattern;

public class string {
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 ,2,1}, { 4, 5, 6,2,1 }, { 7, 8, 9,2,1 },{1,2,3,4,5,6},{5,6,7,8,9,6} };
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("================");

		int n = matrix.length;
		for (int i = 0; i <= n / 2; i++) {
			for (int j = 0; j <= n / 2; j++) {
				if (i == n / 2) {
					int temp = matrix[i][j];
					matrix[i][j] = matrix[i][n - j - 1];
					matrix[i][n - j - 1] = temp;
				}
				else if(i!=n/2 && j==n/2) {
					int temp = matrix[i][j];
					matrix[i][j] = matrix[n-1][n - j - 1];
					matrix[n-1][n - j - 1] = temp;
				}
			}
		}
		for(int i=matrix.length-1;i>=0;i--) {
			for(int j=matrix.length-1;j>=0;j--) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
