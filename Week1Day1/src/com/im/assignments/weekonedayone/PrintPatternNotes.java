package com.im.assignments.weekonedayone;

/**
 * Week 1, Day 1 assignment
 * print star dashes according Slide 19 notes
 */

public class PrintPatternNotes {
	public static void main (String [] args) {
		System.out.println("1)");
		LeftDown();
		printDotLine(5);
		System.out.println();
		System.out.println("2)");
		CenterDown();
		printDotLine(5);
		System.out.println();
		System.out.println("3)");
		printDotLine(5);
		RightDown();
	}
	
	/**
    *
    * @param number of dot printed
    */
	public static void printDotLine(int x){

		for(int i = 0; i < x; i++) {
			System.out.print(".");
		}
		System.out.println();
		
	}
	
	//print a star pattern from left down
	public static void LeftDown() {
		String star = "*";
		for(int i = 1; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	//print a star pattern from center down
	public static void CenterDown() {
		String star = "*";
		for(int i = 1, k = 5; i < 5; i++,k--) {
			
			for(int a = 0; a < k; a++) {
				System.out.print(" ");
			}
			
		 	for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//print a star pattern from right down
	public static void RightDown() {
		String star = "*";
		for(int i = 5; i > 0; i--) {
			for(int j = 1; i > j; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

	
}