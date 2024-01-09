import java.util.Scanner;

public class ExceptionHandling extends DivideByZeroException{

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		try {
			System.out.println("Enter a number1");
			double num1=scan.nextDouble();
			System.out.println("Enter a number2");
			double num2=scan.nextDouble();
			double result=divide(num1,num2);
		}catch(DivideByZeroException e) {
			e.printStackTrace();
		}
		
	}
	public static double divide(double num1,double num2) throws DivideByZeroException{
		double divide;
		if(num2!=0) {
			 divide=num1/num2;
		}else {
			throw new DivideByZeroException("Denominator should not be zero");
		}
		return divide;
		
	}

}
