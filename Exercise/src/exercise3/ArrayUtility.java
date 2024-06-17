package exercise3;

import java.util.Scanner;

public class ArrayUtility {
	
	public static int[] inputArray() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number of elements: ");
		int size = input.nextInt();
		int[] nums = new int[size];
		int i = 0;
		while(i < size) {
			System.out.print("Please enter element no" + (i + 1) + ": ");
			nums[i] = input.nextInt();
			i++;
		}
		return nums;
	}
	
	public static int[][] input2DArray() {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the number of rows: ");
		int rows = input.nextInt();
		System.out.print("Please enter the number of colums: ");
		int colums = input.nextInt();
		int[][] numArray = new int[rows][colums];
		int i = 0;
		while(i < rows) {
			int j = 0;
			while(j < colums) {
				System.out.print("Please enter element row" + (i + 1) 
						+ ", column " + (j + 1) + ": ");
				numArray[i][j] = input.nextInt();
				j++;
			}
			i++;
		}
		return numArray;
	}
	
	public static void display(int[] numArray) {
		int i = 0;
		while(i < numArray.length) {
			System.out.print(numArray[i] + " ");
			i++;
		}
	}
}
