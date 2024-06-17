package exercise1;

import java.util.Scanner;

public class Perimeter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please all sides in cms: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double result = a+b+c+d;
		System.out.println("Perimeter of your rectangular is: " + result +"cm");

	}

}

