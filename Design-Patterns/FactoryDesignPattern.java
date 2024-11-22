package com.patterns;

public class FactoryDesignPattern {

	public static void main(String[] args) {
		Shape circle= ShapeFactory.getShape("Circle");
		circle.draw();
		Shape Rectangle= ShapeFactory.getShape("Rectangle");
		Rectangle.draw();
		Shape square= ShapeFactory.getShape("Square");
		square.draw();
	}
}
