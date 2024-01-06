package com.multithreading;
public class InterThreadDemo {

	int amount=10000;
	synchronized void withDraw(int amount) {
		System.out.println("going to withdraw");
		if(this.amount<amount) {
			System.out.println("less balance , waiting for deposit");
			try {
				wait();
			}catch(Exception e) {
				e.printStackTrace();
			}
			this.amount-=amount;
			System.out.println("withDraw completed");
		}
	}
	synchronized void deposit(int amount) {
		System.out.println("going to deposit");
		this.amount+=amount;
		System.out.println("deposit completed");
		notify();
	}
	public static void main(String[] args) {

		InterThreadDemo it =new InterThreadDemo();
		new Thread() {
			public void run() {
				it.withDraw(15000);
			}
		}.start();
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		new Thread() {
			public void run() {
				it.deposit(10000);
			}
		}.start();
	}

}
