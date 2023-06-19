package Act6;

import java.util.Arrays;

public class Act6_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		21. Write a Java program to get the difference between the largest and 
//		smallest values in an array of integers. The array must have a length of at 
//		least 1.
		
		int[] arrayNum = {1, 2, 3, 4, 5, 6, 7};
		
		System.out.println("Original Array " + Arrays.toString(arrayNum));
		System.out.println("Greatest number in the array is: " + findingMax(arrayNum));
		System.out.println("Lowest number in the array is: " + findingMin(arrayNum));
		int total = findingMax(arrayNum) - findingMin(arrayNum);
		System.out.println("Max - Min = " + total);

	}
	
	public static int findingMax(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			 max = Math.max(max, array[i]);
		}
		return max;
	}
	
	public static int findingMin(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			 min = Math.min(min, array[i]);
		}
		
		return min;
	}

}
