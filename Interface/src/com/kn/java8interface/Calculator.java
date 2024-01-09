package com.kn.java8interface;

public interface Calculator {
	
//	In java 8 version interface it supports new enhancements 
//	*static method ---> this method won't be inherited and no need to overridden 
//	                    it can be accessible from implemented class directly with class name 
//  *default method ---> method body would be provided and it will be inherit to all implemented class 
//					    it can be overridden in any implemented class
	
	public static void message() {
		System.out.println("This is calculator");
	}
	void add();
	void sub();
	default void mul(){
		System.out.println("Multiplication operation is not started");
	}
	
}
