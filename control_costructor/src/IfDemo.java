import java.util.Scanner;

public class IfDemo {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter your Age: ");
		int age = read.nextInt();
		if (age >= 18) {
			System.out.println("You are eligible to vote");
		}
		read.close();
	}

}
