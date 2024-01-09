import java.util.Scanner;

public class RainbowUsingSwitch {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter a character:");
		char character=read.next().charAt(0);
		CharacterCheck check=new CharacterCheck();
		check.findCharacterColor(character);
		read.close();
	}

}
