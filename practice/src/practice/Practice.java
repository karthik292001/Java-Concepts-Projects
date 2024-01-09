package practice;


//public class Practice {
//
//	public static void main(String[] args) {
//		Scanner scan= new Scanner(System.in);
//		System.out.println("enter the first number");
//		double a=scan.nextDouble();
//		System.out.println("enter the second number");
//		double b=scan.nextDouble();
//		double addition =addnumbers(a,b);
//		System.out.println("Addition of two numbers "+addition);
//		scan.close();
//	}
//
//	public static double addnumbers(double x,double y) {
//		
//		double sum=x+y;
//		return sum;
//		
//	}

	
//	import java.util.Scanner;
//
//	public class Practice {
//
//		public static void main(String[] args) {
//			Scanner scan= new Scanner(System.in);
//			System.out.println("enter the nth number");
//			int n=scan.nextInt();
//			
//			int addition =addnumbers(n);
//			System.out.println("Addition of odd numbers "+addition);
//			scan.close();
//		}
//
//		public static int addnumbers(int n) {
//			int sum=0;
//			for(int i=1;i<=n;i++)
//			{
//				if(i%2 != 0)
//				{
//					sum=sum+i;
//				}
//			}
//			
//			return sum;
//			
//		}
//
//}


//import java.util.Scanner;
//
//public class Practice {
//
//    public static void main(String[] args) {
//		Scanner scan= new Scanner(System.in);
//		System.out.println("enter the first number");
//		int a=scan.nextInt();
//		System.out.println("enter the second number");
//		int b=scan.nextInt();
//		addnumbers(a,b);
//		subtract(a,b);
//		mul(a,b);
//		div(a,b);
//		rem(a,b);
//		scan.close();
//	}
//
//	private static void rem(int a, int b) {
//		int rem=a%b;
//		System.out.println(rem);
//	}
//
//	private static void div(int a, int b) {
//
//		int div=a/b;
//		System.out.println(div);
//		
//	}
//
//	private static void mul(int a, int b) {
//	
//		int mul=a*b;
//		System.out.println(mul);
//		
//	}
//
//	private static void subtract(int a, int b) {
//		
//		int sub=a-b;
//		System.out.println(sub);
//		
//	}
//
//	public static void addnumbers(int x,int y) {
//		
//		int sum=x+y;
//		System.out.println(sum);
//		
//	}
//}


import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your name");
		String name = scan.nextLine();
		System.out.println("enter your OS");
		String os = scan.next();
		System.out.println("enter your Java version");
	    String version = scan.next();
		System.out.println("enter your RAM size");
		int size = scan.nextInt();
		System.out.println("Name:"+name+" OS:"+os+" Java version:"+version+" RAM size:"+size);
		scan.close();
	}

}