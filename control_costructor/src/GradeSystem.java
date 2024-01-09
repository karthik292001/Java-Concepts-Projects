import java.util.Scanner;

public class GradeSystem {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter your marks:");
		int marks=read.nextInt();
		checkGrade(marks);
	}

	private static void checkGrade(int marks) {
		if(marks>90) {
			System.out.println("A Grade");
		}
		else if(marks>75 && marks<=90) {
			System.out.println("B Grade");
		}
		else if(marks>60 && marks<=75) {
			System.out.println("C Grade");
		}
		else if(marks>45 && marks<=60) {
			System.out.println("D Grade");
		}
		else if(marks>=35 && marks<=45) {
			System.out.println("E Grade");
		}
		else {
			System.out.println("Better luck!, Do well next time.");
		}
	}

}
