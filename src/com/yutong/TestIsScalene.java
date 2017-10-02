package com.yutong;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestIsScalene {

	Triangle triangle = new Triangle(3, 4, 5);

	@Test
	public void isScalene() {
		/*
		 * This method checks whether the three edges have different length from
		 * each other
		 */
		assertTrue(
				"It is NOT scalene.",
				triangle.getEdge1() != triangle.getEdge2()
						&& triangle.getEdge2() != triangle.getEdge3()
						&& triangle.getEdge1() != triangle.getEdge3());
	}
}
