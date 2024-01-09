package com.kn.fibonacci;

public class Fibonacci {
	public void fibonacciSeries(int range) {
		int n1=0,n2=1,next,count=1;
		System.out.println("Fibonacci series upto range "+range);
		while(count<=range) {
			System.out.println(n1+" ");
			next=n1+n2;
			n1=n2;
			n2=next;
			count++;
		}
	}

}
