
public class CalculatorAppSwitch {
	public void calculatorApp(int num1,int num2,char choice) {
		switch(choice) {
		case '+':
			System.out.println("Addition of two numbers is: "+(num1+num2));
			break;
		case '-':
			System.out.println("Addition of two numbers is: "+(num1-num2));
			break;
		case '*':
			System.out.println("Addition of two numbers is: "+(num1*num2));
			break;
		case '/':
			System.out.println("Addition of two numbers is: "+(num1/num2));
			break;
		case '%':
			System.out.println("Addition of two numbers is: "+(num1%num2));
			break;
		default:
			System.out.println("Invalid Input");
		}
	}

}
