package com.kn.daemonthreads;

public class Compilation extends Thread {
	public void run() {
		try {
			for(;;) {
				System.out.println("------>Compiling code");
				Thread.sleep(2000);
			}
			
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
