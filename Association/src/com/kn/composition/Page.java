package com.kn.composition;

public class Page {
	int pagenumber;
	int length;
	public Page(int pagenumber,int length) {
		this.pagenumber=pagenumber;
		this.length=length;
	}
	public void rotating() {
		System.out.println("Pages are rotating");
	}

}
