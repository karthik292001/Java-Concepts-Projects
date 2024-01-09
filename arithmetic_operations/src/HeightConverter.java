import java.util.Scanner;

public class HeightConverter {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the height in inches:");
		double inch=read.nextDouble();
		convertInchesTOFoot(inch);
		System.out.println("Height in foot:"+convertInchesTOFoot(inch));
		read.close();
		
	}

	private static double convertInchesTOFoot(double inch) {
			return inch/12;
	}

}
