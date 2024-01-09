import java.util.Scanner;

public class CheckEligibilityVoting {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		// To read input from End user
		System.out.println("Enter your Age: ");
		int age = read.nextInt();

		// Method to check eligibility
		CheckEligibilityForVoting(age);
		read.close();
	}

	private static void CheckEligibilityForVoting(int age) {

//		Conditional statement to check eligibility
		if (age >= 18) {
			System.out.println("Congratulations, You are Elgible to vote");
		}
		
//		statement to print non-eligibility after checking eligibility criteria
		else {
			System.out.println("Bachha go to school, phele dyan se padao");
		}
	}

}
