package com.kn.factorsOfNumber;

public class Factors {
	public void factorsOfNumber(int number) {
		System.out.println("Factors of: "+number);
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
				System.out.println(i+" is a factor of "+number);
			}
		}
	}
}
