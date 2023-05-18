package com.isbank.session1.solid.openclosed;

import java.util.List;

public class AreaService {

	// dikdörtgenin alanını hesaplıyor
	public double calculateArea(List<Rectangle> shapes) {
		double area = 0;
		for (Rectangle rect : shapes) {
			area += (rect.getLength() * rect.getHeight());
		}
		return area;
	}

	// hem dikdörtgen hem dairenin alanını hesaplıyor, yeni şekiller de gelirse?
	public double calculateArea(List<Object>... shapes) {
		double area = 0;
		for (Object shape : shapes) {
			if (shape instanceof Rectangle) {
				Rectangle rect = (Rectangle) shape;
				area += (rect.getLength() * rect.getHeight());
			} else if (shape instanceof Circle) {
				Circle circle = (Circle) shape;
				area += circle.getRadius() * circle.getRadius() * Math.PI;
			} else {
				throw new RuntimeException("Shape not supported");
			}
		}
		return area;
	}
	
//    public double calculateArea(List<Shape> shapes) {
//        double area = 0;
//        for (Shape shape : shapes) {
//            area += shape.getArea();
//        }
//        return area;
//    }

}
