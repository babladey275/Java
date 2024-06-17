package exercise2;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int first = input.nextInt();
		System.out.print("Enter the second number: ");
		int second = input.nextInt();
		
		int lcm = leastCommonMultiple(first, second);
		System.out.println("LCM of the two numbers is: " + lcm);
		
	}

	public static int leastCommonMultiple(int num1, int num2) {
		int i = 1;
		while(true) {
			int factor = num2 * i;
			if(factor % num1 == 0) {
				return factor;
			}
			i++;
		}
	}
}
