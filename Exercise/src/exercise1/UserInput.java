package exercise1;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = input.nextLine();
		System.out.println("Good Morning " + name);
		System.out.print("Also tell me your age: ");
		int age = input.nextInt();
		System.out.println("Your age is: " + age);
	}

}