package Act6;

import java.util.Arrays;

public class Act6_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//15. Write a Java program to find the second smallest element in an array.
		
		int[] arrayNum = {10, 20, 30, 40, 50};
		
		System.out.println("Original Array " + Arrays.toString(arrayNum));
		System.out.println("Second Largest Element is " + findSecondLargestElement(arrayNum));

	}
	
	public static int findSecondLargestElement (int[] array) {
		Arrays.sort(array);
		 return array[1];
		}

	}


