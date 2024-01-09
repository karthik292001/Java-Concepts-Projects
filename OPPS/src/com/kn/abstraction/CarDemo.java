package com.kn.abstraction;

public class CarDemo {

	public static void main(String[] args) {
		ElectricCar ec=new ElectricCar();
		DieselCar dc=new DieselCar();
		PetrolCar pc=new PetrolCar();
		
		Vehicle v=new Vehicle();
		v.doActivity(ec);
		v.doActivity(dc);
		v.doActivity(pc);
		
	}

}
