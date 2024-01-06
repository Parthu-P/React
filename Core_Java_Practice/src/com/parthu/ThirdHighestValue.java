package com.parthu;

public class ThirdHighestValue {

	public static void main(String[] args) {
		
		int[] arr= {11,2,23,45,56,677,7,89,90,97};
		int a=0,b=0,c=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>a) {
				c=b;
				b=a;
				a=arr[i];
			}else if(arr[i]>b) {
				c=b;
				b=arr[i];
			}else if(arr[i]>c) {
				c=arr[i];
			}
		}
		System.out.println(c);
	}

}
