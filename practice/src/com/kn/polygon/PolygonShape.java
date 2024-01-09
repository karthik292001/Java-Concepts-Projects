package com.kn.polygon;

import java.util.Scanner;

public class PolygonShape {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter number of sides:");
		int sides=read.nextInt();
		if(sides<3) {
			System.out.println("Invalid Input, Try with valid Input!");
		}
		Polygon poly=new Polygon();
		System.out.println("Shape of polygon is: "+poly.polygonShape(sides));
		read.close();

	}

}
