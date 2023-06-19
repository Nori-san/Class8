package Act6;

import java.util.Arrays;

public class Act6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//10. Write a Java program to find duplicate values in an array of string values.
		String[] arrayWords = {"laptop", "mouse", "keyboard", "laptop", "phone"};
		
		System.out.println("Original Array " + Arrays.toString(arrayWords));
		System.out.println("The duplicated word is: ");
		findDuplicates(arrayWords);
		
	}
	
	public static void findDuplicates(String[] array) {
		for(int i = 0; i < array.length; i++) {
			for (int j = i +1 ; j < array.length; j++) {
				if (array[i] == array[j] && i != j) {
					System.out.println(array[j]);
				}
			}
		}
	}
}
