package com.kn.whileloop;

public class TablesAppUsingWhile {
	public void multiplesOfNumber(int num) {
		int multiple=10;
		while(multiple>=1) {
			System.out.println(num+" * "+multiple+" = "+(num*multiple));
			multiple--;
		}
	}
}
