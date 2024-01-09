package practice;

import java.util.Scanner;

public class CubeNUmber {

	public static void main(String[] args) {
		 Scanner read=new Scanner(System.in);
		 System.out.println("Enter a number:");
		 int number=read.nextInt();
		 int result=(int)(Math.pow(number,3));
		 System.out.println("Cube of "+number+" is: "+result);
		 read.close();

	}

}
