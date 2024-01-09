import java.util.ArrayList;
import java.util.Scanner;

public class ArrayRemoveDuplicateElements {

	public static void main(String[] args) {
        // Your code here
        Scanner scan=new Scanner(System.in);
        int array[]=new int[3];
        for(int i=0;i<array.length;i++){
            array[i]=scan.nextInt();
        }
        int unique=uniqueElements(array);
        System.out.println(unique);
    }
    public static int uniqueElements(int []array){
        ArrayList list=new ArrayList();
        for(int i=0;i<array.length;i++){
            int temp=0;
            for(int j=i+1;j<array.length;j++){
            	System.out.println(j);
                if(array[i]==array[j]){
                    temp=1;
                }
            }
            
            if(temp==0){
               list.add(array[i]);
            }
        }
        System.out.println(list);
        return list.size();
    }

}
