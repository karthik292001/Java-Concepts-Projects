package com.kn.interthreadcommunication;

public class PizzaHutDemo {

	public static void main(String[] args) {
		PizzaHut ph=new PizzaHut();
		
		Baker bake=new Baker(ph);
		Customer consume=new Customer(ph);
		
		Thread t1=new Thread(bake);
		Thread t2=new Thread(consume);
		
		t1.start();
		t2.start();
		
	}

}
