package com.kn.exceptionhandlers;

import java.util.*;
import java.util.Scanner;

public class ExceptionHandlers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		try {
			System.out.println("Enter your age = ");
			int age=scan.nextInt();
			System.out.println("Age = "+age);
			System.out.println("***********************");
			System.out.println("Enter a numerator = ");
			int a=scan.nextInt();
			System.out.println("Enter a denominator");
			int b=scan.nextInt();
			double divide=a/b;
			System.out.println("Divide = "+divide);
			System.out.println("***********************");
			int array[]=new int[5];
			System.out.println(array[0]);
			System.out.println("***********************");
			int array1[]=new int[-2];
		}
		catch(InputMismatchException e) {
			System.out.println("Enter a valid input, age should be in numeric value");
		}
		catch(ArithmeticException e) {
			System.out.println("Denominator value should not be zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Traverse array elements with valid size");
		}
		catch(Exception e) {             // To handle other exceptions, should be placed at the end
			e.printStackTrace();
		}
		System.out.println("---->THE END<-----");
		
	}

}
