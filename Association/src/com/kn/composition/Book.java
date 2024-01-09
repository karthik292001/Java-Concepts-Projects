package com.kn.composition;

public class Book {
	String name;
	Page page;
	
	public Book(String name) {
		this.name=name;
		this.page=new Page(100,34);
	}
	public void exist() {
		System.out.println(this.name+" book is existing");
		this.page.rotating();
	}
	

}
