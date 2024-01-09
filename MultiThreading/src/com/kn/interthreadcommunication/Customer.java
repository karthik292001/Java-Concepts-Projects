package com.kn.interthreadcommunication;

public class Customer implements Runnable{
	
	PizzaHut ph;
	
	public Customer(PizzaHut ph) {
		this.ph = ph;
	}


	@Override
	public void run() {
		while(true) {
			ph.eat();
		}
	}
	
}
