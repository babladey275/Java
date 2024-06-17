package exercise1;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the principle amount of Tk.");
		int p = input.nextInt();
		System.out.print("Enter your rate of interest: ");
		float r = input.nextFloat();
		System.out.print("How many years are you borrowing this money: ");
		float n = input.nextFloat();
		
		double compoundInt = p * Math.pow((1 + r/100),n);
		System.out.println("\nYour compound interest is Tk." + compoundInt);

	}

}
