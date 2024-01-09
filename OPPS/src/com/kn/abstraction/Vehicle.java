package com.kn.abstraction;

public class Vehicle {
	public void doActivity(Car c) {
		c.start();
		c.stop();
		c.refuel();
	}
}
