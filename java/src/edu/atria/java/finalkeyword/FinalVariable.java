package edu.atria.java.finalkeyword;

public class FinalVariable {
	// final int x; final instance variable must be initialized

	final int x = 100;

	// declare a static and final variable
	final static int y; // shd also be initialized

	// declare and initialize static final variable
	final static int z = 10;

	// instance method
	void change() {
		// x = 10; final variables cannot be reassigned
		// y = 500; final static variable cannot be reassigned
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + ", y" + y + "]";
	}

	// declare a static block and initialize the final static variable
	static {
		y = 20;
		// z= 100; cannot be reassigned
		System.out.println("The value of y" + y);
	}
}