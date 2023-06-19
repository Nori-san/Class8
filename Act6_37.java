package Act6;

import java.util.Arrays;

public class Act6_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		37. Write a Java program to separate even and odd numbers from a given 
//		array of integers. Put all even numbers first, and then odd numbers. 

		int[] arrayNum = {24,12,17,10,8,23,3,1,0};
		System.out.println("Original Array " + Arrays.toString(arrayNum));
		seperateEvenAndOdds(arrayNum);
		System.out.println("Rearranging even and odd Array " + Arrays.toString(arrayNum));
	}

	public static void seperateEvenAndOdds(int[] array) {
		int i, n = array.length;
		int evenIndex = 0, oddIndex = n -1, temp;
		
    
		for ( i = 0; i < n; i++) {
        if (array[i]%2 == 0) {
            temp = array[evenIndex];
        	array[i] = temp;
        	evenIndex++;
	    } else {
	    	temp = array[oddIndex];
	    	array[oddIndex] = array[i];
	    	array[i] = temp;
        	oddIndex--;
        	i--;
			}
		}
	}
}
 	

