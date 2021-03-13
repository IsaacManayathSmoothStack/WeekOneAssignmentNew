package com.im.assignments.weektwodaytwo;

/**
 * Week 1, Day 2 assignment
 * Rectangle implements Shape
 * @author Isaac Manayath
 */

public class Rectangle implements Shape{
	
	//values to calculate area
	public double length;
	public double width;
	
	//constructor
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	//calculate area
	public double calculateArea() {
		return this.length*this.width;
	}
	
	//display area
	public void display() {
		System.out.println("The rectangle has a length of " + this.length + " and a width of " + this.width + ". The area of the rectangle is " + this.calculateArea() + "." );
	}

}