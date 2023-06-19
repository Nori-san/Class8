package Act6;

import java.util.Arrays;

public class Act6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//5. Write a Java program to copy an array by iterating the array.

		int[] arrayNum = {10, 20, 30, 40, 50};
				
		System.out.println("Original Array " + Arrays.toString(arrayNum));
		System.out.println("Copied Array " + Arrays.toString(copyArray(arrayNum)));

		}
			
	public static int[] copyArray(int[] array) {
		int[] copyArray = new int[array.length];
		for (int i=0; i < array.length; i++) {
			copyArray[i] = array[i];
			}
		return copyArray;
		}
	}

