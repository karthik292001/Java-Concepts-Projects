package com.kn.polymorphism;

public class PaymentDemo {

	public static void main(String[] args) {
		Payment p =new Payment();
		p.bill();
		p.offer();
		p.pay();
		System.out.println("*********");
		
		p=new Payment();
		p.bill();
		p.offer();
		p.pay();
		System.out.println("*********");
		
		p=new Payment();
		p.bill();
		p.offer();
		p.pay();
		System.out.println("*********");
		
		p=new Payment();
		p.bill();
		p.offer();
		p.pay();
		System.out.println("*********");
		
	}

}
