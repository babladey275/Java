package exercise1;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value of temperature in fahrenheit: ");
		float F = input.nextFloat();
		
		float celsius = (F-32)* 5.0f / 9.0f;	
		System.out.println("\nTemperature in celsius is: " + celsius);

	}

}

