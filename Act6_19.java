package Act6;

import java.util.Arrays;

public class Act6_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		//19. Write a Java program to move all 0's to the end of an array. Maintain the 
//		relative order of the other (non-zero) array elements.
		
		int[] arrayNum = {0,0,1,0,3,0,5,0,6};
		System.out.println("Original Array " + Arrays.toString(arrayNum));
		moveAllZero(arrayNum);
		System.out.println("Moving all zero to the end of the Array " + Arrays.toString(arrayNum));
	}
	
	public static void moveAllZero(int[] array) {
		int trackIndex = 0;
		for(int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				array[trackIndex] = array[i];
				trackIndex++;
			}
		}
		while (trackIndex < array.length) {
			array[trackIndex] = 0;
			trackIndex++;
		}
	}

}
