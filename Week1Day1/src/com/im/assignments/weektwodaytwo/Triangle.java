package com.im.assignments.weektwodaytwo;

/**
 * Week 1, Day 2 assignment
 * Triangle implements Shape
 * @author Isaac Manayath
 */

public class Triangle implements Shape {
	
	//values to calculate area
	public double base;
	public double height;
	
	//constructor
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	//calculator area
	public double calculateArea() {
		return (this.base*this.height)/2;
	}

	//display area
	public void display() {
		System.out.println("The triangle has a base of " + this.base + " and a height of " + this.height + ". The area of the triangle is " + this.calculateArea() + "."); 
	}

}
