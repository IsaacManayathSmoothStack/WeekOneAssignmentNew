package com.im.assignments.week1assignment;

/**
 * Week 1, Week 1 Assignment
 * Assignment 1, Lambdas
 * @author Isaac Manayath
 */

/*
 * 
 * Write the following methods that return a lambda expression performing a specified action:

PerformOperation isOdd(): The lambda expression must return  if a number is odd or  if it is even.
PerformOperation isPrime(): The lambda expression must return  if a number is prime or  if it is composite.
PerformOperation isPalindrome(): The lambda expression must return  if a number is a palindrome or  if it is not.
Input Format

Input is handled for you by the locked stub code in your editor.

Output Format

The locked stub code in your editor will print  lines of output.

Sample Input

The first line contains an integer,  (the number of test cases).

The  subsequent lines each describe a test case in the form of  space-separated integers:
The first integer specifies the condition to check for ( for Odd/Even,  for Prime, or  for Palindrome). The second integer denotes the number to be checked.

5
1 4
2 5
3 898
1 3
2 12

Sample Output

EVEN
PRIME
PALINDROME
ODD
COMPOSITE

 */

import java.io.*;
import java.util.*;

interface PerformOperation {
	boolean check(int a);
}

class MathTypeChecker {
	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}

	public static PerformOperation isOdd() {
		return n -> (n % 2) == 1;
	}

	public static PerformOperation isPrime() {
		return n -> {
			if (n < 2) {
				return false;
			} else if (n == 2) {
				return true;
			} else if (n % 2 == 0) {
				return false;
			}
			int sqrt = (int) Math.sqrt(n);
			for (int i = 3; i <= sqrt; i += 2) {
				if (n % i == 0) {
					return false;
				}
			}
			return true;
		};
	}

	public static PerformOperation isPalindrome() {
		return n -> {

			int reversedNum = 0, remainder, originalNum;
			originalNum = n;

			// reversed integer is stored in variable
			while (n != 0) {
				remainder = n % 10;
				reversedNum = reversedNum * 10 + remainder;
				n /= 10;
			}

			// palindrome if orignalInteger and reversedInteger are equal
			if (originalNum == reversedNum) {
				return true;
			} else {
				return false;
			}
		};
	}
}

public class Assignment1 {

	public static void main(String[] args) throws IOException {
		MathTypeChecker mtc = new MathTypeChecker();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		PerformOperation op;
		while (input-- > 0) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1) {
				op = mtc.isOdd();
				if (mtc.checker(op, num)) {
					System.out.println("ODD");
				} else {
					System.out.println("Even");
				}
			} else if (ch == 2) {
				op = mtc.isPrime();
				if (mtc.checker(op, num)) {
					System.out.println("PRIME");
				} else {
					System.out.println("COMPOSITE");
				}
			} else if (ch == 3) {
				op = mtc.isPalindrome();
				if (mtc.checker(op, num)) {
					System.out.println("PALINDROME");
				} else {
					System.out.println("NOT PALINDROME");
				}
			}
		}
	}
}
