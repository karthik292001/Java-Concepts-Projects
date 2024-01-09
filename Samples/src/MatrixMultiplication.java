
public class MatrixMultiplication {

	public static void main(String[] args) {
		int matrix1[][]= {{1,2},{4,7},{5,8}};
		int matrix2[][]= {{4,2},{6,7},{8,9}};
		int resultant[][]=new int[matrix1.length][matrix1[0].length];
		for(int i=0;i<matrix1.length;i++) {
			for(int j=0;j<matrix1[i].length;j++) {
				resultant[i][j]= matrix1[i][j]*matrix2[i][j];
			}
		}
		System.out.println("Resultant matrix after matrix multiplication:");
		System.out.print("[");
		for(int i=0;i<resultant.length;i++) {
			for(int j=0;j<resultant[0].length;j++) {
				if(i==0&&j==0) {
					System.out.print(resultant[i][j]);
				}else {
					System.out.print(","+resultant[i][j]);
				}
			}
		}
		System.out.println("]");
	}

}
