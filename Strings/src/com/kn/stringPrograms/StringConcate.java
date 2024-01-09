package com.kn.stringPrograms;

import java.util.Scanner;

public class StringConcate {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a first string");
		String s1=scanner.next();
		System.out.println("Enter a second string");
		String s2=scanner.next();
		System.out.println("Enter a second string");
		String s3=scanner.next();
		System.out.println("Resultant string after concating all strings = "+(s1+s2+s3));
		scanner.close();
	}

}
