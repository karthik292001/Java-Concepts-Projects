//Java program to calculate galactic arithmetic
import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter first number:");
		long num1=scan.nextLong();
		System.out.println("Enter second number:");
		long num2=scan.nextLong();
		long total=galacticAddition(num1,num2);
		System.out.println("Sum is: "+total);
		scan.close();
	}
// Method to calculate sum of two numbers
	private static long galacticAddition(long num1, long num2) {
		return num1+num2;
	}

}
