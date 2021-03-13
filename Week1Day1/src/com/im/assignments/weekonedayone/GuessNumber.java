package com.im.assignments.weekonedayone;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Week 1, Day 1 assignment
 * Guess number from a list of 100
 */

public class GuessNumber {

	public static void main(String[] args) {
		
		System.out.println("Guess a number between 1 and 100");
		Random rand = new Random();
		int generatedNumber = getRandomValue(); 
		int number = guess(generatedNumber);
		
		if(number == 1) {
			System.out.println("You guessed the number arond 10 of the number and the generated number is: " + generatedNumber);
		}
		else {
			System.out.println("Sorry, the generated number is: " + generatedNumber);
		}
	}
	
	/**
    *
    * @param generated number from 1 to 100
    * @return "1" for win, "-1" you did not guessed the number 
    */
	public static int guess(int generated) {
		
		Scanner sc = new Scanner(System.in);
		int x = 5;
		int guess = 0;
		while(x > 0) {
			System.out.println("Enter number at 10 or less, and only " + x + " chances left");
			guess = sc.nextInt();
			if(generated >= guess) {
				if(generated - guess <= 10) {
					return 1;
				}
			}
			else if (generated < guess) {
				if(guess - generated <= 10) {
					return 1;
				}
			}
			x--;
		}
		return -1;
	}
	
	//generate a number from 1 to 100
	public static int getRandomValue() 
    { 

        return ThreadLocalRandom 
            .current() 
            .nextInt(1, 100 + 1); 
    } 

}
