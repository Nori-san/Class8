package Act6;

public class Act6_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 18. Write a Java program to find a missing number in an array.

		int[] arrayNum = {1, 2, 4, 5, 6, 7};

		int missingNumber = findMissingNumber(arrayNum);

		System.out.println("The missing number is: " + missingNumber);
	}

	public static int findMissingNumber(int[] array) {
		int n = array.length +1; 
		 int sum = (n * (n + 1)) / 2;
		int actualSum = 0;
		for (int i = 0; i < array.length; i++) {
			actualSum += array[i];
		}

		return sum - actualSum;
	}
}
