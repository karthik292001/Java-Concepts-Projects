package com.kn.hibernate1;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Car {

	@Id
	int regNumber;
	String color;
	String manufacture;
	String model;
	int maxSpeed;
	
	
	public Car() {
		super();
	}

	public Car(int regNumber, String color, String manufacture, String model, int maxSpeed) {
		super();
		this.regNumber = regNumber;
		this.color = color;
		this.manufacture = manufacture;
		this.model = model;
		this.maxSpeed = maxSpeed;
	}

	public int getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(int regNumber) {
		this.regNumber = regNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [regNumber=" + regNumber + ", color=" + color + ", manufacture=" + manufacture + ", model=" + model
				+ ", maxSpeed=" + maxSpeed + "]";
	}
	
	
	
}
