package Act6;

import java.util.Arrays;

public class Act6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4. Write a Java program to remove a specific element from an array.
		int[] arrayNum = {10, 20, 30, 40, 50};
		int specificNum = 30;
		
		//Removing Index element
		System.out.println("Original Array " + Arrays.toString(arrayNum));
		System.out.println("Removing " + specificNum + " in the array");
		System.out.println("Updated Array " + Arrays.toString(removeElementIndex(arrayNum, specificNum)));
		
	}
	
	//Method to remove Element Index
	public static int[] removeElementIndex(int[] array, int specificValue) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == specificValue) {
				count++;
			}
		}
		int[] removeIndex = new int[array.length - count];
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != specificValue) {
				removeIndex[index] = array[i];
				index++;
			}
		}
		return removeIndex;
	}

}