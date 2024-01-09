import java.util.Scanner;

public class Orderbill {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the chai flavour");
		String flavour = scan.nextLine();
		System.out.println("Enter the chai quantity");
		int quantity = scan.nextInt();
		orderchai();
		orderchai(flavour);
		orderchai(flavour, quantity);
		orderchai(quantity);
		scan.close();
	}

	private static void orderchai(int quantity) {
		System.out.println("Bill for " + quantity + " cups is:" + (quantity * 10.0));
	}

	private static void orderchai(String flavour, int quantity) {
		System.out.println("Bill for " + flavour + " chai of " + quantity + " cups is:" + (quantity * 15.0));
	}

	private static void orderchai(String flavour) {
		System.out.println("Bill for " + flavour + " chai is:15.0");
	}

	private static void orderchai() {
		System.out.println("Bill for chai is: 10.0");
	}

}

//import java.util.Scanner;
//
//public class Orderbill {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter the chai quantity");
//		int quantity=scan.nextInt();
//		double bill = orderbill(quantity);
//		System.out.println("Bill is:"+bill);
//	}
//
//	private static double orderbill(int quantity) {
//		return quantity*10.0;
//	}
//
//	
//}
