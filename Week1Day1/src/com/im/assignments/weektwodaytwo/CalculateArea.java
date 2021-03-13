package com.im.assignments.weektwodaytwo;

/**
 * Week 1, Day 2 assignment
 * Calculate shapes' areas
 * @author Isaac Manayath
 */

public class CalculateArea {
	
	public static void main(String [] args) {
	
		//get rectangle area
		Rectangle rectangle = new Rectangle(4.0, 5.0);
		rectangle.display();
	
		//get triangle area
		Triangle triangle = new Triangle(3., 5.0);
		triangle.display();
		
		//get circle area
		Circle circle = new Circle(5.0);
		circle.display();
	}
	
}
