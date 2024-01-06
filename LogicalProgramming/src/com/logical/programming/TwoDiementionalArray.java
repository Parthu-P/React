package com.logical.programming;

import java.util.Scanner;

public class TwoDiementionalArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Elements");
		int n = sc.nextInt();
		int arr[][]=new int[3][];
		for(int i=0;i<n;i++) {
			arr[i]=new int[n];
		}
		for(int i=0;i<n;i++) {//0 1 2
			for(int j=0;j<n;j++) {
				int ele = sc.nextInt();
				arr[i][j]=ele;
			}
		}
		displayElements(arr);
		
	}

	private static void displayElements(int[][] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				sum+=arr[i][j];
				System.out.print(arr[i][j]+"  ");
			}
			System.out.print("==>"+sum);
			System.out.println();
			sum=0;
		}
		
	}

}
