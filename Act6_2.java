package Act6;

import java.util.Arrays;

public class Act6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//2. Write a Java program to test if an array contains a specific value.
		
		int[] arrayNum = {10, 20, 30, 40, 50};
		int specificNum = 30;
		boolean specificValue = specificValueOf(arrayNum, specificNum);
		
		System.out.println("Original Array " + Arrays.toString(arrayNum));
		System.out.println("Testing weather the specific value in the array is present: " + specificNum + " is " + specificValue );

	}
	//method to Verify specific value in array
	public static boolean specificValueOf(int[] array, int specificValue ) {
		for (int i = 0; i < array.length; i++) {
			if(array[1] == specificValue) {
				return true;
			} 
		} 
		return false;
	}

}
