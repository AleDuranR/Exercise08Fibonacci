package com.exercise08fibonacci.app;

import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// Constant
		
		// Variables
		int userNum = 0;
		long fibonacci = 1;
		int count1 = 0;
		int count2 = 1;
				
		// Object declaration
		Scanner scan = new Scanner(System.in);
		
		// Input
		do {
			System.out.println("How many Fibonacci numbers?");
			userNum = scan.nextInt();
			if(userNum <= 0) {
				System.out.println("Input a number over 0!!! you smart guy!! 7.7");
			}
		}while(userNum <= 0);
			
		// Process
		// Do the process the number of times the user asked
		for(int i= 0; i < userNum; i++) {
			// Print fibonacci number
			System.out.print(fibonacci + " ");
			// Calculate the next fibonacci number of the series
			fibonacci = count1+count2;
			// Save the number before the series
			count1 = count2;
			// Save two numbers before the series 
			count2 = (int) fibonacci;
		}
		
		scan.close();

	}

}
