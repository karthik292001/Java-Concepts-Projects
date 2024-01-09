import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		
//		To read input from End User
		System.out.println("Enter a character:");
		char ch=read.next().charAt(0);
//		Method to check character is vowel or consonant
		checkVowelOrConsonant(ch);
		read.close();
	}

	private static void checkVowelOrConsonant(char ch) {
		
//		conditional statement to check whether character is vowel
		if(ch=='A'|| ch=='a'||ch=='E'|| ch=='e'||ch=='I'|| ch=='i'||ch=='O'|| ch=='o'||ch=='U'|| ch=='u') {
			System.out.println("The given Character '"+ch+"' is Vowel");
		}
		
//		else statement to print character is not vowel
		else {
			System.out.println("The given Character '"+ch+"' is consonant");
		}
	}

}
