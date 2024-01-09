package thiskeyword;

public class CarApp {

	public static void main(String[] args) {
		Car c1 = new Car("Tata", "NEV", 160000.0);
		System.out.println("Manf:" + c1.manf + ", model:" + c1.model + ", price:" + c1.price);
		c1.drive();
		c1.honk();
		Car c2 = new Car("Audi", "Q8", 600000.0);
		System.out.println("Manf:" + c2.manf + ", model:" + c2.model + ", price:" + c2.price);
		c2.drive();
		c2.honk();

	}

}
