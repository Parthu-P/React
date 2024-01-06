package com.parthu;

public class SumOfTwoNumbers {
	
	public static void main(String[] args) {
		int[] arr= {12,8,23,5,15,6,14,123,23,45,56,6,4,3,17};
		for(int i=0;i<arr.length;i++) {
		int count=20;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==count) {
					System.out.println(arr[i]+"+"+arr[j]+"="+count);
				}
			}
		}
	}
}
