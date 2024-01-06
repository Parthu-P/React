package com.parthu;

public class NumberIteration {

	public static void main(String[] args) {
		int number = 20;
		for(int i=2;i<=number/2;i++) {
			if(number%i==0) {
				System.out.println(i);
			}
		}
	}

}
