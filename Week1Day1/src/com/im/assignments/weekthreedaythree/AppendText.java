package com.im.assignments.weekthreedaythree;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Week 1, Day 3 assignment
 * Append Text to a file
 * @author Isaac Manayath
 */

public class AppendText {

	public static void main(String[] args) throws IOException{
		appendingText();
	}
	
	//appends the text at the end of a file
	public static void appendingText()  throws IOException {
		
		File file = null;
		FileWriter fr = null;
		try{
			file = new File("./Check/example.txt");
			fr = new FileWriter(file, true);
			fr.write("text");
		}catch(FileNotFoundException ex) {
			ex.printStackTrace();
		}
		finally {
			fr.close();
		}
	}
}
