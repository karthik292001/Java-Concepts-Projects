package com.kn.springdemo;

public class Mobile {
	
	String brand;
	double cost;
	int ramSize;
	public Mobile() {
		super();
	}
	public Mobile(String brand, double cost, int ramSize) {
		super();
		this.brand = brand;
		this.cost = cost;
		this.ramSize = ramSize;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getRamSize() {
		return ramSize;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	@Override
	public String toString() {
		return "Mobile [brand=" + brand + ", cost=" + cost + ", ramSize=" + ramSize + "]";
	}
	
	

}
