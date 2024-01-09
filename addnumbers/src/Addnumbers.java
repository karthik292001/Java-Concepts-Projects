//method with no parameter and return type

//public class Addnumbers {
//
//	public static void main(String[] args) {

//		addnumbers();
//
//	}
//
//	private static void addnumbers() {
//		int a=10,b=20;
//		int sum=a+b;
//		System.out.println(sum);
//		
//	}
//
//}

//method with parameter and without return type

//import java.util.Scanner;
//public class Addnumbers {
//
//	public static void main(String[] args) {
//		
//		Scanner scan= new Scanner(System.in);
//		System.out.println("enter first number");
//		int a=scan.nextInt();
//		System.out.println("enter second number");
//		int b=scan.nextInt();
//		addnumbers(a,b);
//
//	}
//	private static void addnumbers(int a, int b) {
//		int sum=a+b;
//		System.out.println(sum);
//		
//	}
//}

//method without parameter and with return type


public class Addnumbers {

	public static void main(String[] args) {
		
		int addition =addnumbers();
		System.out.println(addition);
	}
	private static int addnumbers() {
		int a=10, b=20;
		int sum=a+b;
		return sum;
		
		
	}
}
