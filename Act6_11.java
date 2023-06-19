package Act6;

import java.util.Arrays;

public class Act6_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//11. Write a Java program to find common elements between two arrays (string values).
		
		String[] arrayWord1 = {"laptop", "mouse", "keyboard", "phone"};
		String[] arrayWord2 = {"pencil", "eraser", "pen", "laptop"};
		
		System.out.println("Original Array 1 " + Arrays.toString(arrayWord1));
		System.out.println("Original Array 2 " + Arrays.toString(arrayWord2));
		System.out.println("Common element between two array is: ");
		findCommonElement(arrayWord1, arrayWord2);
				
	}
	public static void findCommonElement(String[] array1, String[] array2) {
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					System.out.println(array2[j]);
				}
			}
		}
	}

}
