package com.kn.threadprioritizing;

public class ThreadPrioritizing {

	public static void main(String[] args) {
		System.out.println("======>Instagram application started");
		Chatting chat=new Chatting();
		Reels reel=new Reels();
		
		chat.start();
		reel.start();
		
/*		When main method thread encounters another thread with join(method), then it waits 
		for execution of that particular thread */
		
//		all versions of join throws interrupted exception
		
		try {
			chat.join();              //  waits till completion of thread execution
//			chat.join(1000);          join(long millis); -->  waits for specified milliseconds 
//			chat.join(1000, 10);    join(long millis,int nanos);--> waits for specified milliseconds and nanoseconds
			reel.join();
		}
		catch(InterruptedException e) {
			
		}
		System.out.println("====>Instagram application closed");
	}

}
