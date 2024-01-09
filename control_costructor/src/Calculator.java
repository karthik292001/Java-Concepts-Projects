import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner read =new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1=read.nextInt();
		System.out.println("Enter second number:");
		int num2=read.nextInt();
		System.out.println("Enter your choice:");
		System.out.println("+ ==> Addition");
		System.out.println("- ==> Subtraction");
		System.out.println("* ==> Multiplication");
		System.out.println("/ ==> Division");
		System.out.println("% ==> Modulo Division");
		char operation=read.next().charAt(0);
		CalculatorApp cal= new CalculatorApp();
		if(operation=='+') {
			System.out.println("Addition of "+num1+" and "+num2+" is: "+cal.addition(num1,num2));
		}
		else if(operation=='-') {
			System.out.println("Subtraction of "+num1+" and "+num2+" is: "+cal.subtract(num1,num2));
		}
		else if(operation=='*') {
			System.out.println("Multiplication of "+num1+" and "+num2+" is: "+cal.multiply(num1,num2));
		}
		else if(operation=='/') {
			System.out.println("Division of "+num1+" and "+num2+" is: "+cal.division(num1,num2));
		}
		else if(operation=='%') {
			System.out.println("Remainder of "+num1+" and "+num2+" is: "+cal.remainder(num1,num2));
		}
		else {
			System.out.println("Invalid input, Try with valid Input!");
		}
		
	}

}
