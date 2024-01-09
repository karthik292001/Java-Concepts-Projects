import java.util.Scanner;

public class VowelsAndConsonants {

	public static void main(String[] args) {
//		int[] array=new int[10];
		Scanner read=new Scanner(System.in);
		System.out.println("Enter a character:");
		char ch=read.next().charAt(0);
		if(ch=='A'|| ch=='a'||ch=='E'|| ch=='e'||ch=='I'|| ch=='i'||ch=='O'|| ch=='o'||ch=='U'|| ch=='u') {
			System.out.println("Character is Vowel");
		}
		else {
			System.out.println("Character is consonant");
		}
		
	}
}
