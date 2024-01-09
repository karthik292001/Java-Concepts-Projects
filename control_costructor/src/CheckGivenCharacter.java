import java.util.Scanner;

public class CheckGivenCharacter {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch=read.next().charAt(0);
		checkGivenCharacter(ch);
	}

	private static void checkGivenCharacter(char ch) {
		if(ch>=65 && ch<=90) {
			System.out.println("The given character '"+ch+"' is upper case Alphabet");
			
		}
		if(ch>=97 && ch<=122) {
			System.out.println("The given character '"+ch+"' is lower case Alphabet");
			
		}
		if(ch>=48 && ch<=57) {
			System.out.println("The given character '"+ch+"' is Numeric");
		}
		if(!((ch>=48 && ch<=57)||(ch>=97 && ch<=122)||(ch>=65 && ch<=90))){
			System.out.println("The given character '"+ch+"' is special character");
		}
	}

}
