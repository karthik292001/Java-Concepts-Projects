import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
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
		char choice=read.next().charAt(0);
		CalculatorAppSwitch cal=new CalculatorAppSwitch();
		cal.calculatorApp(num1,num2,choice);
		
		read.close();
		
	}

}
