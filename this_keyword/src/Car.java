import java.util.Scanner;

public class Car {
	String manufacture;
	String model;
	double price;
	
	void drive() {
		System.out.println("Driving");
	}
	void honk(){
		System.out.println("Honking");
	}
	
	Car(String manufacture, String model,double price){
		this.manufacture=manufacture;
		this.model=model;
		this.price=price;
	}
}


