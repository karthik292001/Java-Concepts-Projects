package com.kn.customexception;

import java.util.Scanner;

public class DrivingLicenseDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to RTO");
		System.out.println("Enter your age = ");
		int age=scan.nextInt();
		try {
		  checkAge(age);
		}catch(UnderAgeException e) {
			e.printStackTrace();
		}
		catch(OverAgeException e1) {
			e1.printStackTrace();
		}
	}
	public static void checkAge(int age) throws UnderAgeException, OverAgeException
	{
		if(age>=18&&age<=65) {
			System.out.println("You are eligible for driving test");
		}else if(age<18){
			throw new UnderAgeException("You are not eligible to take driving test, due to RTO age regulations!");
		}else if(age>65) {
			throw new OverAgeException("You are not eligible to take driving test, due to age limit!");
		}
	}

}
