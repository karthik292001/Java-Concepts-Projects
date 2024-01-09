package findElement;

public class FindingArrayElement {
	public boolean findArrayElement(int[] array,int element) {
		int found=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]==element) {
				found=1;
				break;
			}
		}
		if(found==1) {
			return true;
		}
		else {
			return false;
		}
	}

}
