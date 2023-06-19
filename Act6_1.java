package Act6;

import java.util.Arrays;

public class Act6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Write a Java program to calculate the average value of array elements.
		
		int[] arrayNum = {10, 20, 30, 40, 50};
		int average = calculateTheAverage(arrayNum);
		
		System.out.println("Original Array " + Arrays.toString(arrayNum));
		System.out.println("average of the array is: " + average);

	}
	public static int calculateTheAverage(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum / array.length;
	}

}
