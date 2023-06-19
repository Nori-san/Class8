package Act6;

import java.util.Arrays;

public class Act6_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		32. Write a Java program to find the rotation count in a given rotated sorted 
//		array of integers. 
		
		int[] arrayNum = {6,9,7,2,13,8,3};
		System.out.println("Original Array " + Arrays.toString(arrayNum));
		int n = arrayNum.length;
		
		System.out.println("Rotation count: " + rotationCount(arrayNum, n));
	}

	public static int rotationCount(int[] array, int n) {
		int minVal = array[0],
			minIndex = -1;
		for (int i= 0; i < n; i++) {
			if (minVal < array[i]) {
				minVal = array[i];
				minIndex = i;
			}
		}
		return minIndex;
	}
}
