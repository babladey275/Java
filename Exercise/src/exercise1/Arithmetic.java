package exercise1;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the num1: ");
		int num1 = input.nextInt();
		System.out.print("Enter the num2: ");
		int num2 = input.nextInt();
		
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		int mod = num1 % num2;
		System.out.println("Summition is: " + sum);
		System.out.println("Subtraction is: " + sub);
		System.out.println("Multiplication is: " + mul);
		System.out.println("Division is: " + div);
		System.out.println("Modulus is: " + mod);

	}

}
