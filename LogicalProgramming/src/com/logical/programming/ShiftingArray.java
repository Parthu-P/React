package com.logical.programming;

import java.util.Arrays;
import java.util.Scanner;

public class ShiftingArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements");
		int number = sc.nextInt();
		int arr[]=new int[number];

		for(int i=0;i<=number-1;i++) {
			arr[i]=sc.nextInt();
		}
		getArray(arr);
		System.out.println(Arrays.toString(arr));
		
		getArray1(arr);
		System.out.println(Arrays.toString(arr));
		
		getBinary(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void getArray(int arr[]) {
		int temp;
		for (int i = 0; i <arr.length-1; i++) {
			temp = arr[0];
			arr[0] = arr[arr.length - 1];
			arr[arr.length - 1] = temp;
		}
	}
	
	public static void getArray1(int arr[]) {
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
	}
	public static void getBinary(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				arr[i]=0;
			}else {
				arr[i]=1;
			}
		}
	}

}
