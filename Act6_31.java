package Act6;

import java.util.Arrays;

public class Act6_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		31. Write a Java program to cyclically rotate a given array clockwise by one. 
		
		int[] arrayNum = {10, 20, 30, 40, 50};
		System.out.println("Original array : " + Arrays.toString(arrayNum));
		rotateClockwise(arrayNum);
		System.out.println("Rotated clockwise array : " + Arrays.toString(arrayNum));
		
	}
	public static void rotateClockwise(int[] array) {
		int n = array.length, lastEl = array[n-1];
		for (int i = n-2; i >= 0; i--) {
			array[i+1] = array[i];
		}
		array[0]= lastEl;
	}

}
