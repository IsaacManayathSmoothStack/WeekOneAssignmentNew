package com.im.assignments.weekfourdayfour;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Week 1, Day 4 assignment
 * junit test of line class
 * @author Isaac Manayath
 */


public class LineTest {
	
	Line line = new Line(2, 3, 4, 5);
	Line lineParallelTest = new Line(2.0, 3.0, 4.0, 5.0);

	@Test
	public void getSlopeTest() {
		assertEquals(line.getSlope(), 1, 0.0001);
	}
	
	@Test
	public void getDistanceTest() {
		assertEquals(line.getDistance(), 2.8284271247461903, 0.0001);
	}

	@Test
	public void getParallelToTest() {
		assertTrue(line.parallelTo(lineParallelTest));
	}

	
}





