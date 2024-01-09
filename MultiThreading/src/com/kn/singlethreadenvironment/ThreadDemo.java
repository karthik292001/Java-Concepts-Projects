package com.kn.singlethreadenvironment;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("******single thread environment*****");
		printNumbers();
		printCharacters();
	}

	private static void printCharacters() {
		System.out.println("started printing numbers");
		for(int i=1;i<=5;i++) {
			System.out.println("Number = "+i);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("stopped printing numbers");
	}

	private static void printNumbers() {
		System.out.println("started printing characters");
		for(int i=65;i<=69;i++) {
			System.out.println("character = "+(char)i);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("stopped printing characters");
	}

}
