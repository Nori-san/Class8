package Act6;

import java.util.Arrays;

public class Act6_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		22. Write a Java program to compute the average value of an array of integers 
//		except the largest and smallest values.
		
		int[] arrayNum = {1, 2, 3, 4, 5, 6, 7};
		int max = findingMax(arrayNum),
			min = findingMin(arrayNum),
			sum = arrayNum[0];
		 for (int i = 0; i < arrayNum.length; i++) {
			 sum += arrayNum[i];
		 }
		 
		 float average = ((sum - max - min) / (arrayNum.length -2));	
		 
		 System.out.println("Original Array " + Arrays.toString(arrayNum));
		 System.out.printf("The average of an array except the Min and Max: %.2f", average);
	}
	
	public static int findingMax(int[] array) {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			 max = Math.max(max, array[i]);
		}
		return max;
	}
	
	public static int findingMin(int[] array) {
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			 min = Math.min(min, array[i]);
		}
		return min;
	}
	
}
