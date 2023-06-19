package Act6;

import java.util.Arrays;

public class Act6_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		36. Write a Java program that separates 0s on the left hand side and 1s on the 
//		right hand side from a random array of 0s and 1. 

		int[] arrayNum = { 0, 0, 1, 1, 0, 1, 1, 1,0 };
		System.out.println("Original Array " + Arrays.toString(arrayNum));
		int[] seperateArray = seperateZeroAndOne(arrayNum, arrayNum.length);
		System.out.println("0's and 1's sorted Array " + Arrays.toString(seperateArray));
	}
	
	public static int[] seperateZeroAndOne(int[] array, int n) {
		int count = 0, i;
    
		for ( i = 0; i < n; i++) {
        if (array[i] == 0)
            count++;
	    }
		for ( i = 0; i < count; i++) {
			array[i] = 0;
		}
			
		for ( i = count; i < n; i++) {
			array[i] = 1;
		}
		return array;
			
 	}  

}
