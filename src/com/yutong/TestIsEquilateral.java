package com.yutong;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestIsEquilateral {

	Triangle triangle = new Triangle(3, 3, 3);

	@Test
	public void isEquilateral() {
		/*
		 * This method checks whether the length of the three edges are
		 * identical
		 */
		assertTrue(
				"It is NOT equilateral.",
				triangle.getEdge1() == triangle.getEdge2()
						&& triangle.getEdge2() == triangle.getEdge3());
	}
}
