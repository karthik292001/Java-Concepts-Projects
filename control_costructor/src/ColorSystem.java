import java.util.Scanner;

public class ColorSystem {

	public static void main(String[] args) {
		Scanner read =new Scanner(System.in);
		CheckLetter c= new CheckLetter();
		System.out.println("Enter a letter:");
		char letter=read.next().charAt(0);
		c.checkColor(letter);
		read.close();
	}

}
