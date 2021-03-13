package com.im.assignments.weekthreedaythree;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Week 1, Day 3 assignment
 * Count the number of characters from a file
 * @author Isaac Manayath
 */

public class CountCharacter {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character to count");
		char charCount = sc.next().charAt(0); 
		
		FileInputStream file = null;
		BufferedReader buffReader = null;
		int count = 0;
		
		try {
		
		file = new FileInputStream("./Check/example.txt");
		buffReader = new BufferedReader(new InputStreamReader(file));
		
		int singleByte;
		char charByte;
		
		//goes through every character, and counts the character for each matched character 
		while((singleByte = buffReader.read()) != -1) {
	         charByte = (char) singleByte; 
	         if (charCount == charByte) {
					count++;
			}
	    }            
		System.out.println(count);
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			buffReader.close();
		}
	}
}
