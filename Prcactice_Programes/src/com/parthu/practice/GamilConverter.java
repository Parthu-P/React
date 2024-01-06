package com.parthu.practice;

public class GamilConverter {

	public static void main(String[] args) {

		String str="parthasaradhi1506@gmail.com";
		int first = str.indexOf("@");
		int second = str.indexOf(".");
		
		String str1="";
		for(int i=0;i<str.length();i++) {
			if(i==first||i==second||i==0||i==first-1||i==first+1||i==second-1||second<=i) {
				str1=str1+str.charAt(i);
			}else {
			str1=str1+"*";
			}
		}
		System.out.println(str1);
	}
}
