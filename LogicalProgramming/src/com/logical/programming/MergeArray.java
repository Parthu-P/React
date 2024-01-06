package com.logical.programming;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements");
		int number1 = sc.nextInt();
		int arr1[] = new int[number1];
		for (int i = 0; i < number1; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter Elements");
		int number2 = sc.nextInt();
		int arr2[] = new int[number2];
		for (int i = 0; i < number2; i++) {
			arr2[i] = sc.nextInt();
		}
		mergeArray(arr1, arr2);
		sc.close();
	}

	private static void mergeArray(int[] arr1, int[] arr2) {

		int arr3[] = new int[arr1.length + arr2.length];
		int index = 0;
		for (int i = 0; i < arr1.length; i++) {
			arr3[index] = arr1[i];
			index++;
		}
		for(int j=0;j<arr2.length;j++) {
			arr3[index]=arr2[j];
			index++;
		}
		System.out.println(Arrays.toString(arr3));
	}
}
