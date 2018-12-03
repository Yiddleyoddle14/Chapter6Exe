package amen14;

import java.util.Scanner;
/*
 * Ailsa Mensinger
 * 11-29-18
 */

public class GuessMyNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int guess = 0;
		int num= (int)(Math.random() *100);
		System.out.println("Enter a guess from 1-100");
		guess = input.nextInt();
		int attempts = 0;
		attempts++;
		
		while (guess!=num) {
			
			if (guess<num) {
				System.out.println("Guess higher");
			}
			else {
				System.out.println("Guess lower");
			}
			guess = input.nextInt();
			attempts++;
		}
		System.out.println("You got it!");
		System.out.println("It took you " +attempts+ " attempts");
		
		
		guess = 0;
		num = (int)(Math.random()*100);
		do {
			if (guess < num) {
				System.out.println("Guess higher");
			}
			else {
				System.out.println("Guess lower");
			}
			guess = input.nextInt();
			attempts++;
		} while (guess != num);
		System.out.println("You got it!");
		System.out.println("It took you " +attempts+ " attempts");
		for (guess = 0; guess != num; guess = input.nextInt()) {
			if (guess < num) {
				System.out.println("Guess higher");
			}
			else {
				System.out.println("Guess lower");
			}
			guess = input.nextInt();
			attempts++;
			System.out.println("You got it!");
			System.out.println("It took you " +attempts+ " attempts");
		}

	
		
	}

}
