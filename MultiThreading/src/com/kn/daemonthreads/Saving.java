package com.kn.daemonthreads;

public class Saving extends Thread {
	public void run() {
		try {
			for(;;) {
				System.out.println("----->Saving code");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
