package edu.atria.java.abstraction;

public abstract class Shape {
	
	float area;
	
	//abstract method
	public abstract float calculateArea();
	
	//non abstract method
	public void display() {
		System.out.println("Area of the shape:" + area);
	}
}
