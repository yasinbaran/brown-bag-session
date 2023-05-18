package com.isbank.session1.solid.liskovsubstition;

import static org.junit.Assert.*;

import org.junit.Test;

public class testRectangleArea {

	@Test
	public void testRectange() {
		Rectangle rectangle = new Rectangle();
		rectangle.setLength(20);
		rectangle.setHeight(4);
		assertEquals(80, rectangle.getArea());
	}

	// @Test
	public void testSquare() {
		Rectangle rectangle = new Square();
		rectangle.setLength(4);
		rectangle.setHeight(4);
		assertEquals(16, rectangle.getArea());
	}

	// matematiksel olarak doğru fakat davranışsal olarak kare dikdörtgenden
	// farklıdır.

	// @Test
	public void testRectange2() {
		Shape rectangle = new Rectangle2(10, 5);
		assertEquals(50, rectangle.getArea());
	}

	// @Test
	public void testSquare2() {
		Shape square = new Square2(5);
		System.out.println(square.getArea());
		assertEquals(25, square.getArea());
	}

}
