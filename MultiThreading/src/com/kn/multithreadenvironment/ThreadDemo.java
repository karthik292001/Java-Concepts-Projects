package com.kn.multithreadenvironment;

public class ThreadDemo {

	public static void main(String[] args) {
		PrintNumbers numbers=new PrintNumbers();
		numbers.start();
		PrintCharacters characters=new PrintCharacters();
		characters.start();
	}

}
