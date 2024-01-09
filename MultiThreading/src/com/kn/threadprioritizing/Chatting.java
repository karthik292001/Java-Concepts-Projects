package com.kn.threadprioritizing;

public class Chatting extends Thread{

	@Override
	public void run() {
		try {
			System.out.println("Chatting started");
			Thread.sleep(2000);
			System.out.println("Chatting fully");
			Thread.sleep(2000);
			System.out.println("Chatting ended");
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			
		}
	}
	

}
