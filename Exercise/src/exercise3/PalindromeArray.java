package exercise3;

public class PalindromeArray {

	public static void main(String[] args) {
		int[] numArr = ArrayUtility.inputArray();
		boolean isPalin = isPalindrome(numArr);
		if(isPalin) {
			System.out.println("\nYour array is a palindrome.");
		} else {
			System.out.println("\nYour array is not a palindrome.");
		}

	}

	public static boolean isPalindrome(int[] numArr) {
		int i = 0;
		while(i < numArr.length / 2) {
			if(numArr[i] != numArr[numArr.length -1 -i]) {
				return false;
			}
			i++;
		}
		return true;
	}
}
