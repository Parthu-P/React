package com.parthu;

public class StringReverse {

	public static void main(String[] args) {

		String str="This is string reverse programe";
		String rev=" ";
		for(int i=str.length()-1;i>=0;i--) {
			char charAt = str.charAt(i);
			rev=rev+charAt;
		}
		System.out.println(rev);
	}

}
