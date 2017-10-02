package com.yutong;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestIsTriangle {

	Triangle triangle = new Triangle(3, 3, 3);

	@Test
	public void isTriangle() {
		/*
		 * This method checks whether a triangle is valid: the sum of the length
		 * of any two edges should be greater than the length of the third edge.
		 */
		int diff1 = triangle.getEdge1() + triangle.getEdge2()
				- triangle.getEdge3();
		int diff2 = triangle.getEdge2() + triangle.getEdge3()
				- triangle.getEdge1();
		int diff3 = triangle.getEdge1() + triangle.getEdge3()
				- triangle.getEdge2();
		assertTrue("It is NOT a triangle.", diff1 > 0 && diff2 > 0 && diff3 > 0);
	}
}
