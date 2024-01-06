package com.multithreading;

public class SynchronizedThread1 implements Runnable {

	@Override
	public void run() {
		m1();
	}

	public void m1() { // method level
		synchronized (this) {
			for (int i = 1; i <= 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "=>" + i);
			}
		}
	}

	public static void main(String[] args) {

		SynchronizedThread1 st = new SynchronizedThread1();
		Thread t = new Thread(st);
		t.start();

		Thread t2 = new Thread(st);
		t2.start();
	}

}
