package com.im.assignments.weektwodaytwo;
import java.util.Scanner;

/**
 * Week 1, Day 2 assignment
 * Take multiple values from the command line and show the result of adding all of them
 * @author Isaac Manayath
 */

public class CommandLineAdd {
	public static void main(String [] args) {
		System.out.println("Enter as many numbers as you can, and the program will add them all up");
		Scanner sc = new Scanner(System.in);
		// Initialize sum and count of input elements 
        double sum = 0;
        double num = 0; 
  
        while (num != -1){
            try {
                num=Double.parseDouble(sc.nextLine());
                sum+=num;
            }
            //catch any input that is not an double
            catch(NumberFormatException e){
                System.out.println("That is not an double, please try again." );
            }
            //finally testing
            finally {
            	System.out.println("\"Finally\" Testing");
            }
        }
        
        System.out.println("Sum: " + sum); 
        
	}
}
