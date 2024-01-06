package com.logical.programming;

import java.util.Arrays;

public class RecursionDemo {
	static int[] arr= {1,2,3,4,5,6,7};
	public static void main(String[] args) {
		RecursionDemo rd=new RecursionDemo();
		rd.getRecursion(arr);
	}
	public void getRecursion(int[] arr) {
		RecursionDemo rd=new RecursionDemo();
		
		for(int arr1:arr) {
			System.out.println(Arrays.toString(arr));
		}
	}
}
