package Act6;

import java.util.Arrays;

public class Act6_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		28. Write a Java program to find the sum of the two elements of a given array 
//		equal to a given integer.
//		Sample array: [1,2,4,5,6]
//				Target value: 6.

		
		int[] arrayNum = {1, 2, 4, 5, 6};	
		int targetValue = 6;
		
		System.out.println("Original Array " + Arrays.toString(arrayNum));
		System.out.println("Pair elements with target value");
		findSumOfTwoElements(arrayNum,targetValue);
		

	}

	public static void findSumOfTwoElements(int[] array, int specificValue) {
		for (int i = 0; i < array.length -1; i++) {
			for (int j = i; j < array.length; j++) {
				if (array[i] + array[j] == specificValue) {
					System.out.println(array[i] + " + " + array[j] + " = " + specificValue);
				}
			}
		}
	}
}
