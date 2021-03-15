package com.im.assignments.week1assignment;

import java.util.ArrayList;
import java.util.List;

/**
 * Week 1, Week 1 Assignment Assignment 5, Recursion
 * 
 * @author Isaac Manayath
 */

public class Assignment5 {

	/*
	 * Given an array of ints, is it possible to choose a group of some of the ints,
	 * such that the group sums to the given target, with this additional
	 * constraint: if there are numbers in the array that are adjacent and the
	 * identical value, they must either all be chosen, or none of them chosen. For
	 * example, with the array {1, 2, 2, 2, 5, 2}, either all three 2's in the
	 * middle must be chosen or not, all as a group. (one loop can be used to find
	 * the extent of the identical values).
	 * 
	 * groupSumClump(0, [2, 4, 8], 10) → true groupSumClump(0, [1, 2, 4, 8, 1], 14)
	 * → true groupSumClump(0, [2, 4, 4, 8], 14) → false
	 */

	public static void main(String[] args) {

		int[] arr1 = { 2, 4, 8 };
		boolean result1 = groupSumClump(0, arr1, 14);
		System.out.println(result1);

		int[] arr2 = { 1, 2, 4, 8, 1 };
		boolean result2 = groupSumClump(0, arr2, 14);
		System.out.println(result2);

		int[] arr3 = { 2, 4, 4, 8 };
		boolean result3 = groupSumClump(0, arr3, -2);
		System.out.println(result3);
		
	}

	public static boolean groupSumClump(int begin, int[] nums, int target) {
	
		  if (begin==nums.length) { 
			  return target==0;
		  }
		  
		  for(int i=begin,j=nums[i];i<nums.length-2 && j==nums[i+1];i++){
		    nums[begin]+=nums[i+1];
		    nums[i+1]=0;
		  }
		  
		  if (groupSumClump(begin+1, nums, target-nums[begin])) {
			  return true;
		  }
		  
		  if (groupSumClump(begin+1, nums, target)) {
			  return true;
		  }
		  return false;
	}
}