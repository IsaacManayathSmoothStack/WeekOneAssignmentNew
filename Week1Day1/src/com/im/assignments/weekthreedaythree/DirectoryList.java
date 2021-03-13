package com.im.assignments.weekthreedaythree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Week 1, Day 3 assignment
 * Print the file structure
 * @author Isaac Manayath
 */

public class DirectoryList {
	
	public static void main(String[] args){

		//walks through a directory, and prints out all the subdirectories and files  
		try (Stream<Path> paths = Files.walk(Paths.get("./src"))) {
		    paths
		        .filter(Files::isRegularFile)
		        .forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
