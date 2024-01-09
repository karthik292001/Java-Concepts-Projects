package com.kn.exceptionhandling2;
import java.util.*;
public class ExceptionHandlingDemo {

	public static void main(String[] args) {
	    try {
			System.out.println("----->Calculator application started<-----");
			add();
			sub();
			try {
				mul();
			}
			catch(Exception e){
				System.out.println("Enter a valid input, input should be numberic digits !");
			}
			div();
	    }catch(Exception e){
		    System.out.println("----->Calculator Application terminated successfully<------");
	    }
	}
	public static void add() {
		Scanner scan=new Scanner(System.in);
		System.out.println("***Addition application started***");
		System.out.println("Enter a first number = ");
		int a=scan.nextInt();
		System.out.println("Enter a second number = ");
		int b=scan.nextInt();
		System.out.println("Addition = "+(a+b));
	}
	public static void sub() {
		Scanner scan=new Scanner(System.in);
		System.out.println("***Subtraction application started***");
		try {
			System.out.println("Enter a first number = ");
			int a=scan.nextInt();
			System.out.println("Enter a second number = ");
			int b=scan.nextInt();
			System.out.println("Subtraction = "+(a-b));
		}catch(InputMismatchException e) {
			System.out.println("Enter a valid input, input should be in numeric digits");
		}
	}
	public static void mul() throws Exception{
		Scanner scan=new Scanner(System.in);
		System.out.println("***Multiplication application started***");
		System.out.println("Enter a first number");
		int a=scan.nextInt();
		System.out.println("Enter a second number");
		int b=scan.nextInt();
		System.out.println("Multiplication = "+(a*b));
		
	}
	public static void div() throws Exception{
		Scanner scan=new Scanner(System.in);
		System.out.println("***Division application started***");
		try {
			System.out.println("Enter a numerator");
			int a=scan.nextInt();
			System.out.println("Enter a denominator");
			int b=scan.nextInt();
			System.out.println("Division = "+(a/b));
		}
		catch(InputMismatchException e) {
			System.out.println("Enter a valid input, input should be in numeric digits !");
			throw new Exception();
		}
		catch(ArithmeticException e) {
			System.out.println("Enter a valid input, denominator should not be zero !");
			throw new Exception();
		}
		
	}

}
