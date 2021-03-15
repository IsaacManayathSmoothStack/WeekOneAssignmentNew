package com.im.assignments.week1assignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Week 1, Week 1 Assignment, Assignment 3, Functional
 * 
 * @author Isaac Manayath
 */

public class Assignment3 {
	public static void main(String[] args) {

		// Given a list of integers, return a list where each integer is multiplied by 2

		/// doubling([1, 2, 3]) → [2, 4, 6]
		// doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
		// oubling([]) → []

		List<Integer> list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		List<Integer> result = doubling(list);
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}

	}

	/**
    *
    * @param generated a list to be doubled by two
    * @return a list to be doubled by two
    */
	public static List<Integer> doubling(List<Integer> nums) {
		nums.replaceAll(n -> n * 2);
		return nums;
	}

}
