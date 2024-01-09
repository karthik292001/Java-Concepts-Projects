import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the number of employees:");
		int n=scan.nextInt();
		EmployeeDetails emp[]=new EmployeeDetails[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the details of Employee"+(i+1)+" :");
			System.out.println("Enter the id :");
			int id=scan.nextInt();
			System.out.println("Enter the employee name :");
			scan.nextLine();
			String name=scan.nextLine();
			System.out.println("Enter the employee salary :");
			double salary=scan.nextDouble();
			emp[i]=new EmployeeDetails(id,name,salary);
		}
		
		int max=0,index=0;
		for(int i=0;i<emp.length;i++) {
			if(emp[i].salary>max) {
				index=i;
			}
		}
		
		System.out.println("***Employee with highest salary***");
		System.out.println("ID :"+emp[index].id);
		System.out.println("Name :"+emp[index].name);
		System.out.println("Salary :"+emp[index].salary);
	}

}
