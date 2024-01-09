import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String manufacture;
		String model;
		double price;
		System.out.println("Enter the manufacturer");
		manufacture=scan.nextLine();
		System.out.println("Enter the model");
		model=scan.nextLine();
		System.out.println("Enter the price");
		price=scan.nextDouble();
		Car c1= new Car(manufacture, model, price);
		System.out.println("Manufacturer:" + c1.manufacture + ", Model:" + c1.model + ", Price:" + c1.price);
		c1.drive();
		c1.honk();
		
		System.out.println("Enter the manufacturer");
		manufacture=scan.nextLine();
		manufacture=scan.nextLine();
		System.out.println("Enter the model");
		model=scan.nextLine();
		System.out.println("Enter the price");
		price=scan.nextDouble();
		Car c2= new Car(manufacture, model, price);
		System.out.println("Manufacturer:" + c2.manufacture + ", Model:" + c2.model + ", Price:" + c2.price);
		c2.drive();
		c2.honk();
	}
	
}
