package com.kn.threadprioritizing;

public class Reels extends Thread{

	@Override
	public void run() {
		try {
			System.out.println("Reels creating");
			Thread.sleep(2000);
			System.out.println("Reels uploaded");
			Thread.sleep(2000);
			System.out.println("Reels shared");
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			
		}
	}
	

}
