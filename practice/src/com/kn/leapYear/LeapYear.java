package com.kn.leapYear;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter a year:");
		int year=read.nextInt();
		CheckLeapYear check=new CheckLeapYear();
		System.out.println(check.checkLeapYear(year));
		read.close();
	}

}
