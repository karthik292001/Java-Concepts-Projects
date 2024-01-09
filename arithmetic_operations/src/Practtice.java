import java.util.Scanner;
public class Practtice {

	public static void main(String[] args) {
		        Scanner read= new Scanner(System.in);
		        int [] array = new int[5];
		        for(int i=0;i<=4;i++){
		            array[i]=read.nextInt();
		        }
		        sample(array);
		    }

	private static void sample(int array[]) {
		  for(int i=0;i<=4;i++){
	            System.out.print(array[i]);
	            if(i<4) {
	            	System.out.print(",");
	            }
	        }
	}
}
