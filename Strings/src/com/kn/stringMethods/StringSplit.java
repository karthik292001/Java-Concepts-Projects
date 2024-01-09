package com.kn.stringMethods;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="raja ram mohan roy";
		String []substrings=s.split(" ");
		for(String str:substrings) {
			System.out.print("'"+str+"' ");
		}
		System.out.println();
		System.out.println("Substrings in reverse order:");
		for(int i=substrings.length-1;i>=0;i--) {
			System.out.print(substrings[i]+" ");
		}

	}

}
