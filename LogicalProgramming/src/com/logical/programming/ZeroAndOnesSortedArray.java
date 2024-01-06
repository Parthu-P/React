package com.logical.programming;

public class ZeroAndOnesSortedArray {

	public static void main(String[] args) {

		int count=0;
		int[] ar1= {0,1,0,0,1,0,1,0,0,1};
		int[] ar2=new int[ar1.length];
		for(int i=0;i<ar1.length;i++) {
			if(ar1[i]==0) {
				ar2[i]=ar1[i];
				count++;
			}
		}
		for(int i=0;i<count;i++) {
				ar2[i]=0;
		}
		for(int i=count;i<ar1.length;i++) {
			ar2[i]=1;
		}
		for(int array:ar2) {
			System.out.print(array+" ");
		}
	}

}
