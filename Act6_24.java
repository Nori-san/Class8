package Act6;

public class Act6_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		24. Write a Java program to check if the sum of all the 10's in the array is 
//		exactly 30. Return false if the condition does not satisfy, otherwise true.
		
		int[] arrayNum = {10, 10, 6, 2, 10, 7};
		int ten = 10, sum = 30;
		System.out.println("Sum of all the 10's in the array is exactly 30");
		System.out.println(sumOfAllTenEquals30(arrayNum, ten, sum));
		

	}

	public static boolean sumOfAllTenEquals30(int[] array, int ten, int sum) {
		int tempSum = 0;
		
		for (int i=0; i<array.length; i++) {
			if (array[i] == ten) {
				tempSum += ten;
			}
			if (tempSum > sum) {
				break;
			}
		}
		return sum == tempSum;
	}
}
