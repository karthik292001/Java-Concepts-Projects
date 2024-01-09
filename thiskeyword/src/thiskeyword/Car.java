package thiskeyword;

public class Car {
	String manf;
	String model;
	double price;

	void drive() {
		System.out.println("Driving");
	}

	void honk() {
		System.out.println("Honking");
	}

	Car(String manf, String model, double price) {
		this.manf = manf;
		this.model = model;
		this.price = price;
	}
}
