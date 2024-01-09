package com.kn.finallyblock;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Connection established with bank");
		System.out.println("Enter a pin = ");
		try {
			int pin=scan.nextInt();
			if(pin==9999) {
				System.out.println("continue with withdrawal funds");
			}else {
				System.out.println("Incorrect pin");
			}
		}
		catch(Exception e) {
			System.out.println("Exception handled succeessfully");
		}
		finally {
			System.out.println("close the connection with bank");
		}
		

	}

}
