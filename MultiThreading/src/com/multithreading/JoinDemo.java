package com.multithreading;

public class JoinDemo {

	public static void main(String[] args) throws InterruptedException {

		Thread t1=new Thread() {
			public void run() {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t2=new Thread() {
			public void run() {
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		t1.join();//to give first priority  for execution of thread
		t1.start();
		Thread.yield();// to give equal priority are other thread also
		t2.start();
	}

}
