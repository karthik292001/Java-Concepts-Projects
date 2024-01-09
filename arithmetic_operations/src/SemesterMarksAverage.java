import java.util.Scanner;

public class SemesterMarksAverage {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		System.out.println("Enter the semester 1 marks:");
		int sem1 = read.nextInt();
		System.out.println("Enter the semester 2 marks:");
		int sem2 = read.nextInt();
		System.out.println("Enter the semester 3 marks:");
		int sem3 = read.nextInt();
		System.out.println("Enter the semester 4 marks:");
		int sem4 = read.nextInt();
		System.out.println("Enter the semester 5 marks:");
		int sem5 = read.nextInt();
		System.out.println("Enter the semester 6 marks:");
		int sem6 = read.nextInt();
		System.out.println("Enter the semester 7 marks:");
		int sem7 = read.nextInt();
		System.out.println("Enter the semester 8 marks:");
		int sem8 = read.nextInt();
		double result = calculateAverage(sem1, sem2, sem3, sem4, sem5, sem6, sem7, sem8);
		System.out.println("The distance traveled is: " + result);

	}

	private static double calculateAverage(int sem1, int sem2, int sem3, int sem4, int sem5, int sem6, int sem7,
			int sem8) {
		double average = (double) (sem1 + sem2 + sem3 + sem4 + sem5 + sem6 + sem7 + sem8) / 8;
		return average;
	}

}
