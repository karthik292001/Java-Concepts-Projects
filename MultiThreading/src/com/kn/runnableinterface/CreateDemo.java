package com.kn.runnableinterface;

public class CreateDemo {

	public static void main(String[] args) {
		PrintNumbers number=new PrintNumbers();
		PrintCharacters character=new PrintCharacters();
		
		Thread t1=new Thread(number);
		Thread t2=new Thread(character);
		t1.start();
		t2.start();
	}

}
