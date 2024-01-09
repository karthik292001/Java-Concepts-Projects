package com.kn.multithreading;

public class CreateDemo {

	public static void main(String[] args) {
		Thread t1=new Thread();
		t1.setName("main");
		
		MyThread t2=new MyThread();
		t2.start();
		t2.setName("MyThread");
		
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+" is executing "+i+" times");
		}
	}

}
