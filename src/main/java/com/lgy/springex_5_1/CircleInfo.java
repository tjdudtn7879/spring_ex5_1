package com.lgy.springex_5_1;

public class CircleInfo {
	private Circle circle;
	
	public CircleInfo(Circle circle) {
		this.circle = circle;
	}

	public void getCircleInfo() {
		if (circle != null) {
		System.out.println("반지름 : "+circle.getRadius());
		System.out.println("원의 면적은 : "+circle.process());
		}
	}
	
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
}
