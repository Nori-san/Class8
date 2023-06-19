package Act6;

public class Act6_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//17. Write a Java program to test two arrays' equality.
		int[] arrayNum1 = {10, 20, 30, 40, 50};
		int[] arrayNum2 = {10, 20, 30, 40, 50};
		
		if (testArrayEquality(arrayNum1, arrayNum2) == true) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}

	}

	public static boolean testArrayEquality(int[] array1, int[] array2) {
		if (array1.length != array2.length) {
			return false;
		}
		
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}
		return true;
	}
}
