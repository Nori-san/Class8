package Act6;

import java.util.Arrays;

public class Act6_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		35. Write a Java program to sort an array of positive integers from an array. In 
//		the sorted array the value of the first element should be maximum, the second 
//		value should be a minimum, third should be the second maximum, the fourth 
//		should be the second minimum and so on. 
		
		int[] arrayNum = {1, 2, 4, 5, 6, 7};
		
		System.out.println("Original Array " + Arrays.toString(arrayNum));
		int[] sortArray = arrangeElements(arrayNum, arrayNum.length);
		System.out.println("ReArranged Array " + Arrays.toString(sortArray));
	}
	
	public static int[] arrangeElements( int[] array, int n) {
		int temp[] = new int[n];
		int minIndex =0, maxIndex = n-1, i;
		boolean marker = true;
		
		for (i = 0; i < n; i++) {
			if (marker) {
				temp[i] = array[maxIndex--];
			} else {
				temp[i] = array[minIndex++];
				
			}
			marker = !marker;
		}
		return temp;
	}

}
