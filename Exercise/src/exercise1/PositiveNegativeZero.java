package exercise1;

import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = input.nextInt();
		if(num > 0){
			System.out.println("The number is Positive.");
		}
		else if(num == 0){
			System.out.println("The number is Zero");
		}else {
			System.out.println("The number is Negative.");
		}
	}
}
