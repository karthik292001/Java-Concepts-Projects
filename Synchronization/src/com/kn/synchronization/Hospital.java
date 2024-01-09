package com.kn.synchronization;

public class Hospital {

	public static void main(String[] args) {
		Treatment treat=new Treatment();
		Thread tom=new Thread(treat);
		tom.setName("TOm");
		Thread jerry=new Thread(treat);
		jerry.setName("Jerry");
		tom.start();
		jerry.start();
	}

}
