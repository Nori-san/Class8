package Act6;

public class Act6_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		25. Write a Java program to check if an array of integers contains two 
//		specified elements 65 and 77.
		
		int[] arrayNum = {10, 65, 6, 2, 77, 9};
		int specifiedNum1 = 77, specifiedNum2 = 65;
		System.out.println("Check if an array contains two specified elements 65 and 77");
		System.out.println(checkAnArray(arrayNum, specifiedNum1, specifiedNum2));

	}
	
	public static boolean checkAnArray (int[] array, int specifiedValue1, int specifiedValue2) {
		for (int num : array) {
			boolean isPresent = num == specifiedValue1 && num == specifiedValue2;
			if (isPresent) {
				return true;
				}
			}
		return false;
	}

}
