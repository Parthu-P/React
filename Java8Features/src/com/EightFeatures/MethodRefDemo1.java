package com.EightFeatures;

public class MethodRefDemo1 {
	
	public void demo() {
		for(int i=1;i<=5;i++) {
		System.out.println(i+" Demo() method called.....");
		}
	}
	
	public static void main(String[] args) {
		MethodRefDemo1 mr=new MethodRefDemo1();
		Runnable r=mr::demo;
		Thread t=new Thread(r);
		t.start();
	}

}
