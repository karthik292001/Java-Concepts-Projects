package com.kn.hibernate4;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bike {
	
	@Id
	int regNumber;
	String manufacturer;
	int cost;
	public Bike(int regNumber, String manufacturer, int cost) {
		super();
		this.regNumber = regNumber;
		this.manufacturer = manufacturer;
		this.cost = cost;
	}
	public Bike() {
		super();
	}
	public int getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(int regNumber) {
		this.regNumber = regNumber;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Bike [regNumber=" + regNumber + ", manufacturer=" + manufacturer + ", cost=" + cost + "]";
	}
	

}
