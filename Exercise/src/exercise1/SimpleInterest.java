package exercise1;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the principle amount of Tk.");
		int p = input.nextInt();
		System.out.print("Enter your Rate of interest: ");
		float r = input.nextFloat();
		System.out.print("Now, tell me how many years are you borrowing this money: ");
		float n = input.nextFloat();
		
		float interest = (p*r*n)/100;
		System.out.println("\nYour simple interest is Tk." + interest);

	}

}