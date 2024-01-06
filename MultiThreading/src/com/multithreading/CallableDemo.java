package com.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableDemo implements Callable<Object>{
	int count=1;
	@Override
	public Object call() throws Exception {
		System.out.println("call() started......"+count);
		count++;
		return " ";
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		CallableDemo cd = new CallableDemo();
		ExecutorService es =Executors.newFixedThreadPool(1);
		for(int i=0;i<=100;i++) {
			Future<Object> submit = es.submit(cd);
			if(i==7) {
				es.awaitTermination(7, TimeUnit.SECONDS);
			}
			System.out.println(submit.get().toString());
		}
		es.shutdown();
		
	}

	

}
