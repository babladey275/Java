package exercise1;

import java.util.Scanner;

public class Bitwise {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the first number: ");
		int first = input.nextInt();
		System.out.print("Please enter the second number: ");
		int second = input.nextInt();
		
		int andOperator = first & second;
		System.out.println("Result is: " + andOperator);
		
		int orOperator = first | second;
		System.out.println("OR Result is: " + orOperator);
		
		int XorOperator = first ^ second;
		System.out.println("Xor Result is: " + XorOperator);
		
		int compliment = ~ first;
		System.out.println("Compliment result is: " + compliment);
		
		int leftShift = first << 1;
		System.out.println("LeftShift result is: " + leftShift);
		
		int rightShift = first >> 1;
		System.out.println("LeftShift result is: " + rightShift);


	}

}
