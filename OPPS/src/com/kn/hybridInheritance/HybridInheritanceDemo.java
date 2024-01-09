package com.kn.hybridInheritance;

public class HybridInheritanceDemo {

	public static void main(String[] args) {
		System.out.println("Parent class:");
		Person p1=new Person();
		p1.name="kishor";
		p1.age=18;
		System.out.println("Person Name = "+p1.name);
		System.out.println("Person Age = "+p1.age);
		
		System.out.println();
		System.out.println("Student class inheriting properties of person class:");
		Student s1=new Student();
		s1.name="kiran";
		s1.age=21;
		s1.rollNumber=4441;
		System.out.println("Student Name = "+s1.name);
		System.out.println("Student Age = "+s1.age);
		System.out.println("Student RollNumber = "+s1.rollNumber);
		System.out.println();
		
		System.out.println("Engineering student and Medical student classes inheriting properties of student class");
		EngineeringStudent e1=new EngineeringStudent();
		e1.name="santhosh";
		e1.age=23;
		e1.rollNumber=23232;
		System.out.println("Engineering student Name = "+s1.name);
		System.out.println("Engineering student Age = "+s1.age);
		System.out.println("Engineering student RollNumber = "+s1.rollNumber);
		System.out.println();
		
		MedicalStudent m1=new MedicalStudent();
		m1.name="rakesh";
		m1.age=29;
		m1.rollNumber=121332;
		System.out.println("Medical student Name = "+m1.name);
		System.out.println("Medical student Age = "+m1.age);
		System.out.println("Medical student RollNumber = "+m1.rollNumber);
		System.out.println();
		
		System.out.println("Trainer class inheriting properties of person class:");
		Trainer t1=new Trainer();
		t1.name="arun";
		t1.age=33;
		t1.experience=10;
		System.out.println("Trainer Name = "+t1.name);
		System.out.println("Trainer Age = "+t1.age);
		System.out.println("Trainer Experience = "+t1.experience);
		System.out.println();
		
		JavaTrainer j1=new JavaTrainer();
		j1.name="ayush";
		j1.age=28;
		j1.experience=7;
		System.out.println("Java Trainer Name = "+j1.name);
		System.out.println("Java Trainer Age = "+j1.age);
		System.out.println("Java Trainer Experience = "+j1.experience);
		System.out.println();
		
		SQLTrainer sq1=new SQLTrainer();
		sq1.name="Gajendra";
		sq1.age=24;
		sq1.experience=3;
		System.out.println("SQL Trainer Name = "+sq1.name);
		System.out.println("SQL Trainer Age = "+sq1.age);
		System.out.println("SQL Trainer Experience = "+sq1.experience);
		System.out.println();
		
	}

}
