package exercise3;

public class MaxMinArray {

	public static void main(String[] args) {
		int[] numArr = ArrayUtility.inputArray();
		int max = max(numArr);
		int min = min(numArr);
		System.out.println("Maximum of the array is: " + max);
		System.out.println("Minimum of the array is: " + min);

	}
	
	public static int min(int[] numArr) {
		int min = Integer.MAX_VALUE;
		int i = 0;
		while(i < numArr.length) {
			if(min > numArr[i]) {
				min = numArr[i];
			}
			i++;
		}
		return min;
	}
	
	public static int max(int[] numArr) {
		if(numArr.length == 0) {
			return Integer.MIN_VALUE;
		}
		int max = numArr[0];
		int i = 1;
		while(i < numArr.length) {
			if(max < numArr[i]) {
				max = numArr[i];
			}
			i++;
		}
		return max;
	}

}
