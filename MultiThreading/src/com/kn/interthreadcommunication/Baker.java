package com.kn.interthreadcommunication;

public class Baker implements Runnable{
	
	PizzaHut ph;
	int num=0;
	
	public Baker(PizzaHut ph) {
		this.ph = ph;
	}


	@Override
	public void run() {
		while(true) {
			ph.bake(num++);
		}
	}
	
}
