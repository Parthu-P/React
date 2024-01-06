package com.logical.programming;

public class Print3 {

	public static void main(String[] args) {

		String s="Parthu";
	    s=s+" MCA";
		String s2="Parthu";
		String s3=new String("Parthu");
		
		System.out.println(s+s2);
		
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}

}
