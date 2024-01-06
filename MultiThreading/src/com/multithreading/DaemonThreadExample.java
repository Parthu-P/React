package com.multithreading;

public class DaemonThreadExample implements Runnable {

	public static void main(String[] args) {

		DaemonThreadExample dt = new DaemonThreadExample();
		dt.printNum2();
		Thread t1 = new Thread(dt);
		//t1.setDaemon(true);//set Daemon
		t1.start();
	}

	@Override
	public void run() {
		printNum1();
	}

	public void printNum1() {
		for (int i = 1; i <= 20; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "=>" + i);
		}
	}

	public void printNum2() {
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
