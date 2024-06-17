package exercise3;

public class DiagonalSum2DArray {

	public static void main(String[] args) {
		int[][] numArr = ArrayUtility.input2DArray();
		long sum = sumOfDiogonals(numArr);
		System.out.println("\nSum of diogonals is: " + sum);

	}

	public static long sumOfDiogonals(int[][] numArr) {
		long leftSum = sumOfLeftDiagonal(numArr);
		long rightSum = sumOfRightDiagonal(numArr);
		long sum = leftSum + rightSum;
		if(numArr.length % 2 != 0) {
			int ind = numArr.length / 2;
			sum -= numArr[ind][ind];
		}
		return sum;
	}
	
	public static long sumOfLeftDiagonal(int[][] numArr) {
		long sum = 0;
		int i = 0;
		while (i < numArr.length) {
			sum += numArr[i][i];
			i++;
		}
		return sum;
	}

	public static long sumOfRightDiagonal(int[][] numArr) {
		long sum = 0;
		int i = 0;
		while(i < numArr.length) {
			int col = numArr.length - 1 -i;
			sum +=numArr[i][col];
			i++;
	}
	return sum;
	}
}
