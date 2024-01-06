package com.parthu;

public class PrintElement {

	public static void main(String[] args) {
		int[] arr = { 1, 8, 2, 10, 78, 50, 60, 1, 22, 70, 80, 100, 99, 100 };
		int low = 1;
		int high = 100;

		for (int i = low; i <= high; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.print(i + ", ");
			}
		}
	}
}
