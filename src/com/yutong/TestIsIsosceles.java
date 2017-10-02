package com.yutong;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestIsIsosceles {

	Triangle triangle = new Triangle(3, 3, 3);

	@Test
	public void isIsosceles() {
		/*
		 * This method checks whether exactly two edges have the same length
		 */
		assertTrue(
				"It is NOT isosceles.",
				triangle.getEdge1() == triangle.getEdge2()
						|| triangle.getEdge2() == triangle.getEdge3()
						|| triangle.getEdge1() == triangle.getEdge3());

	}
}
