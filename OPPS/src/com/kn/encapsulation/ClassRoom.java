package com.kn.encapsulation;

public class ClassRoom {
	private int temperature;
    
	public ClassRoom(int temperature) {
		this.temperature=temperature;
	}
	public int getTemperature() {
		return this.temperature;
	}
	public void setTemperature(int temperature) {
		if(temperature>=20&& temperature<=25) {
			this.temperature=temperature;
		}else {
			System.out.println("Invalid temperature, It should be between 20-25");
		}
	}
	
	

}
