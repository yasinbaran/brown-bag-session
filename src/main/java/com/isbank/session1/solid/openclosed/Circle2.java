package com.isbank.session1.solid.openclosed;

public class Circle2 implements Shape {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return (radius * radius * Math.PI);
	}

}
