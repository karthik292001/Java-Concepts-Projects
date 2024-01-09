package com.kn.stringMethods;

public class TocharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="raja ram mohan roy";
		char characterArray[]=s.toCharArray();
		for(char i:characterArray) {
			System.out.print("'"+i+"' ");
		}
		System.out.println();
		System.out.println("***String in reverse order***");
		for(int i=characterArray.length-1;i>=0;i--) {
			System.out.print(characterArray[i]);
		}

	}

}
