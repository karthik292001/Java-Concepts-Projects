package com.kn.composition;

public class CompositionDemo {

	public static void main(String[] args) {
		Book b1=new Book("Java");
		b1.exist();
		b1=null;
		b1.exist();
		
		
	}

}
