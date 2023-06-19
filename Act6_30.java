package Act6;

import java.util.Arrays;

public class Act6_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		30. Write a Java program to count the number of possible triangles from a 
//		given unsorted array of positive integers. 
//		Note: The triangle inequality states that the sum of the lengths of any two 
//		sides of a triangle must be greater than or equal to the length of the third side.
		
		int[] arrayNum = {6,9,7,2,13,8,3};

		System.out.println("Original Array " + Arrays.toString(arrayNum));
		System.out.print("Total number of triangles: " + countNumOfPossibleTriangles(arrayNum));

	}
	
	public static int countNumOfPossibleTriangles(int[] array) {
		int n = array.length, count = 0, i, j = 0, k = 0;
		Arrays.sort(array);
		for (i = 0; i < n-2; i++) {
			 for (j = i + 1; j < n-1; j++) {
				 for (k = j+1; k < n; k++) {
					 if (array[i] + array[j] > array[k]) {
							count++;
						}	 
				 	}
				}
				
			}
		return count;
	}

}
