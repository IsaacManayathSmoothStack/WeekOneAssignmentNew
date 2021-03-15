package com.im.assignments.week1assignment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Week 1, Week 1 Assignment Assignment 4, Functional
 * 
 * @author Isaac Manayath
 */

public class Assignment4 {

//Given a list of strings, return a list where each string has all its "x" removed.
//noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
//noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
//		noX(["x"]) → [""]

	public static void main(String[] args) {
		List<String> list = new LinkedList();
		list.add("axaxax");
		list.add("bbbbb");
		list.add("xbxbxbxbxbxb");
		List<String> result = noX(list);
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}

	}

	/**
    *
    * @param generated a list to remove a x from the list
    * @return a list with no x
    */
	public static List<String> noX(List<String> strings) {
		strings.replaceAll(n -> n.replace("x", ""));
		return strings;
	}

}
