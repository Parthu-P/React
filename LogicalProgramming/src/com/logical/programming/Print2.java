package com.logical.programming;

public class Print2 {
	static int a=10;
	static String s="asdf";

	Print2(){
		System.out.println("Constructor executed");
	}
	
	{
		System.out.println("instance block executed"+a+s);
	}
	
	static {
		System.out.println("static block executed"+a+s);
	}
	public static void main(String[] args) {

		System.out.println("main() method executed");
		
		Print2 p=new Print2();
		Print2 p1=new Print2();
		
	}

}
