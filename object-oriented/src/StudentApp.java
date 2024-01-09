import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Scanner scan = new Scanner(System.in);
		System.out.println(s1.ch);
		System.out.println("Rnter student name:");
		s1.name = scan.nextLine();
		System.out.println("Rnter student rollno:");
		s1.rollnumber = scan.nextInt();
		System.out.println("Rnter student cgpa:");
		s1.cgpa = scan.nextDouble();
		System.out.println("Name:" + s1.name + ", Rollno:" + s1.rollnumber + ", cgpa:" + s1.cgpa);
		s1.study();
		s1.markAttendance();
		scan.nextLine();
		System.out.println("Rnter student name:");
		s2.name = scan.nextLine();
		System.out.println("Rnter student rollno:");
		s2.rollnumber = scan.nextInt();
		System.out.println("Rnter student cgpa:");
		s2.cgpa = scan.nextDouble();
		System.out.println("Name:" + s2.name + ", Rollno:" + s2.rollnumber + ", cgpa:" + s2.cgpa);
		s2.study();
		s2.markAttendance();
		scan.close();
	}

}
