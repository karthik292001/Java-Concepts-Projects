package com.kn.multithreadenvironment;

public class PrintNumbers extends Thread{

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Number = "+i);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
