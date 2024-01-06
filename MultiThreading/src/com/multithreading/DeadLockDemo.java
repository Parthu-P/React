package com.multithreading;

public class DeadLockDemo extends Thread {

	public static void main(String[] args) {

		String s1 = "Resource-1";
		String s2 = "Resource-2";

		Thread t1 = new Thread() {
			public void run() {
				synchronized (s1) {
					System.out.println("locked resource-1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					synchronized (s2) {
						System.out.println("waiting for resource-2");
					}
				}
			}
		};
		Thread t2=new Thread() {
			public void run() {
				synchronized (s2) {
					System.out.println("locked resource-2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (s1) {
						System.out.println("waiting for resource-1");
					}
				}
			}
		};
		t1.start();
		t2.start();
	}

}
