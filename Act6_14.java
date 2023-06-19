package Act6;

import java.util.Arrays;

public class Act6_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//14. Write a Java program to find the second largest element in an array.
		
		int[] arrayNum = {10, 20, 30, 40, 50};
		
		System.out.println("Original Array " + Arrays.toString(arrayNum));
		System.out.println("Second Largest Element is " + findSecondLargestElement(arrayNum));

	}
	
	public static int findSecondLargestElement (int[] array) {
		Arrays.sort(array);
		 return array[array.length-2];
		}
	}
	

