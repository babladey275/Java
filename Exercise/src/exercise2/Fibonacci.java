package exercise2;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = input.nextInt();
		System.out.println("Here is the Fibonacci series: ");
		printFibo(num);
	}
	
	public static void printFibo(int num) {
		if(num < 0) return;
		System.out.print("0 ");
		if(num == 0) return;
		System.out.print("1 ");
		
		int first = 0, second = 1;
		while(first + second <= num) {
			int third = first + second;
			System.out.print(third + " ");
			first = second;
			second = third;
		}
	}
}
