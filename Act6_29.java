package Act6;

import java.util.Arrays;

public class Act6_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		29. Write a Java program to find all combinations of four elements of an array 
//		whose sum is equal to a given value. 
		
		int[] arrayNum = {10, 20, 30, 40, 50};
		int targetValue = 100;
		
		System.out.println("Original Array " + Arrays.toString(arrayNum));
		System.out.println("Combination of four elements to give a sum of the Target value: ");
		sumOfCombinationOfFourELements(arrayNum, targetValue);
		
	}
	
	public static void sumOfCombinationOfFourELements(int[] array, int sum) {
		int n = array.length;
		int i, j, k, l;
		for (i = 0; i < n; i++) {
			for( j = i +1; j < n; j++) {
				for (k = j+1; k < n; k++) {
					for (l = k + 1; l < n; l++) {
						if (array[i] + array[j] + array[k] + array[l] == sum) {
							System.out.print(array[i] + " + " + array[j] + " + " + array[k] + " + " + array[l] + " = " + sum);
						}
					}
				}
			}
		}
	}

}
