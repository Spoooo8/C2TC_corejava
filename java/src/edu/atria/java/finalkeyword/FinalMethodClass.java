package edu.atria.java.finalkeyword;

final public class FinalMethodClass {

	// constructor
	FinalMethodClass() {
		System.out.println("This is a final constructor...");
	}

	final int a = 50;

	// final method
	final void show() {
		System.out.println("Value of a:" + a);
	}
}

