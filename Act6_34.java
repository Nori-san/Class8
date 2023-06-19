package Act6;

import java.util.Arrays;

public class Act6_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		34. Write a Java program to arrange the elements of an array of integers so 
//		that all positive integers appear before all negative integers. 
		
		int[] arrayNum = {-6, 5, 9, -2, 10, -1, 3, 12, 13, -11};
		
		System.out.println("Original Array " + Arrays.toString(arrayNum));
		arrangeElements(arrayNum);
		System.out.println("Rearraged Array " + Arrays.toString(arrayNum));

	}
	public static void arrangeElements(int[] array) {
		int n = array.length, index =0;
		for (int i = 0; i < n ; i++) {
				if (array[i] > 0) {
					int temp = array[i];
					array[i] = array[index];
					array[index] = temp;
					index++;
			}
		}
	}

}