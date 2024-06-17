package exercise3;

public class ArraySumAverage {

	public static void main(String[] args) {
		int[] numArray = ArrayUtility.inputArray();
		long sum = sum(numArray);
		double avg = average(numArray);
		System.out.println("Sum of the numbers is: " + sum);
		System.out.println("Average of the numbers is: " + avg);

	}
	
	public static long sum(int[] numArray) {
		int sum = 0;
		int i = 0;
		while(i < numArray.length) {
			sum += numArray[i];
			i++;
		}
		return sum;
	}
	
	public static double average(int[] numArray) {
		double sum = sum(numArray);
		return sum/numArray.length;
	}
}
