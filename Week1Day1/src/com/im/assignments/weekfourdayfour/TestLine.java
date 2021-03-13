package com.im.assignments.weekfourdayfour;

/**
 * Week 1, Day 4 assignment
 * Testing the line class before tjunit
 * @author Isaac Manayath
 */


public class TestLine {
	
	public static void main(String [] args) {
		Line line = new Line(2, 3, 4, 5);
		
		System.out.println("Slope: " + line.getSlope());
		System.out.println("Distance: " + line.getDistance());
		System.out.println("Parallel: " + line.parallelTo(new Line(2.0, 3.0, 4.0, 5.0)));
	}

}
