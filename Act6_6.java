package Act6;

import java.util.Arrays;

public class Act6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//6. Write a Java program to insert an element (specific position) into an array.
		
		int[] arrayNum = {10, 20, 30, 40, 50};
		int specificNum = 60, indexPosition = 5;
		
		System.out.println("Original Array " + Arrays.toString(arrayNum));
		System.out.println("Insert " + specificNum + " in index [" + indexPosition + "]" );
		System.out.println("Original Array " + Arrays.toString(insertElementIndex(arrayNum, specificNum, indexPosition)));

	}
	
	public static int[] insertElementIndex(int[] array, int specificValue, int indexPosition) {
		int[] insertIndex = new int[array.length + 1];
		for (int i = 0; i < indexPosition; i++) {
			insertIndex[i] = array[i];
		}
		insertIndex[indexPosition] = specificValue;
		for(int i = indexPosition; i < array.length; i++) {
			insertIndex[i + 1] = array[i];
		}
		return insertIndex;
	}

}
