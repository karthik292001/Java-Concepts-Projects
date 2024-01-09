package com.kn.hierarchicalinheritance;

public class HeirarchicalInheritanceDemo {

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.id=111;
		e1.name="sanjay";
		e1.designation="employee";
		e1.salary=1000.0;
		
		Developer d1=new Developer();
		d1.id=222;
		d1.name="karthik";
		d1.designation="developer";
		d1.salary=800000.0;
		
		TestEngineer t1=new TestEngineer();
		t1.id=333;
		t1.name="rakesh";
		t1.designation="QA";
		t1.salary=300000.0;
		
		TeamLead tl1=new TeamLead();
		tl1.id=444;
		tl1.name="santhosh";
		tl1.designation="Project lead";
		tl1.salary=900000.0;
		
		Manager m1=new Manager();
		m1.id=555;
		m1.name="harshitha";
		m1.designation="Resource manager";
		m1.salary=1200000.0;
		
		System.out.println("Employee details:");
		System.out.println("ID = "+e1.id);
		System.out.println("Name = "+e1.name);
		System.out.println("Designation = "+e1.designation);
		System.out.println("Salary = "+e1.salary);
		System.out.println();
		
		System.out.println("Sub classes inheriting properties from Employee class:");
		System.out.println("ID = "+d1.id);
		System.out.println("Name = "+d1.name);
		System.out.println("Designation = "+d1.designation);
		System.out.println("Salary = "+d1.salary);
		System.out.println();
		
		System.out.println("ID = "+t1.id);
		System.out.println("Name = "+t1.name);
		System.out.println("Designation = "+t1.designation);
		System.out.println("Salary = "+t1.salary);
		System.out.println();
		
		System.out.println("ID = "+tl1.id);
		System.out.println("Name = "+tl1.name);
		System.out.println("Designation = "+tl1.designation);
		System.out.println("Salary = "+tl1.salary);
		System.out.println();
		
		System.out.println("ID = "+m1.id);
		System.out.println("Name = "+m1.name);
		System.out.println("Designation = "+m1.designation);
		System.out.println("Salary = "+m1.salary);
		
		
	}

}
