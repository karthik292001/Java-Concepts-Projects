package com.kn.customexception;

import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to namma bank");
		System.out.println("Enter the amount to be withdrawn = ");
		double amount=scan.nextDouble();
		try {
			withdrawal(amount);
		}
		catch(InsufficientFundsException e) {
			e.printStackTrace();
		}
	}
	public static void withdrawal(double amount) throws InsufficientFundsException{
		double balance=100000.00;
		if(amount<=balance) {
			System.out.println("Successfully withdrawn "+amount+" , Available balance = "+(balance-amount));
		}
		else {
			throw new InsufficientFundsException("Balance is too low");
		}
	}

}
