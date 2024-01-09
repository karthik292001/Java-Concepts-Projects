package com.kn.spring;

public class Laptop {
	
	int srNo;
	String brand;
	double cost;
	
	public Laptop() {
		super();
	}

	public Laptop(int srNo, String brand, double cost) {
		super();
		this.srNo = srNo;
		this.brand = brand;
		this.cost = cost;
	}

	public int getSrNo() {
		return srNo;
	}

	public void setSrNo(int srNo) {
		this.srNo = srNo;
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

	@Override
	public String toString() {
		return "Laptop [srNo=" + srNo + ", brand=" + brand + ", cost=" + cost + "]";
	}
	
	

}
