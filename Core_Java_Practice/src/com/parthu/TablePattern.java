package com.parthu;

public class TablePattern {

	public static void main(String[] args) {

		int n=20;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==n||j==1||i==1||i==n||i==3||j%2!=0) {
					System.out.print("  =   ");
				}
				else if(i==2) {
					System.out.print("  P   ");
				}
				else {
					System.out.print("parthu");
				}
			}
			System.out.println();
		}
		
	}

}
