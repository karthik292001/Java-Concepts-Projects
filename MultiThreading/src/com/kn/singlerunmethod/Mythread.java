package com.kn.singlerunmethod;

public class Mythread extends Thread{

	@Override
	public void run() {
		if(Thread.currentThread().getName().equalsIgnoreCase("Number")) {
			printNumbers();
		}else if(Thread.currentThread().getName().equals("Character")) {
			printCharacters();
		}
	}
	public void printNumbers() {
		System.out.println("----> printing numbers started");
		try {
			for(int i=1;i<=10;i++) {
				System.out.println("Number = "+i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("------->Printing numbers completed");
	}
	public void printCharacters() {
		System.out.println("----> printing characters started");
		try {
			for(int i=65;i<=74;i++) {
				System.out.println("Character = "+(char)i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("------->Printing characters completed");
	}
	

}
