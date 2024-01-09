import java.util.Scanner;

public class FirstCharacterCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string = ");
		String str=scanner.nextLine();
		StringBuffer sb=new StringBuffer();
		String []subString=str.split(" ");
		for(int i=0;i<subString.length;i++) {
			char ch[]=subString[i].toCharArray();
				if(ch[0]>=97&&ch[0]<=122) {
					ch[0]=(char)(ch[0]-32);
				}
			String temp=new String(ch);
		    if(i==0) {
		    	sb.append(temp);
		    }else {
		    	sb.append(" "+temp);
		    }
		}
		System.out.println("Resultant string is = "+new String(sb));

	}

}
