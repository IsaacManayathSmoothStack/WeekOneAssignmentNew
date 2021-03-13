package com.im.assignments.weektwodaytwo;

/**
 * Week 1, Day 2 assignment
 * Circle implements Shape
 * @author Isaac Manayath
 */

public class Circle implements Shape {
	
	//calculate value
	public double radius;
	
	//constructor
	public Circle(double radius) {
		this.radius = radius;
	}

	//calculate area
	public double calculateArea() {
		return Math.PI*Math.pow(radius, 2);
	}

	//display circle
	public void display() {
		System.out.println("The circle has a radius of " + this.radius + ". The area of the circle is " + this.calculateArea() + ".");
	}

}
