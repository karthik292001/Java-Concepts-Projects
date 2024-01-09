package com.kn.whileloop;

public class FactorialApp {
	public int calculateFactorial(int num) {
		int fact=1;
		int i=1;
		do {
			fact=fact*i;
			i++;
		}while(i<=num);
		return fact;
	}
}
