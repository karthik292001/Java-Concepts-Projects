package com.kn.stringPrograms;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
//		Read string as a input from end user using scanner object
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string to be reverse:");
		String inputString=scanner.nextLine();
//		Call the method to reverse a inputString with class name
		String reversedString=ReverseString.reverseString(inputString);
//		Display resultant string
		System.out.println("The resultant String = "+reversedString);
//		Release the resource
		scanner.close();
		}
	}

