package com.logical.programming;

public class ListIterationDemo {
	static int index;

	public static void main(String[] args) {
		int[] arr = { 1, 23, 34, 56, 67, 78, 98, 9, 7, 6, 5, 678 };
		int repeat = 3;
		for (int i = 0; i < arr.length * repeat; i++) {
			index = i % arr.length;
			System.out.print(arr[index] + " ");
			if (i == arr.length) {
				System.out.println();
			}
		}
	}

}
