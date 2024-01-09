package practice;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter first number(A):");
		int a=read.nextInt();
		System.out.println("Enter second number(B):");
		int b=read.nextInt();
		System.out.println("Enter third number:(C)");
		int c=read.nextInt();
		CheckNumbers(a,b,c);
		read.close();
		
	}

	private static void CheckNumbers(int a, int b, int c) {
		if(a==b && a==c) {
			System.out.println("Given numbers are equal");
		}
		if(a>b) {
			if(a>c) {
				System.out.println("First number(A) is greater");
			}
		}
		if(b>c) {
			System.out.println("Second number(B) is greater");
		}
		else {
			System.out.println("Third number(C) is greater");
		}
	}

}
