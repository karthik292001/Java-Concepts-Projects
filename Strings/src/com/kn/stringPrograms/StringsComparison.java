package com.kn.stringPrograms;

import java.util.Scanner;

public class StringsComparison {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first string = ");
		String s1=scanner.next();
		System.out.println("Enter second string = ");
		String s2=scanner.next();
		int difference=s1.compareTo(s2);
		if(difference==0) {
		    System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are not equal");
		}
		scanner.close();

	}

}
