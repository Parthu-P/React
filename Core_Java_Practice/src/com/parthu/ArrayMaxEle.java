package com.parthu;

public class ArrayMaxEle {

	public static void main(String[] args) {

		int [] arr= {12,3,2,4,3,5,4,6};
		ArrayMaxEle ele = new ArrayMaxEle();
		ele.maxElement(arr);
	}
	
	public void maxElement(int [] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
