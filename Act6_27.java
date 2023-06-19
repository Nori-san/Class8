package Act6;

import java.util.Arrays;

public class Act6_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		27. Write a Java program to find the length of the longest consecutive 
//		elements sequence from an unsorted array of integers.
//		Sample array: [49, 1, 3, 200, 2, 4, 70, 5]
//		The longest consecutive elements sequence is [1, 2, 3, 4, 5], therefore the 
//		program will return its length 5.

		int[] arrayNum = {49, 1, 3, 200, 2, 4, 70, 5};
		System.out.println("Original Array " + Arrays.toString(arrayNum));
		int longSeqLength = findLongestConsecutiveElements(arrayNum);
		System.out.println("The longest consecutive elements sequence is " + longSeqLength);
	}
	
	public static int findLongestConsecutiveElements(int[] array) {
		Arrays.sort(array);
		int longSeqLength = 1, currSeqLength = 1;
		for (int i=1; i < array.length; i++) {
			if (array[i] != array[i -1]) {
				if (array[i] == array[i -1] +1) {
				currSeqLength++;
			}
			longSeqLength = Math.max(longSeqLength, currSeqLength);
			}
		
		}
		return longSeqLength;
	}

}
