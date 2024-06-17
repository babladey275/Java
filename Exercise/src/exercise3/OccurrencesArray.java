package exercise3;

import java.util.Scanner;

public class OccurrencesArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numArr = ArrayUtility.inputArray();
		System.out.print("Enter the number you want to find: ");
		int num = input.nextInt();
		int occurrences = noOfOccurences(numArr, num);
		System.out.print("Your element was found " + occurrences + " times in the array");

	}
	
	public static int noOfOccurences(int[] numArr, int num) {
		int occ = 0;
		int i = 0;
		while(i < numArr.length) {
			if(numArr[i] == num) {
				occ++;
			}
			i++;
		}
		return occ;
	}

}
