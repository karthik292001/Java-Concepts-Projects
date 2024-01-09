package com.kn.abstraction;

public abstract class Car {
	public void start() {
		System.out.println("car has started");
	}
	public void stop() {
		System.out.println("car has stopped");
	}
	abstract public void refuel();

}
