package com.isbank.session1.solid.liskovsubstition;

public class Square extends Rectangle {

	public void setWidth(int height, int length) {
		super.setLength(length);
		super.setHeight(height);
	}

	public void setHeight(int height, int length) {
		super.setHeight(height);
		super.setLength(length);
	}

}
