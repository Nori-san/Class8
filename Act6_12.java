package Act6;

import java.util.Arrays;

public class Act6_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//12. Write a Java program to find common elements between two integer arrays.
		
		int[] arrayNum1 = {10, 20, 30, 40, 50};
		int[] arrayNum2 = {50, 60, 70, 80, 90};

		System.out.println("Original Array 1 " + Arrays.toString(arrayNum1));
		System.out.println("Original Array 2 " + Arrays.toString(arrayNum2));
		System.out.println("Common element between the two array is: ");
		findCommonElement(arrayNum1, arrayNum2);
				
	}
	public static void findCommonElement(int[] array1, int[] array2) {
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					System.out.println(array2[j]);
				}
			}
		}
	}

}