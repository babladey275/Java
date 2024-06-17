package exercise1;

import java.util.Scanner;

public class TriangleArea {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the base in cms: ");
		double b = input.nextDouble();
		System.out.print("Enter the permendicular height in cms: ");
		double h = input.nextDouble();
		double AreaOfTriangle = 0.5*b*h;
		System.out.println("Area of triangle is: " + AreaOfTriangle);		
		
		
	}

}
