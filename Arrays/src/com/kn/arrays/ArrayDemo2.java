package com.kn.arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int []array=new int[5];
		for(int i=0;i<array.length;i++) {
			array[i]=10*(i+1);
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
