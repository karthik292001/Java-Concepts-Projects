package com.kn.multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		Thread t1=new Thread();
		System.out.println("current thread deteails = "+t1);
		System.out.println();
		System.out.println("Name = "+t1.getName());
		System.out.println("Priority = "+t1.getPriority());
		System.out.println("Thread Group = "+t1.getThreadGroup());
		System.out.println();
		System.out.println("------After Modifying------");
		t1.setName("main");
		t1.setPriority(10);
		System.out.println("Name = "+t1.getName());
		System.out.println("Priority = "+t1.getPriority());
	}

}
