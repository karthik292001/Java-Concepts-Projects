import java.util.*;
public class PortClassificaion {

	public static void main(String[] args) {
		String str="C2324L-12L";
		if(str!="") {
			int len=str.length();
			String port="";
			if(len==10) {
			    port=str.substring(7,9);
			}else if(len==13) {
				port=str.substring(9,11);
			}
			else if(len==14) {
				port=str.substring(10,12);
			}
			if(str.charAt(0)>=65&&str.charAt(0)<=90) {
				int port1=Integer.parseInt(port);
				if(str.charAt(len-1)=='S'||str.charAt(len-1)=='X') {
					System.out.println("core");
				}
				else if(port1>24) {
					System.out.println("type 2");
				}else if(port1<24) {
					System.out.println("type 1");
				}
			}else {
				System.out.println("Invalid port number");
			}
		}else {
			System.out.println("Invalid port number");
		}
		
	}

}
