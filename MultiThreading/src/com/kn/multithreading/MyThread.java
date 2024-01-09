package com.kn.multithreading;

public class MyThread extends Thread{

	@Override
	public void run() {
		for(int i=101;i<=110;i++) {
			System.out.println("----->"+Thread.currentThread().getName()+" is executing "+i);
		}
	}
   
}
