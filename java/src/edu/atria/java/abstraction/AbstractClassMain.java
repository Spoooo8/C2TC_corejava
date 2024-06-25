package edu.atria.java.abstraction;

public class AbstractClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cannot create instance for abstract class
		//Shape s = new Shape(2.0f);
		
		Shape sOne = new Square(2.5f);
		sOne.calculateArea();
		sOne.display();
		
		Shape sTwo = new Rectangle(4,2.5f);
		sTwo.calculateArea();
		sTwo.display();
	}

}
