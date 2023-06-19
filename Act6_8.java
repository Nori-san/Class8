package Act6;

import java.util.Arrays;

public class Act6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//8. Write a Java program to reverse an array of integer values.
		
		int[] arrayNum = {10, 20, 30, 40, 50};
		
		System.out.println("Original Array " + Arrays.toString(arrayNum));
		System.out.println("Reverse Array " + Arrays.toString(reverseArray(arrayNum)));

	}
	
	public static int[] reverseArray(int[] array) {
		int[] reverseArray = new int[array.length];
		int index = 0, i;
		
		//array.length -1 starting in last index of the array
		for (i = array.length - 1; i >= 0; i--) {
			reverseArray[index] = array[i];
			index++;
		}
		return reverseArray;
	}

}
