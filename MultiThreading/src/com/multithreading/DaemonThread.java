package com.multithreading;

public class DaemonThread implements Runnable{

	public static void main(String[] args) {
		DaemonThread dt=new  DaemonThread();
		Thread t= new Thread(dt);
		t.setDaemon(true);
		t.start();
	}
	@Override
	public void run() {

		if(Thread.currentThread().isDaemon())
			System.out.println("DaemonThread");
		else
			System.out.println("is not DaemonThread");
	}

}
