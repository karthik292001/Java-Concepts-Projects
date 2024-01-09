import java.util.Scanner;

public class MesssageDecoder {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter a character:");
		char character=read.next().charAt(0);
		int num=decodeCharacter(character);
		System.out.println("The unicode of received character is: "+num);
		read.close();
	}
	private static int decodeCharacter(char character) {
		int num=character;
		return num;
	}

}
