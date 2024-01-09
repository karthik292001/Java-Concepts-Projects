package com.kn.crudoperations;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {
	
	@Id
	String model;
	String manufacturer;
	double cost;
	
	public Laptop() {
		super();
	}

	public Laptop(String model, String manufacturer, double cost) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.cost = cost;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getcost() {
		return cost;
	}

	public void setcost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Laptop [model=" + model + ", manufacturer=" + manufacturer + ", cost=" + cost + "]";
	}
	
	

}
