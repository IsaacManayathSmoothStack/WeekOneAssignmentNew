package com.im.assignments.weekonedayone;

/**
 * Week 1, Day 1 assignment
 * print star dashes according Slide 18
 */

public class PrintPattern {
	public static void main (String [] args) {
		System.out.println("1)");
		LeftDown();
		printDashLine(9);
		System.out.println();
		System.out.println("2)");
		printDashLine(10);
		RightDown();
		System.out.println("3)");
		CenterDown();
		printDashLine(11);
		System.out.println();
		System.out.println("4)");
		printDashLine(12);
		CenterUp();
	}
	
	/**
    *
    * @param number of dashes printed
    */
	public static void printDashLine(int x){

		for(int i = 0; i < x; i++) {
			System.out.print("-");
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
	
	//print a star pattern from center down
	public static void CenterDown() {
		String star = "*";
		for(int i = 1, k = 5; i < 9; i=i+2,k--) {
			
			for(int a = 0; a < k; a++) {
				System.out.print(" ");
			}
			
		 	for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//print a star pattern from center up
	public static void CenterUp() {
		String star = "*";
		for(int i = 9, k = 2; i > 1;i=i-2, k++) {
			
			for(int a = 0; a < k; a++) {
				System.out.print(" ");
			}
			
			for(int j = 2; i > j; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
