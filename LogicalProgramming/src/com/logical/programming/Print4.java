package com.logical.programming;

public class Print4 {

	public static void main(String[] args) {

		int count=1;
		while(count<=15) {
			System.out.println(count%2==0?"####":"+++");
			count++;
		}
	}

}
