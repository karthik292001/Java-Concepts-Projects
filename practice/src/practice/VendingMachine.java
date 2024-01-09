package practice;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		Scanner read =new Scanner(System.in);
		System.out.println("Welcome to vending machine!");
		System.out.println("Choose your option");
		System.out.println("1.Coins between 10 t0 20");
		System.out.println("2.Coins between 20 t0 40");
		System.out.println("3.Coins between 40 t0 80");
		System.out.println("4.Coins between 80 t0 120");
		System.out.println("Enter your choice:");
		int choice=read.nextInt();
		menuDetails(choice);
		read.close();
	}

	private static void menuDetails(int choice) {
		switch(choice) {
			case 1:	System.out.println("Products you can buy:");
					System.out.println("Product name           Price");
					System.out.println("-----------------------------");
					System.out.println("Pepsi                  18Rs");
					System.out.println("Cocacola               19Rs");
					System.out.println("7Up                    20Rs");
					break;
			default: System.out.println("Invalid choice!, Try with valid Input.");
		}
		
	}

}
