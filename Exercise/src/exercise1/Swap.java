package exercise1;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("wellcome to swapping station \n\n");
		System.out.print("Enter the value of x: ");
		int x = input.nextInt();
		System.out.print("Enter the value of y: ");
		int y = input.nextInt();
		int z = x;
		x = y;
		y = z;
		System.out.println("\nAfter swapping:\n");
		System.out.println("Value of x: " + x);
		System.out.println("Value of y: " + y);
		
		
	}

}
