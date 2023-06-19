package Act6;

import java.util.Arrays;

public class Act6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//9. Write a Java program to find duplicate values in an array of integer values.


		int[] arrayNum = {10, 20, 30, 40, 50, 50};
				
		System.out.println("Original Array " + Arrays.toString(arrayNum));
		findDuplicate(arrayNum);

		}
			
	public static void findDuplicate(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j] && i != j) {
					 System.out.println("Duplicate element: " + array[j]);
					}
				}
			}
		}
	
	}
