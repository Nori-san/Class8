package Act6;

public class Act6_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//16. Write a Java program to add two matrices of the same size.
		int[][] matrix1 = {{1,2,3}, {4,5,6}, {7,8,9}};
		int[][] matrix2 = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		addTwoMatrices(matrix1, matrix2);
	}
	
	public static void addTwoMatrices(int[][] array1, int[][] array2) {
		int[][] newMatrix = new int[3][3];
		
		for (int i = 0; i <array1.length; i++) {
			for (int j = 0; j<array2.length; j++) {
				newMatrix[i][j] = array1[i][j] + array2[i][j];
				System.out.printf("%4d", newMatrix[i][j]);
			}
			System.out.println();
		}
	}

}
