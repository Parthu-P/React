package com.parthu.practice;

public class DeadLockDemo extends Thread {
	public static void main(String[] args) {

		String s1 = "Hi";
		String s2 = "Hello";

		Thread t1 = new Thread() {
			public void run() {
				synchronized(s1) {
					System.out.println(s1);
					try {
						Thread.sleep(1000);
					}catch(Exception e) {
						
					}
					synchronized(s2) {
						System.out.println(s2);
					}
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				synchronized(s2) {
					System.out.println(s2);
					try {
						Thread.sleep(1000);
					}catch(Exception e) {
						
					}
					synchronized(s1) {
						System.out.println(s1);
					}
				}
			}
		};
		t1.start();
		t2.start();
	}

}
