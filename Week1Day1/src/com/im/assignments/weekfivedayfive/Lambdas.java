package com.im.assignments.weekfivedayfive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Week 1, Day 5 assignment
 * Lambdas and functional interfaces and streams
 * @author Isaac Manayath
 */

public class Lambdas {
	/*
	• length (i.e., shortest to longest)
	(Hint: this exact solution was shown in the lecture)
	*/
	public static void main(String[]args) {
			
	String[] strings = {"apple", "orange", "pear", "banana"};
    Arrays.sort(strings, (s1, s2) -> s1.length() - s2.length());
    Arrays.asList(strings).forEach(System.out::println);
	
	
	/*
	• reverse length (i.e., longest to shortest)
	(Hint: minor variation of the first bullet)
	*/
    System.out.println("\nLongest to shortest: ");
    Arrays.sort(strings, (s1, s2) -> (s2.length() - s1.length()));
    Arrays.asList(strings).forEach(System.out::println);
	
	
	/*
	• alphabetically by the first character only
	(Hint: charAt(0) returns the numeric code for the first character)
	*/
	System.out.println();
	System.out.println("Sorting array strings = ");
    Arrays.sort(strings, (str1, str2) -> str1.charAt(0) - str2.charAt(0));
    Arrays.asList(strings).forEach(System.out::println);
	
	/*
	• Strings that contain “e” first, everything else second. For now, put the code directly in the lambda.
	(Hint: remember that the body of a lambda is allowed to have curly braces and a return statement.
	See the first two lambda examples in the notes.)
	*/
	System.out.println("\nStrings that contain ?e? first, everything else second: ");
    Arrays.sort(strings, (s1, s2) -> {if (s1.contains("e") && s2.contains("e")) {
        return 0;
    } else if (s1.contains("e")) {
        return -1;
    } else {
        return 1;
    }
    });
    Arrays.asList(strings).forEach(System.out::println);
	
	/*
	• Redo the previous problem, but use a static helper method so that your lambda looks like this:
	Arrays.sort(words, (s1,s2) -> Utils.yourMethod(s1,s2))
	*/
    System.out.println("\nStrings that contain ?e? first, everything else second but using a static helper method: ");
    
    strings = SortByE(strings);
    
     Arrays.asList(strings).forEach(System.out::println);

	
	/*
	Using Java 8 features write a method that returns a comma separated string based on a given list of integers. Each element should be preceded by the letter 'e' if the number is even, and preceded by the letter 'o' if the number is odd.
	 For example, if the input list is (3,44), the output should be 'o3,e44'.
	Given a list of Strings, write a method that returns a list of all strings that start with the letter 'a' (lower case) and have exactly 3 letters. TIP: Use Java 8 Lambdas and Streams API's.
	*/
     System.out.println("\nList of integers to comma separated string with 'e' or 'o' appended to the beginning of every entry ");
     List<Integer> list=new ArrayList<Integer>();  
     list.add(1);
     list.add(2);
     list.add(3);
     list.add(4);
     list.add(5);
     list.add(6);
     list.add(7);
     list.add(8);
     list.add(9);
     list.add(10);
 
     List<Integer> myIntsList = list;
		String commaSeparated = myIntsList
			.stream()
			.map((n) -> {
				if (n % 2 == 0) {
					return "e" + n;
				} else {
					return "o" + n;
				}
			})
			.reduce("", (s1, s2) -> s1.isEmpty() ? s2 : s1 + ", " + s2);
		System.out.println(commaSeparated);
		System.out.println();
     
		/*
		Given a list of Strings, write a method that returns a list of all strings that start with the 
		letter 'a' (lower case) and have exactly 3 letters. TIP: Use Java 8 Lambdas and Streams API's.
		*/
		
		List<String> listString = new ArrayList<String>();
		listString.add("app");
		listString.add("orange");
		listString.add("pea");
		listString.add("ate");
		System.out.println(threeLetters(listString));
		
	}
		
    public static String [] SortByE(String [] strings){
        
        // String [] returnString = strings;
         
        Arrays.sort(strings, (s1, s2) -> {if (s1.contains("e") && s2.contains("e")) {
            return 0;
        } else if (s1.contains("e")) {
            return -1;
        } else {
            return 1;
        }
        });
        //return returnString;
		return strings;
         
     }
     
     public static String getRandomElement(List<String> list) 
     { 
         Random rand = new Random(); 
         //System.out.println(list.size());
         return list.get(rand.nextInt(list.size())); 
     } 
     
 	public static List<String> threeLetters(List<String> strings) {
		return strings.stream().filter(str -> str.startsWith("a") && str.length() == 3).collect(Collectors.toList());
	}
}
