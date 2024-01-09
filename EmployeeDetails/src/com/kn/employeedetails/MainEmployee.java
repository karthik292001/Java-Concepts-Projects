package com.kn.employeedetails;

import java.util.Scanner;

public class MainEmployee {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a capacity of company = ");
		int capacity=scanner.nextInt();
				
		EmployeeManager em=new EmployeeManager(capacity);
		while(true) {
			System.out.println("******* ~~ *********");
			System.out.println("Enter a choice 1.Add Employee 2.Employee details 3.Display Employees 4.Exit");
			int choice=scanner.nextInt();
			switch(choice) {
			case 1:System.out.println("Enter a employee name = ");
			       String name=scanner.next();
			       System.out.println("Enter a employee salary = ");
			       double salary=scanner.nextDouble();
				   em.addEmployee(name,salary);
				   break;
			case 2:System.out.println("Enter a employee id to search employee details = ");;
			
					int id=scanner.nextInt();
					em.searchEmployee(id);
					break;
			
			case 3:
				   em.displayEmployee();
			       break;
			case 4:return;
			default:System.out.println("Invalid option, Try again with valid input!");
			
			}
		}
	}

}
