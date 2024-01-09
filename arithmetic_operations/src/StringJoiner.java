import java.util.Scanner;

public class StringJoiner {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter first string:");
		String str1=read.nextLine();
		System.out.println("Enter second string:");
		String str2=read.nextLine();
		String result=stringJoiner(str1,str2);
		System.out.println("Resultant after joining two strings: "+result);
		
	}

	private static String stringJoiner(String str1, String str2) {
		return str1+str2;
	}

}
