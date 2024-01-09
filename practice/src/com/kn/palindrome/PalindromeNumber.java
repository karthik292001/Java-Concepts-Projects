package com.kn.palindrome;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=read.nextInt();
		PalindromeCheck pc=new PalindromeCheck();
		System.out.println(pc.checkPalindrome(num));
		read.close();
	}

}
