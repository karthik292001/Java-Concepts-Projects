package com.kn.encapsulation;

public class ClassRoomDemo {

	public static void main(String[] args) {
		ClassRoom c1=new ClassRoom(20);
		System.out.println("Classroom temperature = "+c1.getTemperature());
		c1.setTemperature(29);
		c1.setTemperature(23);
		System.out.println("classroom temperature = "+c1.getTemperature());
	}

}
