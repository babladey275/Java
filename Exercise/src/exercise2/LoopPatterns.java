package exercise2;

import java.util.Scanner;

public class LoopPatterns {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the no of row: ");
		int rows = input.nextInt();
		printFirstPattern(rows);
		secondPattern(rows);
		thirdPattern(rows);
	}
	public static void printFirstPattern(int maxRows) {
		int rows = 0;
		while(rows < maxRows) {
			System.out.print("*");
			int i = 0;
			while(i < rows) {
				System.out.print(" *");
				i++;
			}
			System.out.println();
			rows++;
		}
	}
	
	public static void secondPattern(int maxRows) {
		int rows = maxRows;
		while(rows > 0) {
			int i = 0;
			while(i<rows) {
				System.out.print("* ");
				i++;
			}
			System.out.println();
			rows--;
		}
	}
	
	public static void thirdPattern(int maxRows) {
		int rows = maxRows;
		while(rows > 0) {
			int j = 0;
			while(j < rows-1) {
				System.out.print("  ");
				j++;
			}
			int i = 0;
			while(i <= (maxRows-rows)) {
				System.out.print("* ");
				i++;
			}
			System.out.println();
			rows--;
		}
	}

}
