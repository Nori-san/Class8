package Act6;

public class Act6_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		26. Write a Java program to remove duplicate elements from a given array and 
//		return the updated array length.
//		Sample array: [20, 20, 30, 40, 50, 50, 50]
//		After removing the duplicate elements the program should return 4 as the new 
//		length of the array.
		
		int[] arrayNum = {20, 20, 30, 40, 50, 50, 50};
		System.out.println("Original array length: "+ arrayNum.length);
		for ( int i = 0; i < arrayNum.length; i++) {
		System.out.print(arrayNum[i] + " ");
		}
		System.out.print("\nUpdated array length: " +removeDuplicates(arrayNum));
		
	}

		public static int removeDuplicates(int[] array) {
			int index = 1;
			for(int i = 0; i < array.length; i++) {
				for (int j = i +1 ; j < array.length; j++) {
					if (array[i] != array[index -1]) {
						array[index++] = array[i];
					}
				}
			}
			return index;
		}
	}
