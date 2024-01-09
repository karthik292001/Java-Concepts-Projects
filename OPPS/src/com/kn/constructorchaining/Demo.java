package com.kn.constructorchaining;

public class Demo {

	public static void main(String[] args) {
		
		EngineeringStudent e1=new EngineeringStudent();
		EngineeringStudent e2=new EngineeringStudent(5);
		EngineeringStudent e3=new EngineeringStudent("cse");
		EngineeringStudent e4=new EngineeringStudent(5,"cse");
		
		System.out.println("ID = "+e1.id);
		System.out.println("ID = "+e1.name);
		System.out.println("ID = "+e1.sem);
		System.out.println("ID = "+e1.branch);
		System.out.println();
		
		System.out.println("ID = "+e2.id);
		System.out.println("ID = "+e2.name);
		System.out.println("ID = "+e2.sem);
		System.out.println("ID = "+e2.branch);
		System.out.println();
		
		System.out.println("ID = "+e3.id);
		System.out.println("ID = "+e3.name);
		System.out.println("ID = "+e3.sem);
		System.out.println("ID = "+e3.branch);
		System.out.println();
		
		System.out.println("ID = "+e4.id);
		System.out.println("ID = "+e4.name);
		System.out.println("ID = "+e4.sem);
		System.out.println("ID = "+e4.branch);
		
	}

}
