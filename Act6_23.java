package Act6;

public class Act6_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		23. Write a Java program to check if an array of integers is without 0 and -1.
		
		int[] arrayNum = {1, 2, 3, 4, 5, 6, 7};
		
		System.out.println(checkAnArray(arrayNum));
	}

	public static boolean checkAnArray(int[] array) {
		for (int num : array) {
			if (num == 0 || num == -1) {
				return true;
			}
		}
		return false;
	}
}
