import java.util.Scanner;

public class ArithmeticOperations {

	public static void main(String[] args) {
		
		
		int divide=divideNumbers();
		int multiply=multiplyNumbers();
		int subtraction=subtractNumbers();
		int remainder=findRemainderNumbers();
		System.out.println("Division of two numbers: "+divide);
		System.out.println("Multiplication of two numbers: "+multiply);
		System.out.println("Subtraction of two numbers: "+subtraction);
		System.out.println("Remainder of two numbers: "+remainder);
	}

	private static int findRemainderNumbers() {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter two numbers to find remainder");
		System.out.println("Enter the first number:");
		int num1=read.nextInt();
		System.out.println("Enter the second number:");
		int num2=read.nextInt();
		return num1%num2;
	}

	private static int subtractNumbers() {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter two numbers to subtract");
		System.out.println("Enter the first number:");
		int num1=read.nextInt();
		System.out.println("Enter the second number:");
		int num2=read.nextInt();
		return num1-num2;
	}

	private static int multiplyNumbers() {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter two numbers to multiply");
		System.out.println("Enter the first number:");
		int num1=read.nextInt();
		System.out.println("Enter the second number:");
		int num2=read.nextInt();
		return num1*num2;
	}

	private static int divideNumbers() {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter two numbers to divide");
		System.out.println("Enter the first number:");
		int num1=read.nextInt();
		System.out.println("Enter the second number:");
		int num2=read.nextInt();
		return num1/num2;
	}

}
