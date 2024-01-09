package com.kn.runnableinterface;

public class PrintCharacters implements Runnable{

	@Override
	public void run() {
		for(int i=65;i<=69;i++) {
			System.out.println("Character = "+(char)i);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
		
}
