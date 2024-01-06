package com.parthu;

public class singletoneDemo1 extends Thread {

	static singletoneDemo1 s = null;

	public static void main(String[] args) {

		singletoneDemo1 t1 = new singletoneDemo1();
		singletoneDemo1 t2 = new singletoneDemo1();
		t1.start();
		t2.start();
		singletoneDemo1 t3 = new singletoneDemo1();
		singletoneDemo1 t4 = new singletoneDemo1();
		t3.start();
		t4.start();
	}

	@Override
	public void run() {
		try {
			singletoneDemo1 s1 = singletoneDemo1.getInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		super.run();
	}

	static singletoneDemo1 getInstance() {
		System.out.println(Thread.currentThread());

		if (s == null) {
			synchronized (singletoneDemo1.class) {
				if (s == null) {
					s = new singletoneDemo1();
					  System.out.println(Thread.currentThread()+" excuted");
				}
			}

		}

		return null;
	}

}
