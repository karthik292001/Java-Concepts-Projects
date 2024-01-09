package com.kn.arrays;

import java.util.Scanner;

public class DoubleArray {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the size for array of type double");
		double[]doubleArray=new double[read.nextInt()];
		System.out.println("Enter the values for array of type double");
		for(int i=0;i<doubleArray.length;i++) {
			System.out.println("Enter the value for "+(i+1)+" element:");
			doubleArray[i]=read.nextDouble();
		}
		System.out.println("Array elements are:");
		for(int i=0;i<doubleArray.length;i++) {
			System.out.println((i+1)+" element of array: "+doubleArray[i]);
		}
	}
}
	
//	int k=day,D=year%100,M=6;
//    
//    int[]monthvalue={0,3,3,6,1,4,6,2,5,0,3,5};
//    int Y=monthvalue[month-1];
//    int F=k+D+(D/4)+Y+M;
//    int rem=F%7;
//    if(year%4==0){
//        if(year%100==0){
//            if(year%400==0){
//                rem-=1;
//            }
//        }else{
//            rem-=1;
//        }
//    }
//    switch(rem){
//    case 0:
//            return "SUNDAY";
//            
//    case 1:
//            return "MONDAY";
//            
//    case 2:
//            return "TUESDAY";
//            
//    case 3:
//            return "WEDNESDAY";
//            
//    case 4:
//            return "THURSDAY";
//            
//    case 5:
//            return "FRIDAY";
//            
//    case 6:
//            return "SATURDAY";
//                          
//    }
// return null; 
