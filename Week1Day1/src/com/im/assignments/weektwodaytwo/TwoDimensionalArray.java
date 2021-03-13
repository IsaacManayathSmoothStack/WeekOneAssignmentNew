package com.im.assignments.weektwodaytwo;

/**
 * Week 1, Day 2 assignment
 * Find the max number and show it’s position in an array
 * @author Isaac Manayath
 */

public class TwoDimensionalArray {
	
	public static void main(String[] args) {
		int[][] twoDArray = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
		maxNumberAndPostion(twoDArray);	
	}
	
	/**
    *
    * @param generated number from 1 to 100
    * @return "1" for win, "-1" you did not guessed the number 
    */
	public static void maxNumberAndPostion(int[][] twoDArray) {
		int max = 0;
		int posX = 0;
		int posY = 0;
		for(int i = 0; i < twoDArray.length; i++) {
			for (int j = 0; j < twoDArray[i].length; j++){
				if(twoDArray[i][j] > max) {
					max = twoDArray[i][j];
					posX = i;
					posY = j;
				}
			}
		}
		
		System.out.println("The max number in two dimensional array is " + max + " and its position at (" + posX + ", " + posY + ").");
	}



}