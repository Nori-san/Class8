package Act6;

public class Act6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//3. Write a Java program to find the index of an array element.
		
		int[] arrayNum = {10, 20, 30, 40, 50};
		int specificNum = 30;
		
		System.out.println("Find the index of " + specificNum + " in the array");
		System.out.println("Specific Value is in index [" + findElementIndex(arrayNum, specificNum) + "]");
		
	}
	public static int findElementIndex(int[] array, int specificValue) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == specificValue) {
				return i;
			}
		}
		return -1;
		
	}

}
