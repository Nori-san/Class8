package Act6;

import java.util.Arrays;

public class Act6_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//13. Write a Java program to remove duplicate elements from an array.
		
		int[] arrayNum = {20, 20, 30, 40, 50, 50, 50};
		System.out.println("Original array : " + Arrays.toString(arrayNum));
		System.out.println("Updated array : " );
		removeDuplicate(arrayNum);
	}
	
	public static void removeDuplicate(int[] array) {
		int n = array.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (array[i] == array[j]) {
					array[j] = array[n-1]; //Replace duplicate element with last element
					n--;
					j--;
				}
			}
		}
		
		//Copying no duplicated elements of array into updatedArray
		int[] newArray = Arrays.copyOf(array, n);
		//Printing arrayWithoutDuplicates
		for (int i = 0; i < newArray.length; i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println();
	}
}
