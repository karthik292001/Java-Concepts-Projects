package com.kn.employeedetails;

public class EmployeeManager {
	private int size=0;
	private int capacity;
	private Employee[] e;
	
	
	public EmployeeManager(int capacity) {
		e=new Employee[capacity];
		this.capacity=capacity;
		
	}
	public void addEmployee(String name,double salary) {
		if(size<capacity) {
			e[size]=new Employee(name,salary);
			System.out.println("Employee successfully added, Id of employee = "+e[size].getId());
			System.out.println();
			size++;
		}else {
			System.out.println("No vacancy in company");
		}
		
		
	}
	public void searchEmployee(int id) {
		for(int i=0;i<size;i++) {
			if(e[i].getId()==id) {
				System.out.println("####Employee details####");
				System.out.println("Id = "+id);
				System.out.println("Name = "+e[i].getName());
				System.out.println("Salary = "+e[i].getSalary());
				System.out.println();
			}
		}
	}
	public void displayEmployee() {
		System.out.println("******Employees details*******");
		for(int i=0;i<size;i++) {
				System.out.println("Id = "+e[i].getId()+" Name = "+e[i].getName()+" Salary = "+e[i].getSalary());
		}
		System.out.println();
	}
	

}
