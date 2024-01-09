import java.util.Scanner;

public class FinanceCalculator {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
        FinanceCalculatorClass cal=new FinanceCalculatorClass();
		System.out.println("Enter the principal amount:");
		double principal_amount = read.nextDouble();
		System.out.println("Enter the rate of interest:");
		double rate_of_interest = read.nextDouble();
		System.out.println("Enter the time:");
		double time = read.nextDouble();
		double result = cal.calculateSimpleInterest(principal_amount, rate_of_interest, time);
		System.out.println("The cube of given number is:" +result);
		read.close();
		
	}
}
