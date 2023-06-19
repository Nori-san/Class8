package Act6;

import java.util.Arrays;

public class Act6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//7. Write a Java program to find the maximum and minimum value of an array.
		
		int[] arrayNum = {10, 20, 30, 40, 50};
		System.out.println("Original Array " + Arrays.toString(arrayNum));
		System.out.println("Greatest number in the array is: " + findingMax(arrayNum));
		System.out.println("Lowest number in the array is: " + findingMin(arrayNum));
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
