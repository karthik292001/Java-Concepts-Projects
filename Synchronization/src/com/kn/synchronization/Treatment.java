package com.kn.synchronization;

public class Treatment extends Thread{
//	Multiple threads execute one after the other
	@Override
	synchronized public void run() {
		String name=Thread.currentThread().getName();
		try {
			System.out.println("Treatment started = "+name);
			Thread.sleep(2000);
			System.out.println("Treatment In-progress = "+name);
			Thread.sleep(2000);
			System.out.println("Treatment completed = "+name);
			
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	

}
