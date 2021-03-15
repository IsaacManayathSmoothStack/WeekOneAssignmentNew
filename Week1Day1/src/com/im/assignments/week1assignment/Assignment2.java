package com.im.assignments.week1assignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Week 1, Week 1 Assignment Assignment 2, Functional
 * 
 * @author Isaac Manayath
 */

public class Assignment2 {

	// Given a list of non-negative integers, return an integer list 
	//of the rightmost digits. (Note: use %)

	// rightDigit([1, 22, 93]) → [1, 2, 3]
	// rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
	// rightDigit([10, 0]) → [0, 0]

	public static void main(String[] args) {
		List<Integer> list = new LinkedList();
		list.add(59);
		list.add(288);
		list.add(33);
		List<Integer> result = rightDigit(list);
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}

	/**
    *
    * @param a list 
    * @return rightmost digits
    */
	public static List<Integer> rightDigit(List<Integer> nums) {
		nums.replaceAll(n -> n % 10);
		return nums;
	}
}
