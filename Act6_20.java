package Act6;

import java.util.Arrays;

public class Act6_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		20. Write a Java program to find the number of even and odd integers in a 
//		given array of integers.
		
		int[] arrayNum = {1, 2, 3, 4, 5, 6, 7};
		
		System.out.println("Original Array " + Arrays.toString(arrayNum));
		findNumberofEvenOdd(arrayNum);
	}
	
	public static void findNumberofEvenOdd(int[] array) {
		int evenCount = 0, 
				oddCount = 0;
		
		for (int i = 0; i < array.length; i++) {
			if ( array[i] % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("Number of even numbers: " + evenCount);
		System.out.println("Number of odd numbers: " + oddCount);
	}
}
