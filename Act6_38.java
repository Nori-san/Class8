package Act6;

import java.util.Arrays;

public class Act6_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		38. Write a Java program to replace every element with the next greatest 
//		element (from the right side) in a given array of integers.
//		There is no element next to the last element, therefore replace it with -1.
		
		int[] arrayNum = {6,9,7,2,1,8,3};
		System.out.println("Original array : " + Arrays.toString(arrayNum));
		nextGreatestNum(arrayNum);
		System.out.println("Replace every element with the second greatest : " + Arrays.toString(arrayNum));
		

	}
	
	public static void nextGreatestNum(int[] array) {
		int n = array.length;
		int max = -1;
		for (int i = n - 1; i >= 0; i--) {
			int temp = array[i];
			array[i] = max;
			max = Math.max(max, temp);
		}
	}

}
