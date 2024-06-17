package exercise2;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int first = input.nextInt();
		System.out.print("Enter the second number: ");
		int second = input.nextInt();
		
		int gcd = greatestCommonDivisor(first, second);
		System.out.println("GCD of the two numbers is: " + gcd);

	}
	
	public static int greatestCommonDivisor(int num1, int num2) {
		int gcd = 1;
		int i = 2;
		int least = least(num1, num2);
		while(i <= least) {
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
			i++;
		}
		return gcd;
	}
	
	public static int least(int num1, int num2) {
		if(num1 < num2) {
			return num1;
		} else {
			return num2;
		}
	}

}
