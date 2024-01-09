package com.kn.stringPrograms;

import java.util.Scanner;

public class GetCharacter {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string to get a character = ");
		String string=scanner.nextLine();
		System.out.println("Enter a character index to read = ");
		int index=scanner.nextInt();
		System.out.println("Select a method to read character: 1.charAt 2.toCharArray");
		int option=scanner.nextInt();
		ReadCharacter read=new ReadCharacter();
		char resultantChar=' ';
		if(option==1) {
			resultantChar=read.charAt(string, index);
			System.out.println("The character ar index "+index+" using charAt method is = "+resultantChar);
		}else if(option==2) {
			resultantChar=read.toCharArray(string, index);
			System.out.println("The character ar index "+index+" using toCharArray method is = "+resultantChar);
		}else {
			System.out.println("choose a valid method, Try with valid input!");
		}
		scanner.close();
	}

}
