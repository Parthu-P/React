
package com.logical.programming;

import java.util.Scanner;

public class LeadersArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Elements");
		int n = sc.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i <n; i++) {
			arr[i] = sc.nextInt();
		}
		findLeaders(arr,n);
		sc.close();
	}
	public static void findLeaders(int arr[], int n) {
		boolean flag=false;
		int num=0;
		for(int i=0;i<n;i++) {
			num=arr[i];//23
			for(int j=i+1;j<n;j++) {//3  3<7
				if(arr[i]>arr[j]) {//23>15
					flag=true;
				}else {
					flag=false;
					break;
				}
			}
			if(flag==true)
				System.out.println(num+" ");
		}
		System.out.println(arr[n-1]);
	}

}
