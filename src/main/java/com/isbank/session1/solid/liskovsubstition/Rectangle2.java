package com.isbank.session1.solid.liskovsubstition;

public class Rectangle2 implements Shape {
	private int length;
	private int height;

	public Rectangle2(int length, int height) {
		this.length = length;
		this.height = height;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public int getArea() {
		return (length * height);
	}
}
