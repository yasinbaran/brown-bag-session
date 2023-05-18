package com.isbank.session1.solid.liskovsubstition;

public class Square2 implements Shape {

	private int size;

	public Square2(int size) {
		this.size = size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public int getArea() {
		return size * size;
	}

}
